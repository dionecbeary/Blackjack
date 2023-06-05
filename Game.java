public class Game {
    public Card[] deck;
    public static void main(String[] args) {
        Game myGame;
        myGame = new Game();
    }
    public Game(){
        System.out.println("Game Constructor");
        deck = new Card[52];
        int curr=0;
        for (int suit = 1; suit < 5; suit++){
            for(int name = 1; name < 14; name++){
                deck[curr]= new Card(suit, name);
                curr++;
            }
        }
        System.out.println("Shuffled deck:");
        shuffle();
        printDeck();
    }
    public void shuffle(){
        Card[] shuffledDeck = new Card[52];
        for(int f = 0; f < shuffledDeck.length; f++){
            int randomCard = (int)(Math.random()*52);
            while(deck[randomCard].isDealt == true) {
                randomCard = (int) (Math.random() * 52);
            }
            shuffledDeck[f] = deck[randomCard];
            deck[randomCard].isDealt = true;
        }
        deck = shuffledDeck;
        printDeck();
    }
    public void printDeck(){
        for(int i = 0; i < deck.length; i ++){
            System.out.println(deck[i].name +" of "+deck[i].suit);
        }
    }
}