public class Card {
    public String suit;
    public int value;
    public String name;
    public boolean isDealt;


    public Card(int pSuit, int pName) {
        if (pSuit == 1) {
            suit = "Diamond";
        }
        if (pSuit == 2) {
            suit = "Club";
        }
        if (pSuit == 3) {
            suit = "Heart";
        }
        if (pSuit == 4) {
            suit = "Spade";
        }
        switch (pName) {
            case 1:
                name = "Ace";
                value = 11;
                break;
            case 2:
                name = "2";
                value = 2;
                break;
            case 3:
                name = "3";
                value = 3;
                break;
            case 4:
                name = "4";
                value = 4;
                break;
            case 5:
                name = "5";
                value = 5;
                break;
            case 6:
                name = "6";
                value = 6;
                break;
            case 7:
                name = "7";
                value = 7;
                break;
            case 8:
                name = "8";
                value = 8;
                break;
            case 9:
                name = "9";
                value = 9;
                break;
            case 10:
                name = "10";
                value = 10;
                break;
            case 11:
                name = "Jack";
                value = 10;
                break;
            case 12:
                name = "Queen";
                value = 10;
                break;
            case 13:
                name = "King";
                value = 10;
                break;
        }
        System.out.println(name+" of "+suit);
    }
}