package org.example;

public class Car {

    String stsNumber;
    String numberCar;
    String colorCar;
    String nameCar;
    String numberOfDoors;


    public String getStsNumber() {
        return stsNumber;
    }

    public void setStsNumber(String stsNumber) {
        this.stsNumber = stsNumber;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public void setNumberCar(String numberCar) {
        this.numberCar = numberCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void displayCar() {

        System.out.println("Model: " + getNameCar() +"\t Color: " + getColorCar() + "\t Number:" + getNumberCar()
                +"\t Doors: " + getNumberOfDoors() +"\t STS: "+ getStsNumber());
    }
}
