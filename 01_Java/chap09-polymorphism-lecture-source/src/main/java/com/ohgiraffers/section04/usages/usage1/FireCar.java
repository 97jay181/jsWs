package com.ohgiraffers.section04.usages.usage1;

public class FireCar extends Car implements Soundable {

    @Override
    public void go() {
        System.out.println("(C)[FireCar] 소방차가 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("(C)[FireCar] 소방차가 멈춥니다.");
    }

    @Override
    public void horn() {
        System.out.println("(C)[FireCar] 소방차가 지나갑니다~ 뿌웅~");
    }
}
