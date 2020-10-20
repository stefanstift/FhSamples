package at.stift.fhtw.oop.encapsulation;

import at.stift.fhtw.oop.encapsulation.model.SecuredTruck;
import at.stift.fhtw.oop.encapsulation.model.UnsecuredTruck;

public class Encapsulation {

    public static void main(String ... strings) {

        UnsecuredTruck unsecuredTruck  = new UnsecuredTruck();

        unsecuredTruck.speed = 50;
        unsecuredTruck.drive();

        unsecuredTruck.speed = 500;
        unsecuredTruck.drive();

        SecuredTruck securedTruck = new SecuredTruck();
        securedTruck.drive(60);
        // throws Exception
        securedTruck.drive(160);
    }

}
