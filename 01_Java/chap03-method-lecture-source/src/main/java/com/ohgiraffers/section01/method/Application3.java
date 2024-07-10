package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 메소드 전달 인자와 매개변수에 대해 이해하고 메소드 호출 시 사용할 수 있다.*/
        /* 필기. 전달인자(argumetns)와 매개변수(parameter)
         *  전달인자와 매개변수를 이용한 메소드 호출 -> 지금까지 우리가 배운 변수는 모두 지역변수(local vaiable)에 해당된다.
         *  */

        /* 필기.
         *  1. 지역 변수
         *  2. 매개 변수
         *  3. 전역 변수 -> field variable
         *  4. 클래스 변수
         *  */

        /* 필기.
         *  지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. -> 이것을 지역변수의 스코프(scope)라 부른다.
         *  다른 메소드간 서로 공유해야 하는 값이 존재한다면, 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
         *  이떄 전달하는 값을 전달인자(argument)라고 부르고,
         *  메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
         */
        Application3 app3 = new Application3();

        /* 필기. 전달인자와 매개변수를 이용한 메소드 호출 테스트*/
        /* 목차. 1. 전달인자로 값 전달 테스트 */
        /* 설명. 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형과 개수, 순서가 일치하게 값을 넣어 호출해야한다. */
        app3.testMethod(20);      // 20을 전달인자(arguments) 라고 함
//        app3.testMethod("20");        // 매개변수의 타입이 맞지 않아 에러
//        app3.testMethod(20,30);       // 매개변수의 개수가 맞지 않아 에러
//        app3.testMethod();            // 매개변수의 개수가 맞지 않아 에러

        /* 목차. 2. 변수에 저장한 값 전달 테스트 */
        /* 목차. 2-1. 변수에 저장된 값을 이용하여 값을 전달할 수 있다. */
        int age = 20;
        app3.testMethod(age);
        /* 목차. 2-2. 자동형변환을 이용하여 값을 전달할 수 있다. */
        byte byteAge = 30;
        app3.testMethod(byteAge);   // 자동형변환이 된 상황임

        /* 목차. 2-3. 강제형변환을 이용하여 값을 전달할 수 있다. */
        long longAge = 40;
        app3.testMethod((int) longAge);

        /* 목차. 2-4. 연산결과를 이용하여 값을 전달할 수 있다. */
        app3.testMethod(++age * 3);

    }

    public void testMethod(int age) { // int age 매개변수(parameter) 매개변수명 일괄변경시 단축키 : fn + shift + F6
        System.out.println("당신의 나이는 " + age + "세 입니다.");

    }
}
