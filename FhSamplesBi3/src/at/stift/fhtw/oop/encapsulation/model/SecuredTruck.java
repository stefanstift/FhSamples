package at.stift.fhtw.oop.encapsulation.model;

public class SecuredTruck {

    // valid speed range 0 - 100 kmh
    private int speed;

    public void drive(int speed) {
        if(speed < 0 || speed > 100) throw new IllegalStateException("Invalid speed for truck " + speed);

        this.speed = speed;
        System.out.println(new StringBuilder("Driving with speed ").append(speed).append( "km/h"));
    }

    public int getSpeed() {
        return speed;
    }


}
