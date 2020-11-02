package at.stift.fhtw.oop.polymorphism;


import at.stift.fhtw.oop.polymorphism.model.Car;
import at.stift.fhtw.oop.polymorphism.model.Coupe;
import at.stift.fhtw.oop.polymorphism.model.SUV;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

    public static void main(String ... strings) {

        Car car = new Car(4, 120);
        car.drive();

        SUV suv = new SUV(6, 140, "Volvo XC90");
        suv.drive();
        Car suvCar = suv;
        suvCar.drive();

        List<Car> myCars = new ArrayList<>();
        myCars.add(new SUV(6, 140, "Volvo X80"));
        myCars.add(new Coupe(6, 140, "Mazda MX5"));

        for(Car c : myCars) {
            c.drive();
        }

    }

}


