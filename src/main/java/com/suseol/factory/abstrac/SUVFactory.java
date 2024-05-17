package com.suseol.factory.abstrac;

public class SUVFactory implements CarFactory {

    @Override
    public SUV createCar() {
        return new SUV();
    }

    @Override
    public Engine createEngine() {
        return new SUVEngine();
    }
}
