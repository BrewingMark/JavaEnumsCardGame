import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards = new ArrayList<Card> ();
    private CardSuit cardSuit;
    private CardRank cardRank;

    public Deck(ArrayList<Card> cards){
        this.cards = cards;
    }

    public ArrayList<Card> getDeck() {
        return this.cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void populate() {
        for (CardSuit suit : cardSuit.values()){
            for (CardRank rank : cardRank.values()){
                addCard(new Card(suit, rank));
            }
        }
    }

    public ArrayList<Card> shuffle() {
        ArrayList<Card> deck = (this.cards);
        Collections.shuffle(deck);
        return deck;
    }

    public void deal() {
        this.cards.remove(0);
    }
}
