package org.example;
import org.example.Main;

public class ServiceSearch {
    String searchModel;
    String searchColor;
    String searchNumberCar;
    String searchNumberOfDoors;
    String searchStsNumber;

    public String getSearchModel() {
        return searchModel;
    }

    public void setSearchModel(String searchModel) {
        this.searchModel = searchModel;
    }

    public String getSearchColor() {
        return searchColor;
    }

    public void setSearchColor(String searchColor) {
        this.searchColor = searchColor;
    }

    public String getSearchNumberCar() {
        return searchNumberCar;
    }

    public void setSearchNumberCar(String searchNumberCar) {
        this.searchNumberCar = searchNumberCar;
    }

    public String getSearchNumberOfDoors() {
        return searchNumberOfDoors;
    }

    public void setSearchNumberOfDoors(String searchNumberOfDoors) {
        this.searchNumberOfDoors = searchNumberOfDoors;
    }

    public String getSearchStsNumber() {
        return searchStsNumber;
    }

    public void setSearchStsNumber(String searchStsNumber) {
        this.searchStsNumber = searchStsNumber;
    }

    public void searchCar(Car [] car){
        for (int i = 0; i < car.length; i++) {
            int num = i+1;

            if (car[i].getNumberCar().equals(searchNumberCar)) {
                System.out.println("Your car in database No." + num);
                System.out.print("\t model: "+car[i].getNameCar() +"\t color: "+ car[i].getColorCar()+"\t STS: " +
                        car[i].getStsNumber() +"\t Doors: " + car[i].getNumberOfDoors() + "\t color: "+ car[i].getNumberCar());
            }

        }

    }
}
