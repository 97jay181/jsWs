package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String [] args){

        /* 수업목표. 사용자 지정 범위의 난수를 발생시킬 수 있다.*/
        /* 필기.
         *  난수의 활용
         *  Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수값을 반환한다.
         *  필요에 따라 정수 형태의 값을 원하는 범위 만큼 발생시켜야 하는 경우들이 존재한다.
         * */

        /* 필기.
         *  Tip: 원하는 범위의 난수를 구하는 공식
         *  (int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
         * */

        /* 목차. 1. Q) 0 ~ 9까지의 난수(정수) 발생시켜보기 */
        int random1 = (int) (Math.random() * 10);
        System.out.println("random1 = " + random1);

        /* 목차. 2. Q) 1 ~ 10까지의 난수 발생시켜보기 */
        int randem2 = (int) (Math.random() * 10) + 1;
        System.out.println("random2 = " + randem2);

        /* 목차. 3. Q) 10 ~ 15까지의 난수 발생시켜보기 */
        int ll = 10;
        int random3 = (int) (Math.random() * 6) + 10;
        System.out.println("random3 = " + random3);

        /* 목차. 4. Q) -128 ~ 127 까지의 난수 발생시켜보기 */
        int random4 = (int) (Math.random() * 256) - 128;
        System.out.println("random4 = " + random4);

    }
}
