package com.ohgiraffers.section01.extend;

public class Car {

    /* 설명. 자동차의 달리는 상태를 확인할 수 있는 필드 */
    private boolean isRunning;

    /* 설명. 기본생성자 */
    public Car() {
        System.out.println("[Car] 기본 생성자 호출됨..." );
    }

    public void run() {
        isRunning = true;
        System.out.println("[Car.run] 자동차가 달립니다~~");
    }

    public void soundHorn() {

        if(isRunning()) {
            System.out.println("[Car.soundHorn] 빵! 빵! ");
        } else {
            System.out.println("[Car.soundHorn] 주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }

    }

//    private boolean isRunning() {
    /* 설명. 처음에는 private으로 작성했지만, 나중에 FireCar 클래스를 작성하는 도중,
     *  protected로 바꿔야 하는 흐름이 생김.
     * */
    protected boolean isRunning() {
        return isRunning;
    }

    public void stop() {
        isRunning = false;
        System.out.println("[Car.stop] 자동차가 멈춥니다.");
    }


}
