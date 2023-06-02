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
        if(pName == 0){
            value = 1;
        }
        if(pName == 1){
            value = 2;
        }
        if(pName == 2){
            value = 3;
        }
        if(pName == 3){
            value = 4;
        }
        if(pName == 4){
            value = 5;
        }
        if(pName == 5){
            value = 6;
        }
        if(pName == 6){
            value = 7;
        }
        if(pName == 7){
            value = 8;
        }
        if(pName == 8){
            value = 9;
        }
        if(pName == 9){
            value = 10;
        }
        if(pName == 10){
            value = 10;
        }
        if(pName == 11){
            value = 10;
        }
        if(pName == 12){
            value = 10;
        }
        if(pName == 13){
            value = 10;
        }

    }
}