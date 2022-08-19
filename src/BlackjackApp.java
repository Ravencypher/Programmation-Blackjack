import java.util.Scanner;

public class BlackjackApp {
    private static BlackjackGame game;

    public static void main (String[] args) {
        System.out.println ( "BLACKJACK!" );
        System.out.println ( "Blackjack payout is 3:2 \n\n" );
        String playAgain = "y";
        while ( playAgain.equalsIgnoreCase ( "y" ) ) {
//             votre scenario de simulation vient ici
            game = new BlackjackGame ();

            //showMoney ();
            Scanner scanner = new Scanner ( System.in );
            game.deal ();
            showHands ();
            int betAmount = scanner.nextInt ();
            //getBetAmount ();

        }
        System.out.println ( "\nBye!" );
    }

    // affiche le message Out of money! Would you like to add more? (y/n):. Si le joueur tappe y alors la fonction reset la balance du joueur au 100 et retourne true. False Sinon.
    private static boolean buyMoreChips () {
        System.out.println ( "You are out of Money! \nWould you buy more? (Press y or n) : " + game.something );
        if ( "y" )
            return true;
        else
            return false;
    }

    // affiche le message Bet amount, lire la valeur de la mise saisi par le joueur. Valide cette valeur. Si la valeur n'est pas valide afficher le message Bet must be between
    private static void getBetAmount () {
        System.out.println ( "Bet amount : " + game.betAmount );
        while ( !game.isValidBet ( game.setBet ( amt ) ) ) {
            System.out.println ( "Bet must be between $5 and $1000!" );
        }
    }

    // Affiche le message Hit or Stand? (h/s): et puis retourne ce que le joueur a tappe.
    private static String getHitOrStand () {
        System.out.println ( "Do you wish to Hit or Stand? (Press h or s) : " + game.something );
        if ( "h" ) {
            game.hit ();
            return answer;
        } else
            game.stand ();
        return answer;
    }

    // affiche les cartes dans la main du croupier et les cartes dans la main du joueur
    private static void showHands () {
        showPlayerHand ();
        System.out.println ();
        showDealerHand ();
    }

    // affiche le message DEALER'S SHOW CARD et puis affiche le deuxieme carte dans la main du croupier
    private static void showDealerShowCard () {
        System.out.println ( game.getDealerShowCard ().display () );
    }

    // affiche le message DEALER'S CARDS et puis affiche les cartes dans la main du croupier
    private static void showDealerHand () {
        System.out.println ( "DEALER'S CARDS" );
        for (Card card : game.getDealerHand ().getCards ()) {
            if ( card != null )
                System.out.println ( card.display () );
        }
    }

    // affiche le message YOUR CARDS et puis affiche les cartes dans la main du joueur
    private static void showPlayerHand () {
        System.out.println ( "YOUR CARDS" );
        for (Card card : game.getPlayerHand ().getCards ()) {
            if ( card != null )
                System.out.println ( card.display () );
        }
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
