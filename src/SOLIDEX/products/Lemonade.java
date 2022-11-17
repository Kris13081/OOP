package SOLIDEX.products;

import SOLIDEX.Drink;
import SOLIDEX.Product;

public class Lemonade implements Product, Drink {

    public static final double CALORIES_PER_100_GRAMS = 53.0;
    public static final double DENSITY = 0.7;

    private double milliliters;

    public Lemonade(double milliliters) {
        this.milliliters = milliliters;
    }

    @Override
    public double getMilliliters() {
        return milliliters;
    }


    @Override
    public double getDensity() {
        return DENSITY;
    }

    @Override
    public double getCaloriesPer100Grams() {
        return CALORIES_PER_100_GRAMS;
    }

}
