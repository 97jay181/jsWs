package com.ohgiraffers.section02.extend.animal;

public class WildCardFarm {

    /* 설명. 매개변수로 전달받는 토끼농장을 구현할 떄 사용한 타입 변수에 대해 제한할 수 있다. */

    /* 설명. 토끼 농장에 있는 토끼가 어떤 토끼던 상관없음. */
    public void anyType(RabbitFarm<?> farm) {
        farm.getAnimal().cry();
    }

    /* 설명. 토끼 농장의 토끼는 Bunny이거나, 그 후손 타입으로 만들어진 토끼 농장만 매개변수로 사용 가능. */
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAnimal().cry();
    }

    /* 설명. 토끼 농장의 토끼는 DrunkenBunny 이거나, 그 부모타입으로 만들어진 토끼농장만 매개변수로 사용가능. */
    public void superType(RabbitFarm<? super DrunkenBunny> farm) {
        farm.getAnimal().cry();

    }
}
