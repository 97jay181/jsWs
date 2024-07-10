package com.ohgiraffers.section02.encapsulation.problem3;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 필드에 직접 접근시 발생하는 문제를 해결하는 방법을 이해하고 적용할 수 있다. */
        /* 설명. 몬스터 객체를 여러개 생성해보자. */
        Monster m1 = new Monster();
        m1.setName("파닥몬");
        m1.setHp(100);

        Monster m2 = new Monster();
        m2.setName("엔젤몬");
        m2.setHp(200);

        Monster m3 = new Monster();
        m3.setName("홀리엔젤몬");
        m3.setHp(300);

        Monster m4 = new Monster();
        m4.setName("세라피몬");
        m4.setHp(400);

        System.out.println(m1.getInfo());
        System.out.println(m2.getInfo());
        System.out.println(m3.getInfo());
        System.out.println(m4.getInfo());

        /* 설명. 문제없이 잘 동작한다.
         *  이제 Monster 클래스의 필드 변수 name을 kinds로 바꿔보자.   */

    }
}
