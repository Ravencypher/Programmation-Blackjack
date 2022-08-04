public class Card {
    private final String suite; // Spades", "Hearts", "Clubs" ou "Diamonds"
    private final String rank;//2, 3, 4, ..., 10,  
    private final int points; 
    
    public Card(String suite, String rank, int points) {
        String[] suite = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" ,"Jack", "Queen", "King", "Ace"};
        //int points = faire un tableau d'objets cad jack = 10, queen = 10 etc.
    }
    
    public Card(Card c) {
        //variables d'instances
    }
    
    public String getSuite() {
        //getter résultat récupérer la suite
    }
    
    public String getRank() {
        //getter récupérer le rank
    }
    
    public int getPoints() {
        //getter récupérer la valeur de rank en point
    }
    
	//qui retourne true si la carte est un Ace 
    public boolean isAce() {
    //si Ace = true, sinon fuck off
    }
    
	//retourne une chaine de caractère : Valeur_rank_variable + " of " + valeur_suite_variable. Par exemple : 3 of Hearts 
    public String display() {
        //sout Valeur_rank + " of " + valeur_suite
    }
}