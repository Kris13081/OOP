package PolymorphismEX.Vehicles;

public class Car extends VehicleImpl implements Vehicles {


    public Car(Double fuelQuantity, Double fuelConsumption, Double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 0.9, tankCapacity);
    }

    @Override
     public void refueling(Double refueledFuel) {
        if (refueledFuel < 1){
            System.out.println("Fuel must be a positive number");
            return;
        }
        if (getFuelQuantity() + refueledFuel > getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
        } else {
            setFuelQuantity(getFuelQuantity() + refueledFuel);
        }
    }
}
