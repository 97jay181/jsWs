package com.ohgiraffers.section03.overriding;

/* 설명. extends SuperClass를 작성해줘야 상속 관계에 놓이게 되고, 오버라이딩 할 수 있는 최소 조건이 성립된다. */
public class SubClass extends SuperClass {

    /* 목차 1. 메소드 이름 변경 -> 에러 */
//    @Override
//    public void method(int num) {}

    /* 목차 2. 메소드 리턴 타입 변경 -> 에러 */
//    @Override
//    public int method(int num) {return 0;}

    /* 목차 3. 매개변수 개수, 타입, 순서(시그니처) 변경 -> 에러 */
//    @Override
//    public void method(String num) {}

    /* 목차 4. 메소드 이름, 리턴타입, 매개변수의 개수, 타입, 순서 일치 -> 오버라이딩 성립 */
    @Override
    public void method(int number) {}   // 매개변수 이름 달라도 사용가능

    /* 목차 5. private 메소드 -> 에러(불가능) */
//    @Override
//    private void privateMethod() {}

    /* 목차 6. final 메소드 -> 에러(불가능) */
//    @Override
//    public final void finalMethod() {}

    /* 목차 7. 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능 */
    @Override
    protected void protectedMethod() {}


}
