package com.ohgiraffers.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {

        /* 수업 목표. 다형성을 적용하여 객체 배열을 만들어 인스턴스를 연속으로 처리할 수 있다. */

        /* 설명. 상위 타입의 레퍼런스 배열을 만들고, 각 인덱스에 인스턴스들을 생성해서 대입한다. */
        Animal[] animals = new Animal[5];

        animals[0] = new Rabbit();  // 토끼는 동물이다.
        animals[1] = new Tiger();   // 호랑이는 동물이다
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Animal();  // 동물은 동물이다.

        /* 설명. Animal 클래스가 가지는 메소드를 오버라이딩한 메소드 호출 시, 동적 바인딩을 이용할 수 있다.
         *  '토끼야 울어라', '호랑이야 울어라' 라고 하는 것이 아닌,
         *  '동물들아 울어라' 라는 느낌이다.
         * */

        for(Animal a : animals) {
            a.cry();
//            a.run();
//            a.eat();
        }

        /* 필기. 각 클래스별 고유한 메소드를 동작시키기 위해서는 down-casting을 명시적으로 선언해야 하는데
         *  ClassCastException을 방지하기 위해 instance 연산자와 if문으로 타입 체크를 실행해야 한다.
         * */
        for(Animal a : animals) {

            /* 설명. 동물아, 네가 만약 토끼라면 jump() 하고, 호랑이라면 bite() 해라~~ 라는 느낌이다. */
            if(a instanceof Rabbit) {
                ((Rabbit) a).jump();
            } else if (a instanceof Tiger) {
                ((Tiger) a).bite();
            } else {
                System.out.println("호랑이나 토끼가 아닙니다");
            }
        }
    }
}
