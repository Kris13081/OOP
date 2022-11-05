package EncapsulationEX.pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaInfo = scanner.nextLine().split(" ");
        String pizzaName = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt(pizzaInfo[2]);

        String[] doughInfo = scanner.nextLine().split(" ");
        String flourType = doughInfo[1];
        String bakingType = doughInfo[2];
        double weight = Double.parseDouble(doughInfo[3]);

        try {

            Pizza pizza = new Pizza(pizzaName, numberOfToppings);
            Dough dough = new Dough(flourType, bakingType, weight);
            pizza.setDough(dough);


            String command = scanner.nextLine();
            while (!"END".equals(command)) {
                String[] toppingInfo = command.split(" ");
                String toppingName = toppingInfo[1];
                double toppingWeight = Double.parseDouble(toppingInfo[2]);

                Topping topping = new Topping(toppingName, toppingWeight);
                pizza.addTopping(topping);

                command= scanner.next();
            }

            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }
}