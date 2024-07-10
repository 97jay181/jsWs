package com.ohgiraffers.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 매개변수에 활용할 수 있다. */
        /* 목차 1. 클래스 하단에 feed() 메소드 생성 */
        /* 목차 2. feed() 메소드 호출 */
        Application3 app3 = new Application3();

        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        app3.feed(animal1);
        app3.feed(animal2);

        Rabbit animal3 = new Rabbit();  // 묵시적 형변환
        Tiger animal4 = new Tiger();

        app3.feed(animal3);
        app3.feed(animal4);

        app3.feed((Animal) animal3);    // 명시적 형변환
        app3.feed((Animal) animal4);

        /* 설명. 인스턴스를 생성하여 바로 묵시적 형변환을 이용해 전달인자로 메소드를 호출할 수 있다. */
        app3.feed((Animal) (new Rabbit())); // 명시적 형변환
        app3.feed(new Tiger());             // 묵시적 형변환

        /* 설명. 만약, 다형성을 적용할 수 없었더라면...
         *  호랑이에게 먹이를 주는 메소드와 토끼에게 먹이를 주는 메소드를 모두 별도로 정의해서 사용했어야만 했을 것이다.
         * */


    }

    public void feed(Animal animal) {
        animal.eat();
    }
}
