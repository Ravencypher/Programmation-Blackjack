import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BlackjackGame {
    private final Hand playerHand;
    private final Hand dealerHand;
    private final Deck deck;
    private double betAmount;
    private final double minBet;
    private final double maxBet;
    private double totalMoney;
    
	//Initialiser deck, playerHand, dealerHand, minBet et maxBet
	//le minimum et le maximum de la mise sont de 5 et 1000 respectivement.
    public BlackjackGame() {

        //Voir TP1 minbet = 5 , maxbet = 1000

        /* Scanner sc = new Scanner ( System.in );
        double startingMoney = Double.parseDouble ( sc.nextLine () );
        NumberFormat currency = NumberFormat.getCurrencyInstance ( Locale.CANADA);
        String choice = "y"; */

        /*while ( startingMoney < 5 || startingMoney > 1000 ) {
        System.out.println ( "Starting money must be between $5.00 and $10,000.00" );
        System.out.print ( "Starting money : " );
        startingMoney = Double.parseDouble ( sc.nextLine () );
        }*/
    } 
    
    public void loadMoney() {
        totalMoney = 100;
    } 
    
	//retourne true le total d’argent dont un joueur dispose est inférieur au minimum de mise. False sinon.
    public boolean isOutOfMoney() {
        //Si le pot est inférieur à la mise c'est true, sinon false.

    }

	// pour initialiser totalMoney a 100
    public void resetMoney() {
    }
    
	//retourne false si double localBetAmt est inférieur au minBet ou supérieur au maxBet ou supérieur au totalMoney. True sinon.
    public boolean isValidBet(double localBetAmt) {
    }
    
	//retourner minBet
    public double getMinBet() {  
    }
    
	//retourner le montant total que le joueur peut l'utiliser pour la mise.
    public double getMaxBet() {
    }
    
	// pour retourner le montant total
    public double getTotalMoney() {    
    }
    
	//pour initialiser le montant de la mise qu'on va faire
    public void setBet(double amt) {   
    }
    
	// distribue deux cartes pour le joueur (playerHand) et deux cartes pour le croupier (dealerHand).
    public void deal() {
        //Va dans la partie card
    }
    
	//pour distribuer une carte en plus pour le joueur dans le cas où il fait hit.
    public void hit() {
        //Va dans la partie card
    }
    
	//qui ajoute des cartes à la main du croupier tant que la somme des points dont il dispose est inférieur à 17.
    public void stand() {
        // if total > 17 = ajoute des cartes Else stop it bro.
    }
    
	//retourne la deuxième carte dans la main du croupier.
    public Card getDealerShowCard() {
     }
    
	//retourne dealerHand
    public Hand getDealerHand() {
    }

	//retourne playerHand
    public Hand getPlayerHand() {

    }
    
	// ice cream
    public boolean isBlackjackOrBust() {
        if(playerHand.isBlackjack() || playerHand.isBust() 
                || dealerHand.isBlackjack() || dealerHand.isBust()) {
            return true;
        } else{
            return false;
        }
    }
    
	//retourne true si les points dans la main de joueur est inférieur ou égale 21 et ces points sont égales aux points avec le courtier. False sinon.
    public boolean isPush() {
        //ref tp1
    }
    
	
	//retourne true si le player gagne. False sinon.
    public boolean playerWins() {
        //ref tp1
    }
    
	// ajoute le montant du mise gagner au montant total
    public void addBetToTotal() {
        //ref tp1
    }
    
	// ajoute le montant de mise gagner selon 3:2 au montant total dans le cas de blackjack
    public void addBlackjackToTotal() {
        //ref tp1
    }
    
	// soustraire le montant du bet perdu du montant total
    public void subtractBetFromTotal() {
        //ref tp1
    }

}
