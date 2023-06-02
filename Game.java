public class Game {
    public Card[] deck;
    public static void main(String[] args) {
        Game myGame;
        myGame = new Game();
    }
    public Game(){
        System.out.println("Game Constructor");
        deck = new Card[52];
        for (int suit = 1; suit < 5; suit++){
            for(int name = 1; name < 14; name++){
                deck[13*(suit-1)+name]= new Card(suit, name);
            }
        }
    }
}