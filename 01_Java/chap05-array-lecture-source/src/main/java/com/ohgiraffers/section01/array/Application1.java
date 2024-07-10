package com.ohgiraffers.section01.array;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 배열에 대해 이해하고 배열의 사용 목적을 이해할 수 있다. */
        /* 필기.
         *  배열(Array)이란?
         *  동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도) 이다.
         *  배열은 heap 영역에 new 연산자를 이용하여 할당한다.
         * */

        /* 필기.
         *  배열의 사용 이유
         *  만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
         *  1. 연속된 메모리 공간으로 관리할 수 없다. (모든 변수의 이름을 사용자가 관리해야 한다.)
         *  2. 반복문을 이용한 연속 처리가 불가능하다.
         * */

        /* 설명.
         *  변수 5개에 값을 저장한다.
         *  이 때 사용자(개발자)는 변수의 이름을 모두 알아야 한다.
         * */

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int n4 = 40;
        int n5 = 50;

        int sum = 0;

        sum += n1;
        sum += n2;
        sum += n3;
        sum += n4;
        sum += n5;

        System.out.println("sum = " + sum);

        /* 필기. 배열의 선언과 할당 */
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        /* 설명. 배열에 값을 대입할 떄 for문을 활용할 수 있다. */
        for(int i = 0, v = 0; i < arr.length; i++) { // 이렇게 써도 되긴 하는데 비추다. 가독성 별로~~~
            arr[i] = v += 10;
        }

        /* 설명. 배열에 값을 누적해서 담을 수 있다. */
        int sum2 = 0;
        
        sum2 += arr[0];
        sum2 += arr[1];
        sum2 += arr[2];
        sum2 += arr[3];
        sum2 += arr[4];

        System.out.println("sum2 = " + sum2);

        /* 설명. 배열의 값을 반복문을 이용해 누적해서 담을 수 있다. */
        int sum3 = 0;
        
        for(int i = 0; i <= arr.length - 1;  i++) {
            sum3 += arr[i];
        }

        System.out.println("sum3 = " + sum3);
    }
    
}
