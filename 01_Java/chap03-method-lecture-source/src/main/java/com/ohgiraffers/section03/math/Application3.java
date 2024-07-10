package com.ohgiraffers.section03.math;

import java.util.Random;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. java.util.Random 클래스를 활용하여 사용자 지정 범위의 난수를 발생시킬 수 있다. */
        /* 필기.
         *  java.util.Random 클래스
         *  java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
         *  nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환
         * */

        /* 필기.
         *  원하는 범위의 난수를 구하는 공식
         *  random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
         * */

        Random random = new Random();


        /* 목차. 1. Q) 0 ~ 9 까지의 난수 발생시켜보기 */
        int random1 = random.nextInt(10);
        System.out.println("random1 = " + random1);


        /* 목차. 2. Q) 1 ~ 10 까지의 난수 발생시켜보기 */
        int random2 = random.nextInt(10) + 1;
        System.out.println("random2 = " + random2);


        /* 목차. 3. Q) 10 ~ 15 까지의 난수 발생시켜보기 */
        int random3 = random.nextInt(6) + 10;
        System.out.println("random3 = " + random3);


        /* 목차. 4. Q) -128 ~ 127 까지의 난수 발생시켜보기 */
        int random4 = random.nextInt(256) - 128;
        System.out.println("random4 = " + random4);





    }
}
