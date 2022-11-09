package PolymorphismEX.Vehicles;

import java.text.DecimalFormat;

public class Bus extends VehicleImpl{

    private boolean busIsEmpty;

    public Bus(Double fuelQuantity, Double fuelConsumption, Double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);

    }

    public void setBusIsEmpty(boolean busIsEmpty) {
        this.busIsEmpty = busIsEmpty;
    }

    @Override
    public void driving(Double kilometers){
        if (busIsEmpty){
                DecimalFormat df = new DecimalFormat("#.##");
                boolean enoughFuelToDrive = getFuelQuantity() >= kilometers * getFuelConsumption();
                if (enoughFuelToDrive) {
                    System.out.printf("Bus travelled %s km\n", df.format(kilometers));
                    setFuelQuantity(getFuelQuantity() - (kilometers * getFuelConsumption()));
                } else {
                    System.out.println("Bus needs refueling");
                }
        } else {
            setFuelConsumption(getFuelConsumption() + 1.4);
            DecimalFormat df = new DecimalFormat("#.##");
            boolean enoughFuelToDrive = getFuelQuantity() >= kilometers * getFuelConsumption();
            if (enoughFuelToDrive) {
                System.out.printf("Bus travelled %s km\n", df.format(kilometers));
                setFuelQuantity(getFuelQuantity() - (kilometers * getFuelConsumption()));
            } else {
                System.out.println("Bus needs refueling");
            }
            setFuelConsumption(getFuelConsumption() - 1.4);
        }
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
