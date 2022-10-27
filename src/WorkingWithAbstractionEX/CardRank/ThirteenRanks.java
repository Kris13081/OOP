package WorkingWithAbstractionEX.CardRank;

public enum ThirteenRanks {
    ACE("ACE", 0),
    TWO("TWO", 1),
    THREE("THREE",2),
    FOUR("FOUR",3),
    FIVE("FIVE",4),
    SIX("SIX",5),
    SEVEN("SEVEN",6),
    EIGHT("EIGHT",7),
    NINE("NINE",8),
    TEN("TEN",9),
    JACK("JACK",10),
    QUEEN("QUEEN",11),
    KING("KING",12);


    private String name;
    private int ordinaryValue;

    ThirteenRanks(String name, int ordinaryValue) {
        this.name = name;
        this.ordinaryValue = ordinaryValue;
    }
    public static void printer (){
        System.out.println("Card Ranks:");
        for (ThirteenRanks value : ThirteenRanks.values()) {
            System.out.println(value.toString());
        }
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinaryValue, this.name);
    }
}
