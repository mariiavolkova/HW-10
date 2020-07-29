package main.java.com.volkova.executor;

import main.java.com.volkova.builder.Car;
import main.java.com.volkova.singleton.Singleton;

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

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Result of singleton instances comparing: " +
                (singleton1 == singleton2));
    }
}