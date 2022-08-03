public class Card {
    private final String suite; // Spades", "Hearts", "Clubs" ou "Diamonds"
    private final String rank;//2, 3, 4, ..., 10,  
    private final int points; 
    
    public Card(String suite, String rank, int points) {
    }
    
    public Card(Card c) {
    }
    
    public String getSuite() {
    }
    
    public String getRank() {
    }
    
    public int getPoints() {
    }
    
	//qui retourne true si la carte est un Ace 
    public boolean isAce() {

    }
    
	//retourne une chaine de caractère : Valeur_rank_variable + " of " + valeur_suite_variable. Par exemple : 3 of Hearts 
    public String display() {
    }
}