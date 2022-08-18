import java.util.ArrayList;

public class Hand {
    private Card [] hand;
    private String user;
    private static int counter = 0;

    public Hand(String user) {
        this.user = user;
        this.hand = new Card[10];
    }

    //retourne le tableau hand
    public Card[] getCards() {
        return this.hand;
    }

    // retourne la somme des cartes dans le tableau hand. Si la somme est >21, il faut recompter les cartespour
    // vérifier si il y a un ACE. Si oui on le considère comme 1, sinon on ajoute la somme des points
    public int getPoints() {
        int total = 0;
        for(Card card: hand)
            total = total + card.getPoints();
        if (total > 21){
            total = 0;
            for(Card card: hand){
                if( card.isAce() ){
                    total = total +1;
                } else {
                    total = total + card.getPoints();
                }
            }
        }
        return total;
    }

    // ajouter une carte au tableau
    public void addCard(Card card) {
        this.hand[counter] = card;
        counter++;
//        hand.add(card);
//        ARRAY LIST ICI
    }
    public boolean isBlackjack() {
        if(this.getPoints() == 21 && this.hand.length == 2){
            return true;
        }else{
            return false;
        }
    }
    public boolean isBust() {
        if(this.getPoints() > 21)
            return true;
    else
        return false;
    }
}