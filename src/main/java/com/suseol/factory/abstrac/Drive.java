package com.suseol.factory.abstrac;

public class Drive {
    private final Car car;
    private final Engine engine;

    public Drive(Car car, Engine engine) {
        this.car = car;
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        car.drive();
    }
}
