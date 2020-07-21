package main.java.com.volkova.builder;

import java.util.Objects;

public class Car {
    private String type;
    private int seats;
    private double engineVolume;
    private String transmission;
    private int year;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seats == car.seats &&
                Double.compare(car.engineVolume, engineVolume) == 0 &&
                year == car.year &&
                Objects.equals(type, car.type) &&
                Objects.equals(transmission, car.transmission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, seats, engineVolume, transmission, year);
    }

    @Override
    public String toString() {
        return "Car[" +
                "type='" + type + '\'' +
                ", seats=" + seats +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", year=" + year +
                ']';
    }

    public static class Builder{
        private Car newCar;
        public Builder(){
            newCar = new Car();
        }
        public Builder withType(String type){
            newCar.type = type;
            return this;
        }
        public Builder withSeats(int seats){
            newCar.seats = seats;
            return this;
        }
        public Builder withEngineVolume(double engineVolume){
            newCar.engineVolume = engineVolume;
            return this;
        }

        public Builder withTransmission(String transmission){
            newCar.transmission = transmission;
            return this;
        }

        public Builder withYear(int year){
            newCar.year = year;
            return this;
        }


        public Car build(){
            return newCar;
        }
    }
}