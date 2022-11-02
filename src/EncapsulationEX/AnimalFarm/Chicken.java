package EncapsulationEX.AnimalFarm;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Chicken {

    private String name;
    private int age;

    public Chicken(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals(" ") || name.length() < 1){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15){
            throw  new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }
    public double productPerDay(){
      return calculateProductPerDay();

    }
    private double calculateProductPerDay(){
        double eggsPerDay = 0;
        if (age < 6){
           eggsPerDay += 2;
        } else if ( age < 12){
            eggsPerDay += 1;
        } else {
            eggsPerDay += 0.75;
        }
        return eggsPerDay;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        return String.format("Chicken %s (age %d) can produce %s eggs per day.", name, age, df.format(calculateProductPerDay()));
    }
}
