package InterfacesAndAbstraction.CarShopANDCarShopExtended;

public class Seat extends CarImpl implements Car, Sellable {

    private Double price;


    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }


    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(System.lineSeparator())
                .append(String.format("%s%n%s sells for %f", super.toString(), getModel(), price));


        return sb.toString()  ;
    }
}
