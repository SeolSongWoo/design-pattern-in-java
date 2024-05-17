package com.suseol.factory.abstrac;


public class SedanFactory implements CarFactory {
    @Override
    public Sedan createCar() {
        return new Sedan();
    }

    @Override
    public Engine createEngine() {
        return new SedanEngine();
    }
}
