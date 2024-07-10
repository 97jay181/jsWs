package com.ohgiraffers.section02.userexception.run;

import com.ohgiraffers.section02.userexception.exception.BalanceNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughBalanceException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int balance)
            throws PriceNegativeException, BalanceNegativeException, NotEnoughBalanceException {
        /* 설명. 더 넓은 범위를 핸들링할 수 잇는 상위 예외 클래스를 선언해도 됨. */
//            throws Exception {

        if (price < 0) {
            throw new PriceNegativeException("[어익후~~ 저런!!] 상품의 가격은 음수일 수 없습니다. :" + price + "원을 입력함...");
        }

        if (balance < 0) {
            throw new BalanceNegativeException("[어익후~~~ 저런] 잔돈은 음수일 수 없습니다. " + balance + "원을 입력함...");
        }

        if (balance < price) {
            throw new NotEnoughBalanceException("[어익후!!! 저런] 잔돈보다 구매하려는 상품의 가격이 더 비쌉니다. : price=" + price + ", balance=" + balance );
        }

        System.out.println("즐거운 쇼핑 되시길 바랍니다~~");
    }
}
