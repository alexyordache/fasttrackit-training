package org.fasttrackit.course3;

public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Car alexsCar = new Car();
        Car mihneasCar = new Car();

        alexsCar.brand = "Dacia";
        mihneasCar.brand = "Audi";
        alexsCar.numberOfDoors = 5;
        alexsCar.numberOfWheels = 4;

        System.out.println("Alex's car is: " + mihneasCar.brand);
        System.out.println("Mihnea's car is: " + alexsCar.brand);
        System.out.println("Alex's number of doors (int): " + alexsCar.numberOfDoors);
        System.out.println("Alex's number of wheels (INTEGER): " + alexsCar.numberOfWheels);
        System.out.println("Program stopped");
    }
}
