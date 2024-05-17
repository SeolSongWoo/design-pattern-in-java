package com.suseol.factory.abstrac;

public class Client {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        Drive sedanDrive = new Drive(sedanFactory.createCar(), sedanFactory.createEngine());
        sedanDrive.drive();

        CarFactory suvFactory = new SUVFactory();
        Drive suvDrive = new Drive(suvFactory.createCar(), suvFactory.createEngine());
        suvDrive.drive();
    }
}
