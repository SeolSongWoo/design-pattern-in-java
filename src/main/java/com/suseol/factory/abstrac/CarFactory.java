package com.suseol.factory.abstrac;

public interface CarFactory{
    Car createCar();

    default Engine createEngine() {
        return new Engine() {
            @Override
            public void start() {
                System.out.println("Engine started");
            }
        };
    }
}
