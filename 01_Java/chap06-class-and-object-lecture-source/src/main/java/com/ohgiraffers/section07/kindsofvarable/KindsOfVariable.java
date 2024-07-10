package com.ohgiraffers.section07.kindsofvarable;

public class KindsOfVariable {

    /* 수업목표. 다양한 변수들을 이해하고 사용할 수 있다. */

    /* 필기. 클래스 영역에 작성되는 변수를 '필드(field)' 라고 부른다.
     *  필드 == 멤버 변수(클래스가 가지는 멤버라는 의미
     *       == 전역 변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
     * */

    /* 필기. non-static field를 '인스턴스 변수(instance variable)' 이라고 부른다.
     *  -> 인스턴스 생성 시점에 사용 가능한 변수라는 의미
     * */
    private int globalNum;

    /* 필기. static field를 '정적 필드(static field)', 또는 '클래스 변수(class variable)'라고 부른다.
     *  -> 정적(static; 클래스) 영역에 생ㅅ헝되는 변수라는 의미
     * */
    private static int staticNum;

    public void testMethod(int num) {
        int localNum;   // 지역 변수 == 인스턴스 변수

        /* 필기. 메소드 영역에서 작성되는 변수를 '지역변수(local variable)'라고 부른다.
         *  특히 메소드의 괄호 안에 선언하는 변수를 '매개변수(parameter)' 라고 한다.
         *  (매개변수도 일종의 지역변수라고 생각하면 됨.
         *  지역변수와 매개변수 모두 메소드 호출시 stack을 할당받아 stack area에 생성(할당)된다.
         * */
        int loalNum;

        System.out.println("num = " + num);     // 매개변수는 호출시 값이 넘어오기 때문에 초기화가 필요 없다.
//        System.out.println("loalNum = " + loalNum);     // 지역변수를 사용하기 위해선 초기화가 필요하다.
        System.out.println("globalNum = " + globalNum);     // 전역변수는 클래스 전역에서 사용가능.
        KindsOfVariable KindsOfVariable = null;
        System.out.println("staticNum = " + KindsOfVariable.staticNum);

        /* 설명. 지역변수는 정해진 메소드 블럭 내에서만 사용가능 */
//        System.out.println(loalNum);
//        System.out.println("num = " + num);
    }
    
    public void testMethod2() {
        System.out.println("globalNum = " + globalNum);
    }

}
