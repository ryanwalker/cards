package funwithcards;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static funwithcards.CardType.*;
import static funwithcards.Suite.clubs;
import static funwithcards.Suite.spades;
import static org.junit.Assert.*;

public class CardDeckTest {

    CardDeck cardDeck;

    @Before
    @Test
    public void setup() {
        cardDeck = new CardDeck();
    }

    @Test
    public void testNewDeckSize() {
        Assert.assertEquals(cardDeck.cardsInDeck().size(), 52);
    }

    @Test
    public void shuffle() throws Exception {
    }

    @Test
    public void cut() throws Exception {

    }

    @Test(expected = IllegalArgumentException.class)
    public void cutNegative() {
        cardDeck.cut(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void cutTooHigh() {
        cardDeck.cut(55);
    }



    @Test
    public void dealHearts() throws Exception {
        Card card = cardDeck.deal();
        Assert.assertEquals(card.getSuite(), Suite.hearts);
    }

    @Test
    public void dealAce() throws Exception {
        Card card = cardDeck.deal();
        Assert.assertEquals(card.getCardType(), Ace);
    }

    @Test
    public void deckSizeAfterDeal() {
        Card card = cardDeck.deal();
        Assert.assertEquals(cardDeck.cardsInDeck().size(), 51);
    }

    @Test
    public void dealNoCardsAvailable() {
        CardDeck testDeck = CardDeck.testDeck();
        testDeck.deal();
        testDeck.deal();
        testDeck.deal();
    }

    @Test
    public void turnOverNoCardsLeft() {
        CardDeck testDeck = CardDeck.testDeck();
        testDeck.deal();
        testDeck.deal();
        Assert.assertNull(testDeck.turnOver());
    }

    @Test
    public void turnOverSuite() throws Exception {
        Card card = cardDeck.turnOver();
        Assert.assertEquals(card.getSuite(), Suite.hearts);
    }

    @Test
    public void turnOverCardType() throws Exception {
        Card card = cardDeck.turnOver();
        Assert.assertEquals(card.getCardType(), Ace);
    }

    @Test
    public void deckSizeAfterTurnover() {
        Card card = cardDeck.turnOver();
        Assert.assertEquals(cardDeck.cardsInDeck().size(), 52);
    }

    @Test
    public void searchNotFound() throws Exception {
        CardDeck deck = CardDeck.testDeck();
        int position = deck.search(new Card(spades, Ace));
        Assert.assertEquals(position, -1);
    }

    @Test
    public void searchFound() throws Exception {
        CardDeck deck = CardDeck.testDeck();
        int position = deck.search(new Card(clubs, Five));
        Assert.assertEquals(position, 1);
    }

    @Test
    public void newOrder() throws Exception {
    }

    @Test
    public void cardsInDeck() throws Exception {
    }

    @Test
    public void getDealtCards() throws Exception {
    }

}