package com.ohgiraffers.section01.exception;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. try-catch 블럭을 이용해 예외처리를 할 수 있다. */

        /* 목차 3. try-catch를 이용한 방법(예외 발생하지 않음) */

        /* 설명.  ExceptionTest 인스턴스 생성 */
        ExceptionTest et = new ExceptionTest();

        /* 설명. try : 예외 발생 가능성이 있는 명령어들을 기입하는 부분 */
        try {
            et.checkEnoughMoney(60000, 50000);
            System.out.println("[다행] 상품 구입 가능");
        } catch (Exception e) {
            System.out.print("[저런] 상품 구입 불가");
            e.printStackTrace();
        }
        System.out.println(" 프로그램 종료 ....");
    }
}
