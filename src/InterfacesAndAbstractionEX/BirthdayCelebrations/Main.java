package InterfacesAndAbstractionEX.BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String date = null;
        List<String> dates = new ArrayList<>();

        while (!"End".equals(input)){
            String[] data = input.split("\\s+");
            String type = data[0];



            switch (type){
                case "Citizen":
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String id = data[3];
                    date = data[4];
                    dates.add(date);
                    Citizen citizen = new Citizen(name, age, id, date);
                    break;
                case "Robot":
                    String model = data[1];
                    String robotId = data[2];
                    Robot robot = new Robot(model, robotId);
                    break;
                case "Pet":
                    String petName = data[1];
                    date = data[2];
                    dates.add(date);
                    Pet pet = new Pet(petName, date);
                    break;
            }
            input = scanner.nextLine();
        }

        boolean matchingYears = false;
        String searchingYear = scanner.nextLine();

        for (String d : dates) {
            String[] dateFromList = d.split("/");
            if (dateFromList[2].equals(searchingYear)){
                System.out.println(d);
                matchingYears = true;
            }
        }
        if (!matchingYears){
            System.out.println("<no output>");
        }
    }
}
