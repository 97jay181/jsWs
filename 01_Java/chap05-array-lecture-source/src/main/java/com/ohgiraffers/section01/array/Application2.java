package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 사용 방법을 익혀 배열을 사용할 수 있다. */
        /* 필기.
         *  배열의 사용 방법
         *  1. 배열의 선언
         *  2. 배열의 할당
         *  3. 배열의 인덱스 공간에 값 대입
         * */

        /* 목차. 1. 배열의 선언 */
        /* 필기.
         *  자료형[] 변수명;
         *  자료형 변수명[]; 로 선언할 수 있다.
         * */

        int[] iarr;
        char[] carr;
        String[] sarr;
        Object[] oarr;

        iarr = new int[5];
        carr = new char[10];

        int[] iarr2 = new int[5];
        char[] carr2 = new char[10];

        System.out.println("iarr2 = " + iarr2);
        System.out.println("carr2 = " + carr2);

        System.out.println("iarr2의 hashcode = " + iarr2.hashCode());
        System.out.println("carr2의 hashcode = " + carr2.hashCode());

        System.out.println("iarr2의 길이 = " + iarr2.length);
        System.out.println("carr2의 길이 = " + carr2.length);


        Scanner sc = new Scanner(System.in);

        System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];  // int의 기본값이 0이라서 [0]이 됨

        System.out.println("darr의 hashcode = " + darr.hashCode());
        System.out.println("darr의 길이 = " + darr.length);

        /* 설명. 한번 할당된 배열은 삭제할 수 없다.
         *  다만, 레퍼런스 변수(참조형 변수)를 null로 변경하여 더 이상 주소를 참조할 수 없게된 배열은
         *  일정 시간이 지난 후 heap의 old 영역(old generation)으로 이동하여 GC(가비지 커렉터)가 회수해간다.
         *  한 번 찾아갈 수 있는 주소값을 잃어버린 배열은 다시 참조할 수 없다.   */
        darr = null;

//        System.out.println("삭제된 후 darr의 길이 = " + darr.length);        // NullPointerException 발생!!!

    }
}
