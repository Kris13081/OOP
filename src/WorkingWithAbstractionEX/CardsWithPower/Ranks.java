package WorkingWithAbstractionEX.CardsWithPower;

public enum Ranks {
    ACE("ACE", 14),
    TWO("TWO", 2),
    THREE("THREE",3),
    FOUR("FOUR",4),
    FIVE("FIVE",5),
    SIX("SIX",6),
    SEVEN("SEVEN",7),
    EIGHT("EIGHT",8),
    NINE("NINE",9),
    TEN("TEN",10),
    JACK("JACK",11),
    QUEEN("QUEEN",12),
    KING("KING",13);


    private String name;
    private int rankPower;

    Ranks(String name, int rankPower) {
        this.name = name;
        this.rankPower = rankPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRankPower() {
        return rankPower;
    }

    public void setRankPower(int rankPower) {
        this.rankPower = rankPower;
    }
}
