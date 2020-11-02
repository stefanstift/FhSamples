package at.stift.fhtw.oop.abstractclass;


import at.stift.fhtw.oop.abstractclass.model.Car;

public class AbstractClass {

    public static void main(String ...strings) {
        Car car = new Car();
        car.changeWheels();
        car.printNumberOfWheels();
    }

}
