package funwithcards;

public enum Suite {
    hearts(1),
    clubs(2),
    diamonds(3),
    spades(4),;

    private int sortOrder;

    Suite(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    public int getSortOrder() {
        return sortOrder;
    }
}
