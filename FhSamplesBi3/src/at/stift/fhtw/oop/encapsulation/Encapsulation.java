package at.stift.fhtw.oop.encapsulation;

import at.stift.fhtw.oop.encapsulation.model.SecuredVehicle;
import at.stift.fhtw.oop.encapsulation.model.UnsecuredVehicle;

public class Encapsulation {

    public static void main(String ... strings) {

        UnsecuredVehicle unsecuredVehicle  = new UnsecuredVehicle();

        unsecuredVehicle.speed = 50;
        unsecuredVehicle.drive();

        unsecuredVehicle.speed = 500;
        unsecuredVehicle.drive();

        SecuredVehicle securedTruck = new SecuredVehicle();
        securedTruck.setSpeed(60);
        securedTruck.drive();
        // throws Exception
        securedTruck.setSpeed(160);
        securedTruck.drive();
    }

}
