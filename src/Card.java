public class Card {
    private final String suite; // Spades", "Hearts", "Clubs" ou "Diamonds"
    private final String rank;//2, 3, 4, ..., 10,  
    private final int points;

    public Card(String suite, String rank, int points) {
        this.suite = suite;
        this.rank = rank;
        this.points = points;

        //int points = faire un tableau d'objets cad jack = 10, queen = 10 etc.
    }

    public Card(Card c) {
        this.suite = c.suite;
        this.rank = c.rank;
        this.points = c.points;
    }

    public String getSuite() {
        return suite;
    }

    public String getRank() {
        return rank;
    }

    public int getPoints() {
        return points;
    }

    public boolean isAce() {
        if(rank.equalsIgnoreCase ("ace")) {
            return true;
        }else{
            return false;
        }
    }


    public String display() {
        //sout Valeur_rank + " of " + valeur_suite
        return this.rank + " of " + this.suite;
    }
}