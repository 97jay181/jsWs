package com.ohgiraffers.section03.overriding;

public class OtherClass {

    public static void main(String[] args) {


        SuperClass sp = new SubClass();
        sp.method(10);
        sp.protectedMethod();
    }
}
