package PlayingCards;

public class Card {
    private String value;
    private String suit;
    
    public String getSuit(){
        return suit;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public Card(String suit, String value){
        this.setValue(value);
        this.setSuit(suit);
    }

    public String printCard(){
        String message = value + " of " + suit;
        return message;
    }

    public static boolean sameCard(Card first, Card second){
        if (first.suit.equals(second.suit)){
            if(first.value.equals(second.value)){
                return true;
            }
        }
        return false;
    }

    public static void compareCard(Card first, Card second){
        if(sameCard(first, second)){
            System.out.println("The two cards are exactly the same.");
        }
        else if (first.suit.equals(second.suit)){
            System.out.println("The two cards have the same suit.");
        }
        else if (first.value.equals(second.value)){
            System.out.println("The two cards have the same suit.");
        }
    }
}
