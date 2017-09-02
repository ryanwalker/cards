package funwithcards;


public class PlayingCardsDriver {


    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        cardDeck.shuffle();

        System.out.println(cardDeck.toString());

        cardDeck.shuffle();
        cardDeck.deal();
        cardDeck.deal();
        cardDeck.deal();

        System.out.println(cardDeck.toString());
    }

}
