package com.ohgiraffers.section02.userexception.run;

import com.ohgiraffers.section02.userexception.exception.BalanceNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughBalanceException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. Multi-catch 블럭으로 동일한 레벨의 다른 타입의 예외를 하나의 catch 블럭으로 처리할 수 있다.  */

        ExceptionTest et = new ExceptionTest();

        try {
            /* 목차 1. 상품의 가격이 음수일 때 */
            et.checkEnoughMoney(-5000, 30000);

            /* 목차 2. 잔돈이 음수일 때 */
//            et.checkEnoughMoney(5000, -30000);

            /* 목차 3. 상품의 가격보다 잔돈이 더 적을 때 */
//            et.checkEnoughMoney(50000, 30000);

        } catch (BalanceNegativeException | PriceNegativeException e) {
            /* 설명. e.getClass()로 발생한 예외 클래스의 이름을 알 수 있음. */
            System.out.println("[예외] " + e.getClass() + "발생!");
            System.out.println(e.getMessage());
        } catch (NotEnoughBalanceException e) {
            /* 설명. e.printStackTrace() : 예외 클래스명, 예외 발생 위치, 예외 메시지 등을
             *  Stack 호출 역순으로 빨간색 글씨를 이용해 로그 형태로 출력해주는 메소드
             * */
            e.printStackTrace();
        } finally {{
            /* 설명. 예외 발생 여부와 관계 없이 항상 실행되는 내용 */
            System.out.println("finally 블럭 동작함...");
        }

        System.out.println("프로그램 종료...");

        }
    }
}
