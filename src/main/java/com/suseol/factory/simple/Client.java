package com.suseol.factory.simple;

public class Client {

    public static void main(String[] args) {
        Car car = SimpleCarFactory.createCar("Sedan");
        car.drive();
    }
}
