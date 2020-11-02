package at.stift.fhtw.oop.encapsulation.model;

public class UnsecuredVehicle implements Vehicle {

    // valid speed range 0 - 100 kmh
    public int speed;

    public void drive() {
        System.out.println(new StringBuilder("Driving with speed ").append(speed).append( "km/h"));
    }


}
