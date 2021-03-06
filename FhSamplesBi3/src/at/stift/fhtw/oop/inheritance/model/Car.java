package at.stift.fhtw.oop.inheritance.model;

public class Car {

    int numberOfSeats;
    int horsePower;

    // Default Constructor
    public Car() {
    }

    public Car(int numberOfSeats, int horsePower) {
        this.numberOfSeats = numberOfSeats;
        this.horsePower = horsePower;
    }

    public void drive() {
        System.out.println("Car with " + numberOfSeats + " seats and " + horsePower + " PS is driving");
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
