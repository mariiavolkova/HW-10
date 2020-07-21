package main.java.com.volkova.executor;

import main.java.com.volkova.singleton.Mountain;
import main.java.com.volkova.builder.Car;

public class Executor {

    Car myCar;
    Car parentsCar;

    public void start() {
        myCar = new Car.Builder()
                .withType("JEEP")
                .withSeats(4)
                .withEngineVolume(3.0)
                .withTransmission("AUTO")
                .withYear(2007)
                .build();

        System.out.println(myCar.toString());


        parentsCar = new Car.Builder()
                .withType("sedan")
                .withSeats(6)
                .withEngineVolume(1.6)
                .withTransmission("MANUAL")
                .withYear(2012)
                .build();

        System.out.println(parentsCar.toString());

        Mountain.getInstance("Altai");
        System.out.println(Mountain.name);
        Mountain.getInstance("Carpathians");
        System.out.println(Mountain.name);
    }
}