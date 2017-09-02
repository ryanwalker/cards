package funwithcards;

import java.util.ArrayList;
import java.util.Comparator;

public class PinochleCardDeck extends CardDeckImpl {


    /*
     A pinochle deck may be formed by combining two normal decks of cards
     and removing cards 2-8, for a total of 48 cards. In addition, pinochle uses unconventional card ordering,
      namely (from lowest to highest):  9, Jack, Queen, King, 10, Ace.
     */

    public PinochleCardDeck() {
        cardsInDeck = new ArrayList<>();
        dealtCards = new ArrayList<>();

        for (Suite suite : Suite.values()) {
            for (CardType cardType : CardType.values()) {
                if (cardType.getPinochleSortOrder() != -1) {
                    cardsInDeck.add(new Card(suite, cardType));
                    cardsInDeck.add(new Card(suite, cardType));
                }
            }
        }
    }

    @Override
    public void newOrder() {
        cardsInDeck.sort(new PinochleCardDeckcomparator());
    }

    class PinochleCardDeckcomparator implements Comparator<Card> {
        //      namely (from lowest to highest):  9, Jack, Queen, King, 10, Ace.
        @Override
        public int compare(Card card1, Card card2) {
            if (card1.getSuite() == card2.getSuite()) {
                if (card1.getCardType() == card2.getCardType()) {
                    return 0;
                }
                return card1.getCardType().getPinochleSortOrder() - card2.getCardType().getPinochleSortOrder();
            }

            return card1.getSuite().getSortOrder() - card2.getSuite().getSortOrder();
        }
    }
}
