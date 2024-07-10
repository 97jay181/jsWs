package com.ohgiraffers.section01.method;

public class Calculator {

    /**
     * @autor   owl
     * @version 0.5.1
     * @
     *  내가 만든 <b>멋진</b> 계산기. <br>
     *  <hr>
     *  <{@code public static void main} 코드로 보이나?
     */

    /**
     * 두 개의 정수를 받고, 그중 큰 수를 반환.
     *  @param first - 첫 번째 정수
     *  @param second - 두 번쨰 정수
     *  @return 둘 중 큰 정수 */

    public int maxNumberOf(int first, int second) {
        return (first > second) ? first : second;     // return (조건식) ? 참일때 : 거짓일때;
    }

    public static int minNumberOf(int first, int second) {
        return (first < second) ? first : second;
    }
}
