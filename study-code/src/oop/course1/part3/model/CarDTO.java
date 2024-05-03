package oop.course1.part3.model;

public class CarDTO {
    private int carSerialNumber;
    private String carName;
    private int carPrice;
    private String carOwner;
    private int carYear;
    private String carType;

    public CarDTO(int carSerialNumber, String carName, int carPrice, String carOwner, int carYear, String carType) {
        this.carSerialNumber = carSerialNumber;
        this.carName = carName;
        this.carPrice = carPrice;
        this.carOwner = carOwner;
        this.carYear = carYear;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "carSerialNumber = " + this.carSerialNumber +
                "\ncarName = " + this.carName +
                "\ncarPrice = " + this.carPrice +
                "\ncarOwner = " + this.carOwner +
                "\ncarYear = " + this.carYear +
                "\ncarType = " + this.carType;
    }
}
