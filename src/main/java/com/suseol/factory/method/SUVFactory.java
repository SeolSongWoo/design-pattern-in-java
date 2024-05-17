package com.suseol.factory.method;

public class SUVFactory implements CarFactory{

    @Override
    public SUV createCar() {
        return new SUV();
    }
}
