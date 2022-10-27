package WorkingWithAbstractionEX.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        printer(cardRank, cardSuit);
    }

    private static int cardRank(String cardRank) {
        for (Ranks value : Ranks.values()) {
            if (value.getName().equals(cardRank)) {
                return value.getRankPower();
            }
        }
        return 0;
    }

    private static int cardSuit(String cardSuit) {
        for (Suits value : Suits.values()) {
            if (value.getName().equals(cardSuit)) {
                return value.getSuitsPower();
            }
        }
        return 0;
    }

    private static int cardPower(String cardRank, String cardSuit) {
        return cardRank(cardRank) + cardSuit(cardSuit);
    }

    private static void printer(String cardRank, String cardSuit) {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Card name: %s of %s; ", cardRank, cardSuit));
        sb.append("Card power: ");
        sb.append(cardPower(cardRank, cardSuit));

        System.out.println(sb);
    }
}

