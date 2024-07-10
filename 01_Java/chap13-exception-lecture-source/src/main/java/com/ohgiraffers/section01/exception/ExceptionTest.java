package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int balance) throws Exception {

        System.out.println("현재 귀하의 잔액은 " + balance + "원 입니다...");

        if (balance >= price) {
            System.out.println("상품을 구입하기 위한 잔액이 충분합니다...");
        } else {
            /* 설명. 강제로 예외를 발생시키는 방법
             *  예외를 발생시키고 메소드 헤드에 throws 구문을 추가한다.
             *  예외를 발생시킨 쪽(side)에서는 throws로 예외에 대한 책임을 위임하여
             *  해당 예외를 처리해야 하는 의무를 강제화 시킨다.
             * */
            throw new Exception();
        }

        System.out.println("즐거운 쇼핑 되시길 바랍니다~");
    }
}
