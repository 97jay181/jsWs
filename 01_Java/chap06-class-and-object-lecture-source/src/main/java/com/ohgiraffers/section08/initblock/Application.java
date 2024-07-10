package com.ohgiraffers.section08.initblock;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 초기화블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할 수 있다. */

        Product prd = new Product();

        System.out.println(prd.getInformation());

        Product prd2 = new Product("미", 1200000, "샤오미");
        System.out.println(prd2.getInformation());


    }
}
