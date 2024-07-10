package com.ohgiraffers.section01.method;

public class Application1 {

    /* 수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다. */

    public static void main(String[] args) {

        System.out.println("main() 메서드 시작됨...");

        Application1 app1 = new Application1();
        app1.methodA();

        System.out.println("main() 메서드 종료됨...");

    }

    public void methodA() {

        System.out.println("methodA() 호출됨...");
        System.out.println("methodA() 종료됨...");

        methodB();

    }
    
    public void methodB(){

        System.out.println("methodB() 호출됨...");
        System.out.println("methodB() 종료됨...");

        methodC();
    }

    public void methodC(){

        System.out.println("methodC() 호출됨...");
        System.out.println("methodC() 종료됨...");
    }
}
