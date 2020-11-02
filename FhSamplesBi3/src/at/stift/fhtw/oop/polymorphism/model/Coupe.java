package at.stift.fhtw.oop.polymorphism.model;

public class Coupe extends Car {

    String coupeType;

    public Coupe(int numberOfSeats, int horsePower, String coupeType) {
        super(numberOfSeats, horsePower);
        this.coupeType = coupeType;
    }

    @Override
    public void drive() {
        System.out.println("[COUPE] " + coupeType + " with " + numberOfSeats + " seats and " + horsePower + " PS is driving");
    }

}
