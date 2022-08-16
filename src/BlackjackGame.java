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
        this.deck = new Deck();
        this.playerHand = new Hand("player");
        this.dealerHand = new Hand("dealer");
        this.minBet = 5.0;
        this.maxBet = 1000.0;
    }

    public void loadMoney() {
        totalMoney = 100;
    }

    //retourne true le total d’argent dont un joueur dispose est inférieur au minimum de mise. False sinon.
    public boolean isOutOfMoney() {
        if(this.totalMoney < this.minBet){
            return true;
        }else{
            return false;
        }
    }

    // pour initialiser totalMoney a 100
    public void resetMoney() {
        totalMoney = 100;
    }

    //retourne false si double localBetAmt est inférieur au minBet ou supérieur au maxBet ou supérieur au totalMoney. True sinon.
    public boolean isValidBet(double localBetAmt) {
        return false;
    }

    //retourner minBet
    public double getMinBet() {
        return minBet;
    }

    //retourner le montant total que le joueur peut l'utiliser pour la mise.
    public double getMaxBet() {
        return maxBet;
    }

    // pour retourner le montant total
    public double getTotalMoney() {
        return 0;
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
        return null;
    }

    //retourne dealerHand
    public Hand getDealerHand() {
        return null;
    }

    //retourne playerHand
    public Hand getPlayerHand() {
        return null;
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
        return false;
    }


    //retourne true si le player gagne. False sinon.
    public boolean playerWins() {
        //ref tp1
        return false;
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

//created this method because I had an error in BlackjackApp, line 73
    public void saveMoney () {
    }
}