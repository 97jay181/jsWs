package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private final Car car = new Car();

    public void engineOn(){
        car.startUp();
    }

    public void stepAccelerator() {
        car.go();
    }

    public void stepBrake() {
        car.stop();
    }

    public void engineOff() {
        car.turnOff();
    }
}
