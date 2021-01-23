package week07d05;

public class Car extends Vehicle {

    private int numberOfGears;
    private TransmissionType transmissionType = TransmissionType.AUTOMATIC;

    public Car(int numberOfGears, TransmissionType transmissionType) {
        this.numberOfGears = numberOfGears;
        this.transmissionType = transmissionType;
    }

}
