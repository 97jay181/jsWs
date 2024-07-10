package com.ohgiraffers.section01.method;

public class Application8 {

    public static void main(String[] args) {

        /* 수업목표. static 메소드를 호출할 수 있다. */

        /* 설명. static 메소드 호출
         *  우리가 지금 작성하고 있는 메소드를 보면 public과 void 사이에 static이라는 키워드가 존재한다.
         *  static 키워드에 대해서는 뒤에서 다시 다루게 될 예정이지만,
         *  static 메소드를 호출하는 방법부터 먼저 가볍게 학습해본다.
         *  static이 있는 메소드던, non-static 메소드던 간에 메소드 동작 흐름은 동일하다. */

        /* 필기. static 메소드를 호출하는 방법
         *  클래스명.메소드명();
         *  */
//        Application8.sumTwoNumbers(10,20);
        System.out.println("10과 20의 합 = " + Application8.sumTwoNumbers(10,20));

        /* 필기. 동일한 클래스 내에서 작성된 static 메소드는 클래스명 생략이 가능하다. */
        System.out.println("10과 20의 합 = " + sumTwoNumbers(10,20));

    }

    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }
}
