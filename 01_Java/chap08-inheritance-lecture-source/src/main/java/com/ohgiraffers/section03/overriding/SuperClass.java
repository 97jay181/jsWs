package com.ohgiraffers.section03.overriding;

public class SuperClass {

    /* 수업목표. 오버라이딩(overriding)에 대해 이해할 수 있다. */

    /* 설명. 오버라이딩이란?
     *  부모클래스에서 상속받은 메소드를 자식클래스에서 '재정의'하여 사용하는 것, 또는 행위.
     *
     *  설명. 오버라이딩 성립 요건 :
     *   1. 메소드의 이름이 동일할 것.
     *   2. 메소드의 리턴 타입이 동일할 것.
     *   3. 매개변수의 타입, 개수, 순서가 동일할 것.
     *   4. private 메소드는 접근 불가능 -> 오버라이딩 불가능.
     *   5. final 키워드가 사용된 메소드는 오버라이딩 불가능.
     *   6. 접근제한자는 부모메소드와 같거나, 더 넓은 범위일 것.
     *   7. 예외처리는 같은 예외이거나 더 구체적인(하위) 예외를 처리할 것.
     *      -> 예외처리(Exception Handing) 챕터에서 다룰예정
     * */

    /* 설명. 자식이 오버라이딩 할 수 있는지를 검증하기 위한 더미 메소드 */
    public void method(int num) {}

    private void privateMethod() {}

    public final void finalMethod() {}

    protected void protectedMethod() {}
}
