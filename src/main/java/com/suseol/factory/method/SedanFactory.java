package com.suseol.factory.method;

public class SedanFactory implements CarFactory {
    @Override
    public Sedan createCar() {
        return new Sedan();
    }
}
