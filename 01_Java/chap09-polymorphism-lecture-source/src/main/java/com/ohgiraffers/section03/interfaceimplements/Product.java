package com.ohgiraffers.section03.interfaceimplements;

public class Product extends Object implements InterProduct {

    /* 설명. InterProduct를 구현하면 오버라이딩 해야하는 메소드의  강제성이 부여되기 때문에
     *  인터페이스에 작성한 추상 메소드를 모두 오버라이딩 해야한다. */
    @Override
            public void nonStaticMethod() {
        System.out.println("(C)[Product] InterProduct의 nonStaticMethod()를 오버라이딩한 메소드 호출됨...");
    }
        /* 설명. static 메소드는 오버라이딩 할 수 없다. -> 시점이 다름 */
//        @Override
//        public static void staticMethod () {

            /* 설명. default 메소드는 인터페이스에서만 작성 가능하다. */
//            @Override
//            public default void defaultMethod () {
//            }

            @Override
            public void defaultMethtod () {
                System.out.println("(C)[Product] Product 클래스의 defaultMethod() 호출됨...");
            }
        }


