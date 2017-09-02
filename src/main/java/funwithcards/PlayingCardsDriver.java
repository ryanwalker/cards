package funwithcards;


public class PlayingCardsDriver {


    public static void main(String[] args) {
        StandardCardDeck standardCardDeck = new StandardCardDeck();
        standardCardDeck.shuffle();

        System.out.println(standardCardDeck.toString());

        standardCardDeck.shuffle();

        for (int i = 0; i < 9; i++) {
            standardCardDeck.deal();
        }

        standardCardDeck.newOrder();
        System.out.println(standardCardDeck.toString());


        System.out.println(standardCardDeck.getDealtCards());


        CardDeck pinochleCardDeck = new PinochleCardDeck();
        pinochleCardDeck.newOrder();
        System.out.println(pinochleCardDeck);

    }

}
