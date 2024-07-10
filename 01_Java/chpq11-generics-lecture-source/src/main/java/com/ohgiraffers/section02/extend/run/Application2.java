package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.animal.*;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 와일드카드에 대해 이해할 수 있다. */

        /* 필기.
         *  와일드카드(WildCard)
         *  제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을 때,
         *  그 객체의 타입 변수를 제한할 수 있다.
         *  <?> : 제한 없음
         *  <? extends Type> : 와일드카드의 상한 제한 (Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 사용 가능)
         *  <? super Type> : 와일드카드 하한 제한 (Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용 가능)
         * */

        WildCardFarm wcf = new WildCardFarm();

        /* 목차 1. 매개변수의 타입 제한이 없는 경우 : anyType() */
        /* 설명. 농장 생성 자체가 불가능한 것은 매개변수로 사용할 수 없다. */
//        wcf.anyType(new RabbitFarm<Mammal>(new Mammal()));
//        wcf.anyType(new RabbitFarm<Raptile>(new Reptile()));

        /* 설명. 어떠한 토끼 농장이건 간에 매개변수로 모두 사용 가능. */
        wcf.anyType(new RabbitFarm<Rabbit>(new Rabbit()));              // Rabbit
        wcf.anyType(new RabbitFarm<Bunny>(new Bunny()));                // Bunny
        wcf.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));  // DrunkenBunny

        /* 설명. Bunny이거나 Bunny의 후손 토끼 농장만 매개변수로 사용 가능하고,
         *  상위 타입으로 만든 토끼농장은 매개변수로 사용 불가능.
         * */
//        wcf.extendsType(new RabbitFarm<Rabbit>(new Rabbit()));
        wcf.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wcf.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        /* 설명. Bunny이거나 Bunny의 상위 타입 토끼 농장만 매개변수로 사용 가능하고,
         *  하위 타입으로 만든 토끼 농장은 매개변수로 사용 불가능.
         * */
        wcf.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wcf.superType(new RabbitFarm<Bunny>(new Bunny()));
        wcf.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

    }
}
