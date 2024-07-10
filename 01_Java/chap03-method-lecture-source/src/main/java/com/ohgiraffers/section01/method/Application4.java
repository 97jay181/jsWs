package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 여러 개의 전달인자를 이용한 메소드 호출을 할 수 있다. */
        /* 필기. 여러 개의 전달인자를 이용한 메소드 호출 테스트 */

        Application4 app4 = new Application4();

        /* 목차. 1. 여러개의 매개변수를 가진 메소드를 호출(리터럴) */
        app4.testMethod("준식", 28, '남');
//        app4.testMethod('남', 10,"준식");    // 전달인자의 개수가 맞더라도, 순서를 다르게 호출하면 에러발생. ⛔️

        /* 목차. 2. 변수에 저장된 값을 전달하여 호출할 수 있다.) */
        String name = "해리포터";
        int age = 45;
        char gender = '남';

        app4.testMethod(name, age, gender);





    }

    public void testMethod(String name, int age, char gender) {
        System.out.println("당신의 이름은 " +
                name + "이고, 나이는 " +
                age + "세 이며, 성별은 " +
                gender + " 입니다.");
    }
}
