public class Card {
    public String suit;
    public int value;
    public String name;
    public boolean isDealt;
    public Card(int pSuit, int pName){
        if(pSuit == 0){
            suit = "Diamond";
        }
        if(pSuit == 1){
            suit = "Club";
        }
        if(pSuit == 2){
            suit = "Heart";
        }
        if(pSuit == 3){
            suit = "Spade";
        }
        
    }
}