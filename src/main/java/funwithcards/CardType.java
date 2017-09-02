package funwithcards;

public enum CardType {

    Ace(1, 6),
    Two(2, -1),
    Three(3, -1),
    Four(4, -1),
    Five(5, -1),
    Six(6, -1),
    Seven(7, -1),
    Eight(8, -1),
    Nine(9, 1),
    Ten(10, 5),
    Jack(11, 2),
    Queen(12, 3),
    King(13, 4);

    private int sortOrder;

    // 9, Jack, Queen, King, 10, Ace.

    private int pinochleSortOrder;
    CardType(int sortOrder, int pinochleSortOrder) {
        this.sortOrder = sortOrder;
        this.pinochleSortOrder = pinochleSortOrder;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public int getPinochleSortOrder() {
        return pinochleSortOrder;
    }
}
