package PlayingCards;


public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printDeck();
        Card c1 = new Card("Hearts", "A"), c2 = new Card("Spades", "3");
        Card.compareCard(c1, c2);
        deck.findCard(c2);
        deck.dealCard();
        deck.shuffleDeck();
        deck.printDeck();
    }
}
