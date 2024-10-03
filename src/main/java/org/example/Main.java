package org.example;

import java.util.Scanner;
import org.example.ServiceSearch;

public class Main {
    public static void main(String[] args) {

    Car [] car = new Car [5];
    ServiceSearch  [] arraySearch = new ServiceSearch [1];

        System.out.println("Our common car base:");

        car[0] = new Car();
        car[0].setStsNumber("588528961");
        car[0].setNumberCar("F 568 RT");
        car[0].setColorCar("brown");
        car[0].setNameCar("Ford");
        car[0].setNumberOfDoors("4");
        car[0].displayCar();

        car[1] = new Car();
        car[1].setStsNumber("365421877");
        car[1].setNumberCar("P 568 OX");
        car[1].setColorCar("black");
        car[1].setNameCar("Audi");
        car[1].setNumberOfDoors("4");
        car[1].displayCar();

        car[2] = new Car();
        car[2].setStsNumber("302795512");
        car[2].setNumberCar("T 328 OX");
        car[2].setColorCar("black");
        car[2].setNameCar("BMW");
        car[2].setNumberOfDoors("3");
        car[2].displayCar();

        car[3] = new Car();
        car[3].setStsNumber("302795559");
        car[3].setNumberCar("O 163 NT");
        car[3].setColorCar("green");
        car[3].setNameCar("Toyota");
        car[3].setNumberOfDoors("5");
        car[3].displayCar();

        car[4] = new Car();
        car[4].setStsNumber("960024476");
        car[4].setNumberCar("O 398 CR");
        car[4].setColorCar("yelow");
        car[4].setNameCar("Reno");
        car[4].setNumberOfDoors("5");
        car[4].displayCar();

        Scanner scanner = new Scanner(System.in);

        ServiceSearch serviceSearch = new ServiceSearch();

        //System.out.println("Please enter your car model:");
        //serviceSearch.setSearchModel(scanner.nextLine());

        //System.out.println("Please enter your car color:");
        //serviceSearch.setSearchColor(scanner.nextLine());

        System.out.println("Please enter your car Number:");
        serviceSearch.setSearchNumberCar(scanner.nextLine());

        //System.out.println("Please enter your car Number of doors:");
        //serviceSearch.setSearchNumberOfDoors(scanner.nextLine());

        //System.out.println("Please enter your car STS number:");
        //serviceSearch.setSearchStsNumber(scanner.nextLine());

        System.out.println("We are looking for our next car: " +"\t Number: "+ serviceSearch.getSearchNumberCar());

          serviceSearch.searchCar(car);

        System.out.println("");
    }
}