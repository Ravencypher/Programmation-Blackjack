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
    public boolean isOutOfMoney() {
        if(this.totalMoney < this.minBet){
            return true;
        }else{
            return false;
        }
    }

    // pour initialiser totalMoney a 100
    public void resetMoney() {
        this.totalMoney = 100;
    }

    //retourne false si double localBetAmt est inférieur au minBet ou supérieur au maxBet ou supérieur au totalMoney. True sinon.
    public boolean isValidBet(double localBetAmt) {
        if (this.betAmount > this.minBet)
        return true;
        else
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
        return totalMoney;
    }

    public void setBet(double amt) {
        //pour initialiser le montant de la mise qu'on va faire
        int setBet = new betAmount;
    }

    public void deal() {
        // distribue deux cartes pour le joueur (playerHand) et deux cartes pour le croupier (dealerHand).
//        playerHand.addCard ( card 1 );
//        playerHand.addCard ( card 2 );
//        dealerHand.addCard ( card 1 );
//        dealerHand.addCard ( card 2 );
    }

    public void hit() {
        //pour distribuer une carte en plus pour le joueur dans le cas où il fait hit.
        if (player = yes)
            distribute card in playerHand;
        else
            stop;
    }

    public void stand() {
        //qui ajoute des cartes à la main du croupier tant que la somme des points dont il dispose est inférieur à 17.
        if (dealerHand < 17)
            distribute card in dealerHand;
        else
            stop;
    }

    public Card getDealerShowCard() {
        //show la deuxième carte dans la main du croupier.
        return dealerHand.addCard ( card 2 );
    }

    //retourne dealerHand
    public Hand getDealerHand() {
        return dealerHand;
    }

    //retourne playerHand
    public Hand getPlayerHand() {
        return playerHand;
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

    public boolean isPush() {
        //retourne true si les points dans la main de joueur est inférieur ou égale 21 et ces points sont égales aux points avec le courtier. False sinon.
        if (Integer.parseInt(this.playerHand) <= 21 || this.playerHand == this.dealerHand)
            return true;
        else
            return false;
    }

    public boolean playerWins() {
        //retourne true si le player gagne. False sinon.
        if(this.playerHand == 21)
            return true;
        else
        return false;
    }

    public void addBetToTotal() {
        // ajoute le montant du mise gagner au montant total
        totalMoney = totalMoney + betAmount;
    }

    public void addBlackjackToTotal() {
        // ajoute le montant de mise gagner selon 3:2 au montant total dans le cas de blackjack
        totalMoney = (totalMoney + betAmount) * 1.5;
    }

    public void subtractBetFromTotal() {
        // soustraire le montant du bet perdu du montant total
        totalMoney = totalMoney - betAmount;
    }

    public void saveMoney () {
        //created this method because I had an error in BlackjackApp, line 73
    }
}