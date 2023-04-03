package PlayingCards;

import java.util.Collections;
import java.util.Vector;

public class Deck {
    private Vector<Card> cards = new Vector<Card>();
    private String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    private String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


    public Deck(){
        for(int i=0; i<suits.length; i++){
            for(int j=0; j<values.length; j++){
                this.cards.add(new Card(suits[i], values[j]));
            }
        }
    }

    public int findCard(Card search){
        for(Card inDeck: this.cards){
            if(Card.sameCard(search, inDeck)){
                return this.cards.indexOf(search);
            }
        }
        return -1;
    }
    
    public void dealCard(){
        for(int i=0; i<5; i++){
            int index = (int) (Math.random() * cards.size());
            cards.get(index).printCard();
        }
    }    

    public void shuffleDeck(){
        Collections.shuffle(cards);
        System.out.println("The Deck was shuffled.");
    }

    public void printDeck(){
        for(Card card: cards){
            System.out.println(card.printCard());
        }
    }
}
