package com.ohgiraffers.section03.constant;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 상수에 대해 이해하고 사용할 수 있다. */

        /* 필기.
         *  상수란?
         *  변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념이다.
         *  변하지 않는 값을(항상 고정된 값을) 저장해두기 위한 메모리상의 공간을 상수라고 한다.
         *
         * 필기.
         *  상수의 사용 목적
         *  변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
         *  초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.
         *  예) 수학 공식에 사용되는 수치 등
         *
         * 필기.
         *  사용방법
         *  1. 상수를 선언한다. (변수 선언과 유사하지만 final 키워드를 사용함)
         *  2. 값을 초기화 한다. (초기화 이후에는 값 변경 불가능함)
         *  3. 필요한 위치에 상수를 호출해서 사용한다.
         * */

        /* 목차. 1. 상수선언 */
        final int AGE;
        final int MAX_AGE = 30;

        /* 목차. 2. 초기화 */
        AGE = 10;
//        AGE = 20;
//        MAX_AGE = 40;

        /* 목차. 3. 필요한 위치에서 상수 호출 */
        System.out.println("AGE = " + AGE);
        System.out.println("AGE * 2 = " + (AGE * 2));

        int num = AGE;
        int numDouble = AGE * 2;
        System.out.println("num = " + num);
        System.out.println("numDouble = " + numDouble);

    }
}
