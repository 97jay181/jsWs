package com.ohgiraffers.section04.overflow;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 오버플로우에 대해 이해할 수 있다. */

        /* 필기.
         *  자료형 별 값의 최대 범위를 벗어나는 경우, 발생한 캐리(carry)를 버림처리하고
         *  sign bit를 반전시켜 최소값으로 순환시킴.
         * */

        byte num1 = 127;
        System.out.println("num1 = " + num1);   // 127 :  byte의 최대 저장 범위

        num1++;    // num1 = num1 + 1
        System.out.println("num1++ = " + num1); // -128 : byte의 최소 저장 범위

        /* 목차. 2. 언더플로우(Underflow) */
        byte num2 = -128;
        System.out.println("num2 = " + num2);   // -128 : byte의 최소 저장 범위

        num2--;    // 1감소
        System.out.println("num2-- = " + num2); // 127 : byte의 최대 저장범위

        /* 설명
         *  이러한 오버플로우 및 언더플로우가 발생하더라도 컴파일 에러나 런타임 에러가 발생하지 않는다.
         *  그렇기에 최대값, 혹은 최소값 범위를 고려해서 코드를 작성해야 한다.
         *  ex) 키(height)를 나타내고자 하는 변수를 선언하고자 할 떄, 타입을 byte로 고른다면
         *      모든 인류의 최대 키는 127cm일 것이다.
         *  */

        int firstNum = 1000000;     // 100만
        int secondNum = 700000;     // 70만

        int multiply = firstNum * secondNum;    // 7000억이 나와야 함.
        System.out.println("firstNum * secondNum = " + multiply);       // -79,669,248

        /* 설명.
                 *  이런 현상이 발생해도 그냥 넘기는 경우가 발생할 수 있다.
                 *  이런 경우를 논리적 에러라고 표현한다. (디버깅 시 가장 힘든 이유 중 한 가지) 가지)
                * */

                /* 목차. 3.해결방법 */
                /* 필기. 오버플로우를 예측하고 더 큰 자료형으로 결과값을 받아서 처리한다. */
                long longMulti = firstNum * secondNum;

                System.out.println("longMulti : " + longMulti);       // 안되지?? 똑같지??);       // 안되지?? 똑같지??

                /* 설명.
                 *  이미 오버플로우 처리 된 결과를 가지고 변수에 담기 때문에 위에 결과랑 별 차이가 없다. 차이가 없다.
                 *  그럼 어떻게 해결을 해야 하나?
                 *  계산이 처리 되기 전에 long 타입으로 자료형을 변경해주어야 한다. (강제형변환 이용)제형변환 이용)
                 *  강제형변환은 바로 다음 파트에서 다루게 될 예정이다.
                * */
                long result = (long) firstNum * secondNum;
                System.out.println("result : " + result);   //정상적으로 7천억이 출력될 것이다.


    }
}
        