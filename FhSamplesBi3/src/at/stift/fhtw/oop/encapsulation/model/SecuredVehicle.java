package at.stift.fhtw.oop.encapsulation.model;

public class SecuredVehicle implements Vehicle {

    // valid speed range 0 - 100 kmh
    private int speed;

    public void drive() {
        System.out.println(new StringBuilder("Driving with speed ").append(speed).append( "km/h"));
    }

    public void setSpeed(int speed) {
        if(speed < 0 || speed > 100) throw new IllegalStateException("Invalid speed for truck " + speed);
        this.speed = speed;
    }

}



