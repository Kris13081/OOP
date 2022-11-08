package InterfacesAndAbstractionEX.MultipleImplementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Citizen> citizens = new HashMap<>();
        Map<String, Rebel> rebels = new HashMap<>();


        while (n-- > 0) {

            String[] data = scanner.nextLine().split("\\s+");
            if (data.length - 1 == 3) {
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String id = data[2];
                String date = data[3];
                Citizen citizen = new Citizen(name, age, id, date);
                citizens.put(name, citizen);
            } else if (data.length - 1 == 2) {
                String rebelName = data[0];
                int rebelAge = Integer.parseInt(data[1]);
                String group = data[2];
                Rebel rebel = new Rebel(rebelName, rebelAge, group);
                rebels.put(rebelName, rebel);
            }
        }
        int citizenTotalFood;
        int rebelsTotalFood;
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            for (var citizen : citizens.entrySet()) {
                if (input.equals(citizen.getKey())) {
                    citizen.getValue().buyFood();

                }
            }
            for (var rebel : rebels.entrySet()) {
                if (input.equals(rebel.getKey())) {
                    rebel.getValue().buyFood();

                }
            }
            input = scanner.nextLine();
        }
        citizenTotalFood = citizens.values().stream().mapToInt(Citizen::getFood).sum();
        rebelsTotalFood = rebels.values().stream().mapToInt(Rebel::getFood).sum();

        int totalFood = citizenTotalFood + rebelsTotalFood;
        System.out.println(totalFood);
    }
}
