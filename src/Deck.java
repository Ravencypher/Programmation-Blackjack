public class Deck {
    private Card[] deck;
    private int currentCardIndex;
    
	//stocke les cartes dans  Card[ ] deck et ensuite il appelle la fonction shuflleDeck(). 
    public Deck() {
        //Le deck vaut de 0 à 51
        //int deck = 51;
        //this.Deck = deck;
        //afterward do a loop that will remove the cards from the total?
    }
    
	//shuffleDeck, pour mélanger les cartes à l'aide de l'algorithme de mélange de Fisher-Yates:
	//https://www.geeksforgeeks.org/shuffle-a-given-array-using-fisher-yates-shuffle-algorithm/
    private void shuffleDeck() {
        //Lire docu // https://www.youtube.com/playlist?list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p
    }
    
    public Card drawCard() {
        if(currentCardIndex == 51) {
            Card currCard = deck[currentCardIndex];
            shuffleDeck();
            return currCard;
        }
        else {
            return deck[currentCardIndex++];        
        }
    }

}
