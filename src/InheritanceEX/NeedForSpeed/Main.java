package InheritanceEX.NeedForSpeed;

public class Main {
    public static void main(String[] args) {

        SportCar sportCar = new SportCar(3, 200);
        FamilyCar familyCar = new FamilyCar(10, 90);


        familyCar.drive(12);
        System.out.println(familyCar.getFuel());

        sportCar.drive(100);
            System.out.println(sportCar.getFuel());


    }
}
