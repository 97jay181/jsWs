package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 여러가지 값의 형태를 출력할 수 있다. */
        /* 수업목표. 여러가지 값의 형태를 출력할 수 있다. */

        /* 목차. 1. 숫자 형태의 값 */
        /* 목차. 1.1.  정수 형태의 값 출력 */
        System.out.println(123);    // 노트. 나중에 다시 볼것

        /* 목차. 1.2. 실수 형태의 값 출력 */
        System.out.println(12.3);

        /* 목차. 2. 문자 형태의 값 출력 */
        System.out.println('a');    // 문자 형태의 값은 홀따옴표(single quotation)으로 감싸주어야 함.
//        System.out.println('ab');   // 두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//        System.out.println('');     // 아무 문자도 기록되지 않은 경우도 에러가 발생한다.
        System.out.println('1');    // 숫자 값이지만, 홀따옴표로 감싸져 있다면 컴퓨터는 이를 문자'1'로 판단한다.

        /* 목차. 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요");    // 문자열은 문자 여러개가 나열된 형태를 말하며, 쌍따옴표(double quotation)으로 감싸주어야 함.
        System.out.println("123");           // 정수임에도 쌍따옴표로 감싸주었기 때문에 문자열로 취급된다.
        System.out.println("");              // 아무 값도 없는 빈 쌍따옴표는 문자열로 취급한다. -> 빈 문자열(empty String)
        System.out.println("a");             // 한 개의 문자임에도 쌍따옴표로 감싸면 문자열로 취급한다.(문자 'a'와는 다름!)

        /* 목차. 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println(false);  // 여기서 true 혹은 false값을 '논리형(logical type); 이라고 부른다.
    }
}
