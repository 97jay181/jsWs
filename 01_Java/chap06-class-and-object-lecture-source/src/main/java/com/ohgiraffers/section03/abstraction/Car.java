package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn;   // 시동(초기에는 시동이 off된 상태다)
    private int speed;      // 속도

    /* 설명. 시동이 걸려있는 상태면 아무일도 안하고, 시동이 걸려있지 않은 상태면 시동을 건다. */
    public void startUp() {

        if(isOn) {
            System.out.println("이미 시동이 걸려있으므로 아무 일도 하지 않겠습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동이 꺼져있네요! 시동을 걸겠습니다. 출발 준비 완료!");
        }
    }

    /* 설명. 시동이 걸려있는 상태일 때만 해당 메소드를 호출했을 때 10km/h씩 속도를 증가시킨다. */
    public void go() {
        if(isOn) {
            System.out.print("시동이 걸려있네요. 전진전진합니다앙~!");
            this.speed += 10;
            System.out.println(" -> " + this.speed + "[km/h]");
        } else {
            System.out.println("시동 안걸려 있네요. No 출발! First 시동 on!!");
        }
    }

    /* 설명. 시동이 걸려있고, 달리는 상태인 경우에만(속도가 0이 아님) 멈출 수 있다. */
    public void stop() {
        if (isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다...! -> " + this.speed + "[km/h]");
            } else {
                System.out.println("시동은 걸려있는데 이미 멈춰있는 상태인데? 흐음...");
            }
        } else {
            System.out.println("시동 안걸려 있네요. No 출발! First 시동 on!!");
        }
    }

    /*설명. 시동이 걸려있는 상태인 경우 시동을 끄고, 이미 꺼진 상태라면 끌 수 없다. */
    public void turnOff() {

        if(isOn) {
            if(this.speed > 0) {
        } else {
            System.out.println("달리는 상태에서 시동 끌수 없어! 차를 우선 멈춰!");
            }
        } else {

        }
        }

}
