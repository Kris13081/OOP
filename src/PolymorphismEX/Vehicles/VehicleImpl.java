package PolymorphismEX.Vehicles;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicles {

    private String vehicleType;
    private Double fuelQuantity;
    private Double fuelConsumption;
    private Double tankCapacity;

    public VehicleImpl(Double fuelQuantity, Double fuelConsumption, Double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        setTankCapacity(tankCapacity);
        setVehicleType(getVehicleType());
    }

    public String getVehicleType() {
        return getClass().getSimpleName();
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getFuelQuantity() {
        return fuelQuantity;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }


    public Double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(Double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void driving(Double kilometers) {
        DecimalFormat df = new DecimalFormat("#.##");
        boolean enoughFuelToDrive = getFuelQuantity() >= kilometers * getFuelConsumption();
        if (enoughFuelToDrive) {
            System.out.printf("%s travelled %s km\n",vehicleType, df.format(kilometers));
            setFuelQuantity(getFuelQuantity() - (kilometers * getFuelConsumption()));
        } else {
            System.out.printf("%s needs refueling%n", vehicleType);
        }

    }



    public abstract void refueling(Double refueledFuel);



}
