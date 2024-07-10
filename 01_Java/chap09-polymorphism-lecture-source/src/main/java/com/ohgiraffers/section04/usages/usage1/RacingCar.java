package com.ohgiraffers.section04.usages.usage1;

public class RacingCar extends Car {

    @Override
    public void go() {
        System.out.println("(C)[RacingCar] 레이싱카가 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("(C)[RacingCar] 레이싱카가 멈춥니다.");
    }
}
