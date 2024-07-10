package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product {

    /* 설명. SmartPhone 클래스는 Product 추상클래스를 상속받아 '구현(implement)' 한다.
     *  extends 키워드로 클래스를 상속받을 때 두개 이상의 클래스는 상속받지 못한다. -> 모호성 제거
     *  추상클래스가 가지는 추상메소드를 반드시 오버라이딩 해야한다. -> 강제성 부여
     * */
    public SmartPhone() {

        System.out.println("[SmartPhone] 기본 생성자 호출됨...");
    }

    @Override
    public void asbMethod() {
        System.out.println("[SmartPhone] Product 클래스의 absMethod()를 오버라이딩한 메소드 호출됨...");
    }

    public void printSmartPhone() {
        System.out.println("[");
    }
}
