package SOLIDEX.products;

import SOLIDEX.Food;
import SOLIDEX.Product;

public class Chips implements Product, Food {

    public static final double CALORIES_PER_100_GRAMS = 529.0;

    private double grams;

    public Chips(double grams) {
        this.grams = grams;
    }


    @Override
    public double getGrams() {
        return grams;
    }

    @Override
    public double getCaloriesPer100Grams() {
        return CALORIES_PER_100_GRAMS;
    }


}
