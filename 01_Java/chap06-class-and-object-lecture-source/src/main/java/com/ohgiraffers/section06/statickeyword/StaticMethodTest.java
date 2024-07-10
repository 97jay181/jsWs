package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {
        System.out.println("nonStaticMethod() 호출됨...");
        /* 설명. 인스턴스 생성 후 사용 가능한 메소드이기 떄문에 this에는 주소가 들어있을 것이다. */
        this.count++;
        System.out.println("nonStaticMethod() 종료됨...");

    }

    public static void staticMethod() {
        System.out.println("staticMethod() 호출됨...");
        /* 설명. 인스턴스 생성하지 않고 사용하는 메소드이기 떄문에 this에는 주소가 들어갈 수 없다. */
//        this.count++;
        System.out.println("staticMethod() 종료됨...");
    }
}
