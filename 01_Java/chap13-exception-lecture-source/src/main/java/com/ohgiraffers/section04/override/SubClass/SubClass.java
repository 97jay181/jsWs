package com.ohgiraffers.section04.override.SubClass;

import java.io.IOException;

public class SubClass {

    /* 설명. 예외 없이도 오버라이딩 가능 */
//    @Override
//    public void method() {}

    /* 설명. 같은 예외를 던져주는 구문으로 오버라이딩 해야한다. */
//    @Override
//    public void method() throws IOException {} // 정상

    /* 설명. 부모의 예외처리 클래스보다 상위의 예외는 후손 클래스에서 오버라이딩 할 수 없다. */
//    @Override
//    public void method() throws Exception {} // 정상

    /* 설명. 부모의 예외처리 클래스보다 하위의 예외는 후손 클래스에서 오버라이딩 할 수 있다. */
//    @Override
//    public void method() throws Exception {} // 정상


}
