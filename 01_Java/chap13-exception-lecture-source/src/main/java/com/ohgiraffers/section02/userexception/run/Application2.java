package com.ohgiraffers.section02.userexception.run;

import com.ohgiraffers.section02.userexception.exception.BalanceNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughBalanceException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 다양한 타입의 예외를 Multi-block을 이용해서 처리할 수 있다.  */



        ExceptionTest et = new ExceptionTest();

        try {
            /* 목차 1. 상품의 가격이 음수일 때 */
            et.checkEnoughMoney(-5000, 30000);

            /* 목차 2. 잔돈이 음수일 때 */
//            et.checkEnoughMoney(5000, -30000);

            /* 목차 3. 상품의 가격보다 잔돈이 더 적을 때 */
//            et.checkEnoughMoney(50000, 30000);



        } catch (BalanceNegativeException e) {
            System.out.println("[예외] BalanceNegativeException 발생!");
            System.out.println(e.getMessage());
        } catch (PriceNegativeException e) {
            System.out.println("[예외] {PriceNegativeException 발생!");
            System.out.println(e.getMessage());
        } catch (NotEnoughBalanceException e) {
            System.out.println("[예외] NotEnoughBalanceException 발생!");
            System.out.println(e.getMessage());
        } finally {{
            /* 설명. 예외 발생 여부와 관계 없이 항상 실행되는 내용 */
            System.out.println("finally 블럭 동작함...");
        }
            System.out.println("프로그램 종료...");

        }
    }
}
