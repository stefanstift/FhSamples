package at.stift.fhtw.oop.inheritance.model;

public class SUV extends Car{

    String suvModel;

    public SUV(int numberOfSeats, int horsePower, String suvModel) {
        super(numberOfSeats, horsePower);
        this.suvModel = suvModel;
    }

    @Override
    public void drive() {
        System.out.println(suvModel + " with " + numberOfSeats + " seats and " + horsePower + " PS is driving");
    }

    public void drive(int speed) {
        System.out.println(suvModel + " with " + numberOfSeats + " seats and " + horsePower + " PS is driving with " + speed + " km/h");
    }

}
