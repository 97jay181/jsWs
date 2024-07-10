package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.animal.*;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. extends 키워드를 이용해 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다. */

        /* 설명. 제네릭 클래스 작성시 extends 키워드를 사용하면 특정 타입만 사용할 수 있도록 제한할 수 있다. */
        /* 설명. 토끼의 후손이거나 토끼인 경우에만 타입 변수로 전달할 수 있다.
         *  그 외의 타입으로 타입을 지정할 경우 컴파일 단계에서 에러가 발생한다.
         * */
        /* 설명. Animal 타입은 Rabbit보다 상위 타입이기 때문에 사용 불가능. */
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();

        /* 설명. Mammal 타입은 Rabbit보다 상위 타입이기 떄문에 사용 불가능. */
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();

        /* 설명. 전혀 다른 타입인 Snake는 사용 불가능. */
//        RabbitFarm<Snake> farm3 = new RabbitFarm<>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        /* 설명. setter 메소드를 이용할 때도 올바른 타입의 인스턴스를 전달해야 한다. */
        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry();
        ((Rabbit) farm4.getAnimal()).cry();         // 형변환 생략 가능

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();
        ((Bunny) farm5.getAnimal()).cry();          // 형변환 생략 가능

        farm6. setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();
        ((DrunkenBunny) farm6.getAnimal()).cry();   // 형변환 생략 가능

        /* 설명. 제네릭을 사용해서 올바른 타입을 타입변수로 지정하는 경우에는
         *  인스턴스 내부에 있는 타입(T) 자체가 Rabbit 타입을 가지고 있는 것이 '보장되어 있기 때문에'
         *  형변환이 생략 가능하고 형변환이 가능하다.
         * */

    }
}
