package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 접근제한자에 대해 이해하고 직접 필드에 접근하지 못하게 '문법적으로' 강제화할 수 있다. */

        /* 설명.
         *  Monster 클래스의 필드를 private으로 설정하고 객체를 생성한 뒤 필드에 직접 접근하면 컴파일 에러가 발생.
         *  접근을 허용하지 않았기 떄문에 직접 접근할 수 없다는 에러가 발생한다.
         *  메소드를 통해 간접 접근하도록 문법적으로 강제시킨 것이다.
         * */

        /* 목차1. private 필드에 직접 접근하여 Compile Error 발생 확인 */

        Monster m1 = new Monster();
//        m1.kinds = "가루몬";     // 접근에러발생
//        m1.hp = 100;             // 접근에러발생

        /* 필기.
         *  선언한 필드대로 공간은 생성되어 있으나,
         *  직접 접근하지 못하고 public으로 선언된 접근을 허용한 메소드만 이용할 수 있도록 해 놓은 것이다.
         *  이것을 우리가 캡슐화(encapsulation)라고 한다.
         * */

        m1.setKinds("팔몬");
        m1.setHp(130);

//        String infoOfMonster = "";
//        infoOfMonster = m1.getInfo();
//
//        System.out.println("infoOfMonster = " + infoOfMonster);
        System.out.println(m1.getInfo());

        System.out.println(m1.getKinds());
        System.out.println(m1.getHp());

        /* 설명.
         *  캡슐화는 유지보수성을 증가시키기 위해 필드의 직접 접근을 제한하고
         *  public 메소드를 이용해서 간접적ㅇ로 접근하여 사용할 수 있도록 만든 기술이다.
         *  클래스 작성 시 특별한 목적이 아닌 이상 캡슈화가 기본 원칙으로 사용되고 있다.
         * */


    }
}
