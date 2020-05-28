import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Card card1, card2;
    ArrayList<Card> cards = new ArrayList<Card>();

    @Before
    public void before(){
        card1 = new Card(CardSuit.HEARTS,CardRank.ACE);
        card2 = new Card(CardSuit.CLUBS,CardRank.SEVEN);
        deck = new Deck(cards);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getDeck().size());
    }

    @Test
    public void canAddCard(){
        deck.addCard(card1);
        assertEquals(1, deck.getDeck().size());
    }

    @Test
    public void canPopulateDeck(){
        deck.populate();
        assertEquals(52, deck.getDeck().size());
    }

    @Test
    public void canShuffleDeck(){
        deck.populate();
        Card testCard = deck.getDeck().get(0);
        ArrayList<Card> shuffledDeck = deck.shuffle();
        assertNotEquals(testCard, shuffledDeck.get(0));
    }

    @Test
    public void canDealCard(){
        deck.populate();
        deck.shuffle();
        deck.deal();
        assertEquals(51, deck.getDeck().size());
    }

}
