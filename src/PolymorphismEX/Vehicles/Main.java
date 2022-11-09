package PolymorphismEX.Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInfo = scanner.nextLine().split(" ");
        double fuelQuantity = Double.parseDouble(carInfo[1]);
        double fuelConsumptionPerKilometer = Double.parseDouble(carInfo[2]);
        double carTankCapacity = Double.parseDouble(carInfo[3]);
        VehicleImpl car = new Car(fuelQuantity, fuelConsumptionPerKilometer, carTankCapacity);

        String[] truckInfo = scanner.nextLine().split(" ");
        double truckFuelQuantity = Double.parseDouble(truckInfo[1]);
        double truckFuelConsumptionPerKilometer = Double.parseDouble(truckInfo[2]);
        double truckTankCapacity = Double.parseDouble(carInfo[3]);
        VehicleImpl truck = new Truck(truckFuelQuantity, truckFuelConsumptionPerKilometer, truckTankCapacity);

        String[] busInfo = scanner.nextLine().split(" ");
        double busFuelQuantity = Double.parseDouble(busInfo[1]);
        double busFuelConsumptionPerKilometer = Double.parseDouble(busInfo[2]);
        double busTankCapacity = Double.parseDouble(busInfo[3]);
        VehicleImpl bus = new Bus(busFuelQuantity, busFuelConsumptionPerKilometer, busTankCapacity);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        while (numberOfCommands-- > 0) {
            String[] commandData = scanner.nextLine().split(" ");
            String commandName = commandData[0];
            String vehicleType = commandData[1];


            switch (commandName) {
                case "Drive":
                    Double kilometers = Double.parseDouble(commandData[2]);
                    if (vehicleType.equals("Car")) {
                        car.driving(kilometers);
                    } else if (vehicleType.equals("Truck")){
                        truck.driving(kilometers);
                    } else {
                        bus.driving(kilometers);
                    }
                    break;
                case "Refuel":
                    Double refueledFuel = Double.parseDouble(commandData[2]);
                    if (vehicleType.equals("Car")) {
                        car.refueling(refueledFuel);
                    } else if (vehicleType.equals("Truck")) {
                        truck.refueling(refueledFuel);
                    } else {
                        bus.refueling(refueledFuel);
                    }
                    break;
                case "DriveEmpty":
                    kilometers = Double.parseDouble(commandData[2]);
                    bus.driving(kilometers);
                    break;
            }


        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());


    }
}
