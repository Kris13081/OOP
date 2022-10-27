package WorkingWithAbstractionEX.CardSuit;

public enum FourSuits {
    CLUBS("CLUBS", 0),
    DIAMONDS("DIAMONDS", 1),
    HEARTS("HEARTS", 2),
    SPADES("SPADES", 3);

    private  int ordinalValue;
    private  String name;

    FourSuits(String name, int ordinalValue) {
        this.name = name;
        this.ordinalValue = ordinalValue;
    }


    public static void printer(){
        System.out.println("Card Suits:");
        for (FourSuits value : FourSuits.values()) {
            System.out.println(value.toString());
        }
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinalValue, this.name);
    }
}
