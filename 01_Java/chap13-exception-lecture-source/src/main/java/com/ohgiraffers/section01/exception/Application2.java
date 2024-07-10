package com.ohgiraffers.section01.exception;

import java.io.IOException;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. try-catch 블럭을 이용해 예외처리를 할 수 있다. */

        /* 목차 2. try-catch를 이용한 방법(예외 발생하지 않음) */

        /* 설명.  ExceptionTest 인스턴스 생성 */
        ExceptionTest et = new ExceptionTest();

        /* 설명. try : 예외 발생 가능성이 있는 명령어들을 기입하는 부분 */
        try {
            et.checkEnoughMoney(60000, 50000);
            System.out.println("[다행] 상품 구입 가능");
        } catch (Exception e) {
            /* 설명. catch(E e) : try구문 내에서 명령어를 실행하다가 예외가 발생(throw) 했을 떄,
            *   catch문의 매개변수로 존재하는 타입의 예외가 try구문 내에서 발생한 예외와 같거나
            *   더 넓은 범위의 예외 클래스라면 catch문 내 명령어들이 동작함.
            *   만약 범위가 다르다면 해당 catch문은 동작할 수 없음.
            * */
            System.out.println("[저런] 상품 구입 불가");
        }
        System.out.println(" 프로그램 종료 ....");
    }
}
