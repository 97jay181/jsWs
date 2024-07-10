package com.ohgiraffers.section02.encapsulation.problem2;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. */
        /* 설명.
         *  필드의 이름이나 자료형을 변경할 때 사용한 쪽 모두 코드를 수정해야 하는 경우가 생긴다.
         *  즉, 작은 변경이 사용하는 다른 여러 곳의 변경도 함께 초래하게 된다.
         * */

        /* 설명. monster 3마리 추가 */
        /* 설명. 필드 변수의 이름을 name에서 kinds로 변경하는 순간, 해당 필드를 호출한 모든 라인에서 에러가 발생한다.
         *  그리고 코드 변경에 대한 책임이 따르게 된다. */

        /* 설명.
         *  name -> kinds로 변경했기 때문에 직접 name 필드에 접근하는 코드는 모두 컴파일 에러를 발생기킨다.
         *  즉, Monster 클래스의 일부를 수정한 것 뿐인데 사용하는 곳에서는 전부 함께 수정해야 하는
         *  부담이 생긴 것이다
         *  이는 유지 보수성에 악영향을 미친다.
         * */
//        Monster m1 = new Monster();
//        m1.name = "아구몬";
//        m1.hp = 200;
//
//        Monster m2 = new Monster();
//        m2.name = "워그레이몬";
//        m2.hp = 200;
//
//        Monster m3 = new Monster();
//        m3.name = "오메가몬";
//        m3.hp = 300;
//
//        System.out.println("몬스터의 이름은 = " + m1.name);
//        System.out.println("몬스터의 체력은 = " + m1.hp);
//        System.out.println("----------------------------------");
//        System.out.println("몬스터의 이름은 = " + m2.name);
//        System.out.println("몬스터의 체력은 = " + m2.hp);
//        System.out.println("----------------------------------");
//        System.out.println("몬스터의 이름은 = " + m3.name);
//        System.out.println("몬스터의 체력은 = " + m3.hp);
//        System.out.println("----------------------------------");




    }
}
