package com.ohgiraffers.section01.array;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 배열에 초기화되는 자료형별 기본값을 이해할 수 있다. */
        /* 설명.
         *  기본적으로 배열을 선언하고 할당하게 되면
         *  배열의 각 인덱스에는 자바에서 지정한 기본값으로 초기화가 된 상태가 된다.
         *  heap영역은 값이 없는 빈 공간이 존재할 수 없다.
         * */

        /* 필기.
         *  값의 형태 별 기본값
         *  정수 : 0
         *  실수 : 0.0
         *  논리 : false
         *  문자 : \u0000
         *  참조 : null
         * */

        // 1. 선언 2. 초기화
        int[] iarr = new int[5];

        // 값 대입
        /* 설명. int의 기본값인 0으로 초기화 되어있다. */
        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);
        System.out.println("==================================");

        // Run 후 실행 결과
        // 0 0 0 0 0 (한줄씩 개행됨)
        // 언제 값을 넣어줬지? -> Run 실행할때 넣어진거네

        /* 설명. 반복문을 사용해서도 확인할 수 있다. */
        for(int i = 0;  i < iarr.length; i++) {         // 자바의 배열은 배열 길이를 나타내는 length 속성을 가짐
            System.out.println("iarr[" + i + "]의 값 : " + iarr[i]);
        }

        /* 필기. Java에서 지정한 기본값(default value) 이외의 값으로 초기화를 하고 싶은 경우 블록(block)을 사용할 수 있다.
         *  블럭을 사용하는 경우엔 new 연산자를 사용하지 않아도 되며, 값의 개수만큼 자동으로 크기가 설정된다.
         * */

        int[] iarr2 = new int[] {1,2,3,4,5};    // 1. 배열 선언, 2. 초기화 진행함

        int[] iarr3 = {11, 22, 33, 44, 55};     // 축약형

        System.out.println("===============================");
        System.out.println("iarr2의 길이 : " + iarr2.length);
        System.out.println("iarr3의 길이 : " + iarr3.length);
        System.out.println("===============================");

        for(int i = 0; i <= iarr2.length - 1; i++) {
            System.out.println("iarr[" + i + "] : " + iarr2[i]);
        }

        for(int i = 0; i <= iarr3.length - 1; i++) {
            System.out.println("iarr[" + i + "] : " + iarr3[i]);
        }

        String[] sarr = {"apple", "banana" , "grape", "orange"};
        System.out.println("sarr의 길이 : " + sarr.length);

        for(int i = 0; i <= sarr.length - 1; i++) {
            System.out.println("sarr[" + i + "]: " + sarr[i]);
        }
    }
}
