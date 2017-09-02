package funwithcards;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardDeck {

    private List<Card> cardsInDeck;
    private List<Card> dealtCards;

//    private List<Card> newOrder;

    public CardDeck() {
        cardsInDeck = new ArrayList<>();
        dealtCards = new ArrayList<>();

        for (Suite suite : Suite.values()) {
            for (CardType cardType : CardType.values()) {
                cardsInDeck.add(new Card(suite, cardType));
            }
        }
    }

    private CardDeck(boolean b) {
        //quick deck, for testin
        cardsInDeck = new ArrayList<>();
        cardsInDeck.add(new Card(Suite.clubs, CardType.Five));
        cardsInDeck.add(new Card(Suite.hearts, CardType.Queen));
        dealtCards = new ArrayList<>();
    }

    /*
    * Shuffle:  Randomizes the order of the cards.

     */
    public void shuffle() {
        List<Card> shuffledDeck = new ArrayList<>();


        Random random = new Random();

        int numberOfCards = cardsInDeck.size();

        while (numberOfCards > 0) {
            int randomCardIndex = random.nextInt(numberOfCards);
            numberOfCards--;

            shuffledDeck.add(cardsInDeck.remove(randomCardIndex));
        }

        cardsInDeck = new ArrayList<>(shuffledDeck);


    }

    /*
    Cut:  Splits the deck at a point chosen by the player;
    cards above the split point are placed on the bottom of the deck (without reordering).
    The first card below the split becomes the top of the deck.
    The first card above the split becomes the bottom of the deck.
     */
    public void cut(int cutPoint) {
        if (cutPoint < 0 || cutPoint > 52) {
            throw new IllegalArgumentException("Must cut between 0 and 52");
        }

    }

    /*
* New Order:  Places the remaining cards in the deck in the order of a new deck of cards (top to bottom:  hearts A-K, clubs A-K, diamonds K-A, spades K-A).

 */
    public List<Card> newOrder() {
        return null;
    }


    /*
    * Deal:  Retrieves the top card and removes it from the deck.

     */
    public Card deal() {
        //Need some boundary checking
        Card dealtCard = cardsInDeck.remove(0);
        dealtCards.add(dealtCard);
        return dealtCard;
    }

    /*
    * Turn Over:  Retrieves the top card but does not remove it from the deck.

     */
    public Card turnOver() {
        //Need some boundary checking
        return cardsInDeck.get(0);
    }

    /*
    * Search:  Finds the position of a given card in the deck (top of the deck is the first card, next card is the second, etc.).

     */
    public int search(Card card) {
        for (int i = 0; i < cardsInDeck.size(); i++) {
            Card candidate = cardsInDeck.get(i);
            if (card == candidate) {
                System.out.println(candidate.getCardType());
                System.out.println(candidate.getSuite());
                return i;
            }
        }
        //Returning -1 if not found, not specified instructions
        return -1;

    }

    public List<Card> cardsInDeck() {
        return cardsInDeck;
    }

    public List<Card> getDealtCards() {
        return dealtCards;
    }

    public static CardDeck testDeck() {
        return new CardDeck(true);
    }

    @Override
    public String toString() {
        StringBuilder retVal = new StringBuilder("\nDealt: ").append(dealtCards.size());
        for (Card dealtCard : dealtCards) {
            retVal.append("\n");
            retVal.append(dealtCard);
        }
        retVal.append("\n\nIn deck: ").append(cardsInDeck.size());
        for (Card card : cardsInDeck) {
            retVal.append("\n");
            retVal.append(card);
        }
        return retVal.toString();
    }
}
