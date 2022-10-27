package WorkingWithAbstractionEX.CardsWithPower;

public enum Suits {
    CLUBS("CLUBS", 0),
    DIAMONDS("DIAMONDS", 13),
    HEARTS("HEARTS", 26),
    SPADES("SPADES", 39);

    private  int suitsPower;
    private  String name;

    Suits(String name, int suitsPower) {
        this.name = name;
        this.suitsPower = suitsPower;
    }

    public int getSuitsPower() {
        return suitsPower;
    }

    public void setSuitsPower(int suitsPower) {
        this.suitsPower = suitsPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
