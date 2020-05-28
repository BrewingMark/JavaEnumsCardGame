import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(CardSuit.HEARTS, CardRank.TEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(CardSuit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(CardRank.TEN, card.getRank());
    }

    @Test
    public void queenHasValueTen(){
        card = new Card(CardSuit.HEARTS, CardRank.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

}


