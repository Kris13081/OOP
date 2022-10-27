package WorkingWithAbstractionEX.CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("Card Ranks")){
            command = scanner.nextLine();
        }
        ThirteenRanks.printer();
    }
}
