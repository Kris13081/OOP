package EncapsulationEX.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> bag;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.bag = new ArrayList<>();
    }

    public String getName() {
        return name;
}

    private void setName(String name) {
        if (name.contains(" ") || name.length() <= 1) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    private void setMoney(double money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }


    public void buyProduct(Product product){
        if (money >= product.getCost()){
            bag.add(product);
            money -= product.getCost();
        } else {
            throw new IllegalArgumentException((String.format("%s can't afford %s", name, product.getName())));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s - ", name));
        for (Product product : bag) {
            sb.append(product.getName()).append(", ");
        }
        return sb.substring(0, sb.length() -2).trim();
    }
    public static void printer(Person person){
       if (person.bag.isEmpty()){
           System.out.printf("%s - Nothing bought", person.getName());
       } else {
           System.out.println(person);
       }
    }
}
