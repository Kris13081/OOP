package PolymorphismEX.Vehicles;

public class Truck extends VehicleImpl implements Vehicles {


    public Truck(Double fuelQuantity, Double fuelConsumption, Double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity);
    }

    @Override
    public void refueling(Double refueledFuel) {

        if (refueledFuel < 1){
            System.out.println("Fuel must be a positive number");
            return;
        }
        refueledFuel = refueledFuel * 0.95 ;

        if (getFuelQuantity() + refueledFuel > getTankCapacity()){
            System.out.println("Cannot fit fuel in tank");
        } else {
            setFuelQuantity(getFuelQuantity() + refueledFuel);
        }

    }
}
