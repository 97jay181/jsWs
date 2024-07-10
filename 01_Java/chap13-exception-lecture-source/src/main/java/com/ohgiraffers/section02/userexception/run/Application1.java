package com.ohgiraffers.section02.userexception.run;

import com.ohgiraffers.section02.userexception.exception.BalanceNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughBalanceException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 사용자정의 예외 클래스를 정의하고, 발생한 사용자 정의의 예외를 처리할 수 있다. */

        /* 설명.
         *  사전(in advance)에 정의되어 있는 Exception의 종류는 굉장히 많이 있다.
         *  하지만 RuntimeException의 후손 대부분은 예외처리를 강제화 하지 않는다.
         *  간단한 조건문등으로 처리가 가능하기 때문에 따로 강제화 하지 않았다.
         * */

        /* 설명.
         *  사전에 정의된 예외클래스 외에 개발자가 원하는 명칭의 예외클래스를 작성하는 것이 가능하다.
         *  extends Exception으로 예외처리 클래스를 상속받아 더 구체적인 예외 이름을 정의하는 것이다.
         *  여기서는 사용자 정의의 예외처리로 아까 만들었던 프로그램을 조금 더 업그레이드를 시켜보자
         * */

        ExceptionTest et = new ExceptionTest();

        try {
            /* 목차. 1. 상품의 가격이 음수일 때 */
//            et.checkEnoughMoney(-5000, 30000);

            /* 목차. 2. 잔돈이 음수일 때 */
//            et.checkEnoughMoney(5000, -30000);

            /* 목차. 3. 상품의 가격보다 잔돈이 더 적을 때 */
            et.checkEnoughMoney(50000, 30000);

        } catch (Exception e) {
            e.printStackTrace();
        } catch (NotEnoughBalanceException e) {
            throw new RuntimeException(e);
        }

    }
}
