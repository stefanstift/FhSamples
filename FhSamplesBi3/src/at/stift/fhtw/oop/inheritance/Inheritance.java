package at.stift.fhtw.oop.inheritance;

import at.stift.fhtw.oop.inheritance.model.Car;
import at.stift.fhtw.oop.inheritance.model.SUV;

public class Inheritance {

    public static void main(String ... strings) {

        Car car = new Car(4, 120);
        car.drive();

        SUV suv = new SUV(6, 140, "Volvo XC90");
        suv.drive();
        suv.drive(100);
    }

}


