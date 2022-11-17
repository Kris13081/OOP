package SOLIDEX;

import java.util.List;

public class Printer extends CalorieCalculator {

    public void printSum(List<Object> products) {
        System.out.printf((SUM) + "%n", sum(products));
    }

    public void printAverage(List<Object> products) {
        System.out.printf((AVERAGE) + "%n", average(products));
    }

}
