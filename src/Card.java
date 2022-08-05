public class Card {
    private final String suite; // Spades", "Hearts", "Clubs" ou "Diamonds"
    private final String rank;//2, 3, 4, ..., 10,  
    private final int points; 
    
    public Card(String suite, String rank, int points) {
        //String[] suite = {"Clubs", "Diamonds", "Hearts", "Spades"};
        //String[] rank = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" ,"Jack", "Queen", "King", "Ace"};
        //int points = faire un tableau d'objets cad jack = 10, queen = 10 etc.

        String[] suite = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" ,"Jack", "Queen", "King", "Ace"};
        //ensuite faire une conversion de "Jack", "Queen" et "King a 10 et "Ace" a 11 || 1
    }
    
    public Card(Card c) {
        //variables d'instances
        //this is where we will loop for both suites and ranks
        //instead of i, we will use c
        //results will be called valeur_rank_variable & valeur_suite_variable
    }
    
    public String getSuite() {
        //getter résultat récupérer la suite
        return suite;
    }
    
    public String getRank() {
        //getter récupérer le rank
        return rank;
    }
    
    public int getPoints() {
        //getter récupérer la valeur de rank en point
        return points;
    }
    
	//qui retourne true si la carte est un Ace 
    public boolean isAce() {
    //si Ace = true, sinon fuck off
        this.isAce = true;
        return isAce;
    }
    
	//retourne une chaine de caractère : Valeur_rank_variable + " of " + valeur_suite_variable. Par exemple : 3 of Hearts 
    public String display() {
        //sout Valeur_rank + " of " + valeur_suite
        System.out.println (valeur_rank_variable + " of " + valeur_suite_variable);
    }
}