import java.util.Scanner;

public class BlackjackApp {
    private static BlackjackGame game;

    public static void main (String[] args) {
        System.out.println ( "BLACKJACK!" );
        System.out.println ( "Blackjack payout is 3:2 \n\n" );
        String playAgain = "y";
        game = new BlackjackGame ();
        while ( playAgain.equalsIgnoreCase ( "y" ) ) {
            showMoney ();

            if (game.isOutOfMoney ()){
                if (buyMoreChips () == false)
                    break;
            }


            getBetAmount ();

            game.deal ();
            showDealerShowCard ();
            showPlayerHand ();

            System.out.printf ( "Your points: %d%n", game.getPlayerHand ().getPoints () );
            while ( getHitOrStand ().equalsIgnoreCase ( "h" ) ) {
                game.hit ();
                if ( game.isBlackjackOrBust () )
                    break;
                showPlayerHand ();
                System.out.printf ( "Your points: %d%n", game.getPlayerHand ().getPoints () );
            }

            game.stand ();
            showWinner ();
            playAgain = Console.getString ( "Continue? (y/n):", new String[]{"y", "n"} );
            game.resetHands ();

        }
        System.out.println ( "\nBye!" );
    }

    // affiche le message Out of money! Would you like to add more? (y/n):. Si le joueur tappe y alors la fonction reset la balance du joueur au 100 et retourne true. False Sinon.
    private static boolean buyMoreChips () {
        String addMore = Console.getString ("You are out of Money! \nWould you buy more? (Press y or n) : ", new String[]{"y", "n"}  );

        if ( addMore.equalsIgnoreCase ( "y" ) ) {
            game.resetMoney ();
            return true;
            //peut être utiliser console.
        } else {
            return false;
        }
    }

    // affiche le message Bet amount, lire la valeur de la mise saisi par le joueur. Valide cette valeur. Si la valeur n'est pas valide afficher le message Bet must be between
    private static void getBetAmount () {
        double betAmount = Console.getDouble ( "Bet amount :", game.getMinBet (), Math.min ( game.getMaxBet (), game.getTotalMoney () ));
        game.setBet ( betAmount );
    }

    // Affiche le message Hit or Stand? (h/s): et puis retourne ce que le joueur a tapé.
    private static String getHitOrStand () {
        return Console.getString ( "Do you wish to Hit or Stand? (Press h or s) : ", new String[]{"h", "s"} );
    }

    // affiche les cartes dans la main du croupier et les cartes dans la main du joueur
    private static void showHands () {
        showPlayerHand ();
        System.out.println ();
        showDealerHand ();
    }

    // affiche le message DEALER'S SHOW CARD et puis affiche le deuxieme carte dans la main du croupier
    private static void showDealerShowCard () {
        System.out.println ( "DEALER'S SHOW CARD" );
        System.out.println ( game.getDealerShowCard ().display () );
        System.out.println ( );
    }

    // affiche le message DEALER'S CARDS et puis affiche les cartes dans la main du croupier
    private static void showDealerHand () {
        System.out.println ( "DEALER'S CARDS" );
        for (Card card : game.getDealerHand ().getCards ()) {
            if ( card != null )
                System.out.println ( card.display () );
        }
        System.out.println ( );
    }

    // affiche le message YOUR CARDS et puis affiche les cartes dans la main du joueur
    private static void showPlayerHand () {
        System.out.println ( "YOUR CARDS" );
        for (Card card : game.getPlayerHand ().getCards ()) {
            if ( card != null )
                System.out.println ( card.display () );
        }
        System.out.println ( );
    }


    // affiche Total money:  et le montant total
    private static void showMoney () {
        System.out.println ( "Total Money is : " + game.getTotalMoney () );
    }

    private static void showWinner () {
        showPlayerHand ();
        System.out.printf ( "YOUR POINTS: %d%n", game.getPlayerHand ().getPoints () );
        showDealerHand ();
        System.out.printf ( "DEALER'S POINTS: %d%n%n", game.getDealerHand ().getPoints () );
        if ( game.isPush () ) {
            System.out.println ( "Push!" );
        } else if ( game.getPlayerHand ().isBlackjack () ) {
            System.out.println ( "BLACKJACK! You win!" );
            game.addBlackjackToTotal ();
        } else if ( game.playerWins () ) {
            System.out.println ( "You win!" );
            game.addBetToTotal ();
        } else {
            System.out.println ( "Sorry, you lose." );
            game.subtractBetFromTotal ();
        }
        showMoney ();
        game.saveMoney ();
    }
}