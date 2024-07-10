package com.ohgiraffers.section01.method;

public class Application2 {

    /* 수업목표. 다른 흐름의 메소드 호출 흐름에 대해 이해할 수 있다. */

    public static void main(String[] args) {

        System.out.println("main() 메서드 시작됨...");

        Application2 app1 = new Application2();     // int numA = 10;
        app1.methodA();
        app1.methodB();
        app1.methodC();

        System.out.println("main() 메서드 종료됨...");

    }

    public void methodA() {

        System.out.println("methodA() 호출됨...");
        System.out.println("methodA() 종료됨...");


    }
    
    public void methodB(){

        System.out.println("methodB() 호출됨...");
        System.out.println("methodB() 종료됨...");

    }

    public void methodC(){

        System.out.println("methodC() 호출됨...");
        System.out.println("methodC() 종료됨...");
    }
}
