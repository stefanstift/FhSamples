package at.stift.fhtw.oop.polymorphism.model;

public class SUV extends Car {

    String suvModel;

    public SUV(int numberOfSeats, int horsePower, String suvModel) {
        super(numberOfSeats, horsePower);
        this.suvModel = suvModel;
    }

    @Override
    public void drive() {
        System.out.println("[SUV] " + suvModel + " with " + numberOfSeats + " seats and " + horsePower + " PS is driving");
    }

}
