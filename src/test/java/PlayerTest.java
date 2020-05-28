import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Card card1;

    @Before
    public void before(){
        player1 = new Player("Jane Smith");
        card1 = new Card(CardSuit.HEARTS,CardRank.ACE);
    }

    @Test
    public void playerHasName(){
        assertEquals("Jane Smith", player1.getName());
    }

    @Test
    public void playersHandStartsEmpty(){
        assertEquals(0, player1.getHand().size());
    }

    @Test
    public void canAddCardToHand(){
        player1.addCard(card1);
        assertEquals(1, player1.getHand().size());
    }

}
