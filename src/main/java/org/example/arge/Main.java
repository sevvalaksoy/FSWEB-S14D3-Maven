package org.example.arge;


public class Main {
    public static void main(String[] args) {
        CarSkeleton carSkeleton = new CarSkeleton("Main", "The main skeleton");
        CarSkeleton car1 = new HybridCar("Hybrid","Mixed",0.1,550, 9);
        CarSkeleton car2 = new ElectricCar("Electric", "electric", 0.1, 600);
        CarSkeleton car3 = new GasPoweredCar("Gas", "gas", 0.2, 8);

        System.out.println(car1.drive());
        System.out.println(car2.startEngine());
        System.out.println(car3.runEngine());
        System.out.println("********************************************");
        System.out.println(((HybridCar)car1).getBatterySize());
        System.out.println(((ElectricCar)car2).getAvgKmPerCharge());
        System.out.println(((GasPoweredCar)car3).getCylinders());



    }
}
