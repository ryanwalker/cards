package funwithcards;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PinochleCardDeckTest {

    private PinochleCardDeck pinochleCardDeck;

    @Before
    public void setup() {
        pinochleCardDeck = new PinochleCardDeck();
    }

    @Test
    public void newOrder() throws Exception {
        pinochleCardDeck.newOrder();
    }

    @Test
    public void testDeckSize() {
        Assert.assertEquals(pinochleCardDeck.getNumberOfCardsInDeck(), 48);
    }

}