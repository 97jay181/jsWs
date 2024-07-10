package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    /* 설명. 추상클래스는 필드를 가질 수 있다.  */

    private int nonStaticField;
    private static int staticField;

    /* 설명. 추상클래스는 생성자를 가질 수 있다. (못 갖는게 아님)
     *  하지만, 직접적으로 생성자를 호출해서 인스턴스를 생성할 수는 없다.
     * */

    public Product() {
        System.out.println("[Product] 기본 생성자 호출됨...");
    }

    /* 설명. 추상클래스는 일반적인(non-abstract) 메소드를 가질 수 있다. */
    public void nonStaticMethod() {
        System.out.println("[Product] nonStaticMethod() 호출됨....");
    }

    /* 설명. 추상클래스에서는 미완성 메소드(= 추상메소드)를 만들 수 있다.
     *  추상메소드가 0개인 경우, 선택적으로 클래스에 abstract 키워드를 작성해야 한다.
     * */
    public abstract void asbMethod();


    public void absMethod() {

        System.out.println("[Product] nonStaticMethod() 호출됨");
}

    public void staticMethod() {

    }
}
