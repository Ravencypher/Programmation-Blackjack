import java.util.ArrayList;

public class Hand {
    private Card [] hand;
    private String user;
    //Soit le joueur soit le croupier. Selon comment on appelle le constructeur et le paramètre quand utilisé
    
    public Hand(String user) {
        this.user = user;
    }
    
	//retourne le tableau hand
    public Card[] getCards() {
        return this.hand;
    }
    
	// retourne la somme des cartes dans le tableau hand. Si la somme est >21, il faut recompter les cartes pour vérifier si il y a un ACE. Si oui on le considère comme 1, sinon on ajoute la somme des points
    public int getPoints() {
        int total = 0;
        for(Card card: hand)
            total = total + card.getPoints ();
        if (total > 21){
            total = 0;
            for(Card card: hand){
                if( card.isAce () ){
                    total = total +1;
                }else{
                    total = total + card.getPoints ();
                }
            }
        }
        return total;

    }
    
	// ajouter une carte au tableau
    public void addCard(Card card) {

    }
    
	//retourne true si la somme de deux cartes est égale à 21. False sinon
    public boolean isBlackjack() {
    //if else
        if(this.getPoints () == 21 && this.hand.length == 2){
            return true;
        }else{
            return false;
        }
    }
    
	// retourne true si la somme des points a une valeur supérieur à 21. False sinon.
    public boolean isBust() {

    }

}