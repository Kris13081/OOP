package WorkingWithAbstractionEX.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rowSize = dimensions[0];
        int colSize = dimensions[1];

        Field field = new Field(rowSize, colSize);
        Galaxy galaxy  =new Galaxy(field);

        int[] jediPositions = getPositions(scanner);
        int[] evilPositions = getPositions(scanner);

        int rowEvil = evilPositions[0];
        int colEvil = evilPositions[1];

        galaxy.moveEvil(rowEvil, colEvil);

        int rowJedi = jediPositions[0];
        int colJedi = jediPositions[1];

        int starsCollected = galaxy.moveJedi(rowJedi, colJedi);


        System.out.println(starsCollected);


    }

    private static int[] getPositions(Scanner scanner) {
        String command = scanner.nextLine();

        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }





}
