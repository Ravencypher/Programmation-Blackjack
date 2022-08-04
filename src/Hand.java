import java.util.ArrayList;

public class Hand {
    private Card [] hand;
    private String user; //Soit le joueur soit le croupier. Selon comment on appelle le constructeur et le paramètre quand utilisé
    
    public Hand(String user) {
    }
    
	//retourne le tableau hand
    public Card[] getCards() {
    }
    
	// retourne la somme des cartes dans le tableau hand. Si la somme est >21, il faut recompter les cartes pour vérifier si il y a un ACE. Si oui on le considère comme 1, sinon on ajoute la somme des points
    public int getPoints() {
 //si ta main est supérieur à 21 et que tu as un As, alors ce dernier devient 1 et non 11. A Vérifier avec Ali.
    }
    
	// ajouter une carte au tableau
    public void addCard(Card card) {
    }
    
	//retourne true si la somme de deux cartes est égale à 21. False sinon
    public boolean isBlackjack() {
    //if else
    }
    
	// retourne true si la somme des points a une valeur supérieur à 21. False sinon.
    public boolean isBust() {
    //if else
    }

}