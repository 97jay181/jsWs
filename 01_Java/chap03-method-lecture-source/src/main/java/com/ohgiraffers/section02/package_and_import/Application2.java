package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.minNumberOf;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 임포트에 대해 이해할 수 있다. */
        /* 필기.
         *  임포트란?
         *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
         *   하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
         *   그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
         *   import는 package 선언문과 class 선언문 사이에 작성하며
         *   어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
         * */

        Calculator calc = new Calculator();
        int max = calc.maxNumberOf(10,20);

        System.out.println("10과 20중 더 큰 수는? = " + max);

        /* 목차. 2. static method의 경우 #1 */
        int min = minNumberOf(10,20);

        System.out.println("10과 30중 더 작은 값은 ? = " + min);

        /* 목차. 3. static method의 경우 #2 */
        int min2 = minNumberOf(10,20);

    }
}
