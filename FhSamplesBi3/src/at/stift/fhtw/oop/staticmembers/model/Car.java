package at.stift.fhtw.oop.staticmembers.model;

public class Car {

    private int numberOfSeats;
    private static int carCount;

    public void drive() {
        System.out.println("Car driving with " + numberOfSeats + " seats - " + carCount );
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setCarCount(int count) {
        carCount = count;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
