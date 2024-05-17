package com.suseol.factory.simple;

public class SimpleCarFactory {

    public static Car createCar(String type) {
        if ("Sedan".equalsIgnoreCase(type)) {
            return new Sedan();
        } else if ("SUV".equalsIgnoreCase(type)) {
            return new SUV();
        }
        return null;
    }
}
