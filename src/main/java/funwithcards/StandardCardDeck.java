package funwithcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardCardDeck extends CardDeckImpl {

    public StandardCardDeck() {
        cardsInDeck = new ArrayList<>();
        dealtCards = new ArrayList<>();

        for (Suite suite : Suite.values()) {
            for (CardType cardType : CardType.values()) {
                cardsInDeck.add(new Card(suite, cardType));
            }
        }
    }

    private StandardCardDeck(boolean b) {
        //quick deck, for testing
        cardsInDeck = new ArrayList<>();
        cardsInDeck.add(new Card(Suite.clubs, CardType.Five));
        cardsInDeck.add(new Card(Suite.hearts, CardType.Queen));
        dealtCards = new ArrayList<>();
    }

    public List<Card> cardsInDeck() {
        return cardsInDeck;
    }

    public List<Card> getDealtCards() {
        return dealtCards;
    }

    public static StandardCardDeck testDeck() {
        return new StandardCardDeck(true);
    }

}
