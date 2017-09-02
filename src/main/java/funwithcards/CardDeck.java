package funwithcards;

public interface CardDeck {

    void shuffle();
    void cut(int cutPoint);
    Card deal();
    void newOrder();
    Card turnOver();
    int search(Card card);

    int getNumberOfDealtCards();
    int getNumberOfCardsInDeck();

}
