package com.suseol.factory.method;

public class Client {

    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        CarFactory suvFactory = new SUVFactory();

        Car sedan = sedanFactory.createCar();
        Car suv = suvFactory.createCar();

        sedan.drive();
        suv.drive();
    }
}
