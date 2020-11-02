package at.stift.fhtw.oop.staticmembers;

import at.stift.fhtw.oop.staticmembers.model.Car;

public class StaticMembers {

    public static void main(String ... strings) {
        Car car1 = new Car();
        car1.setNumberOfSeats(2);
        car1.setCarCount(1);

        Car car2 = new Car();
        car2.setNumberOfSeats(4);
        car2.setCarCount(2);

        Car car3 = new Car();
        car3.setNumberOfSeats(5);
        car3.setCarCount(3);

        car1.drive();
        car2.drive();
        car3.drive();

    }

}
