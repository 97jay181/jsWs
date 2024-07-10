package com.ohgiraffers.section03.interfaceimplements;

import java.io.Serializable;

/* 필기. 인터페이스가 인터페이스를 상속받을 때는 extends 키워드를 사용할 수 있으며,
 *  인터페이스는 인터페이스끼리 다중상속이 가능하다.
 *  (클래스와 클래스끼리는 단일 상속이 가능함)
 * */
public interface InterProduct extends Serializable {

    /* 설명. 인터페이스는 상수 필드만 취급할 수 있다.
     *  public static final 제어자 조합을 '상수 필드'라고 부른다.
     *  반드시 선언과 동시에 초기화해줘야 한다.   */
    public int num = 100;
    /* 설명, 상수 필드만을 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final이다. */
    int MAX_NUM = 100;
    int MIN_NUM = 10;

    /* 설명. 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct() {}

    /* 설명. 인터페이스는 구현부가 있는 non-static 메소드를 가질 수 없다. */
//    public void nonStaticMethod() {}


    /* 설명. 인터페이스는 추상메소드만 작성 가능하다. */
    public abstract void nonStaticMethod();
//    public void nonStaticMethod2();     // abstract 키워드 안달아도 묵시적으로 추상메소드로 인식함
//    void nonStaticMethod3();    // public abstract 키워드를 모두 안달아도 묵시적으로 추상메소드로 인식함
//    abstract void nonStaticMethod4();

    /* 설명.
     *  인터페이스 안에 작성한 메서드는 묵시적으로 public abstract의 의미를 가진다.(다른 접근제한자 사용 불가능)
     *  따라서 인터페이스의 메소드를 오버라이딩하는 경우, 반드시 접근제한자를 publicd으로 설정해야 오버라이딩 가능하다.
     * */

    /* 필기. 인터페이스일지라도 static 메소드는 바디부분을 가질 수 있다. (JDK 1.8부터 추가된 기능) */
    public static void staticMethod() {
        System.out.println("(I)[InterProduct] staticMethod() 호출됨...");
    }

    /* 필기. default 키워드를 사용하면 non-static 메소드도 작성 가능하다. (JDK 1.8부터 추가된 기능) */
    public default void defaultMethod() {
        System.out.println("(I)[InterProduct] defaultMethod() 호출됨...");
    }


    void defaultMethtod();
}


