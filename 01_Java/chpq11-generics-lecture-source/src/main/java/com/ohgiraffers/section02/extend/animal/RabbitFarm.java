package com.ohgiraffers.section02.extend.animal;

/* 설명. 인터페이스 상속 시, implements 키워드 대신 extends 키워드를 사용할 것. */
//public class RabbitFarm<T implements Animal> {    // 에러
//public class RabbitFarm<T extends Animal> {       // 정상
/* 설명. 참고로 클래스와 인터페이스 상속 시 &를 사용할 수 있다. (몰라도 됨)
 *  대신, 순서는 존재한다. 클래스가 먼저 오고 인터페이스가 나중에 와야 한다.
 *  &로 여러 타입을 동시에 가는 경우에만 타입 변수에 맞는 타입으로 여겨진다.  (둘 중 하나 아님!!)
 *  여러개를 이어서 작성할 떄는 계속 &를 사용해서 이어나가면 되지만 해당 타입을 모두 가지는 타입만 사용 가능하다.
 *  인터페이스 없이 클래스만 여러 개 정의하고 싶다면 &가 아닌 콤마(,)를 사용해야 한다.
 *  이 떄 컴파일 에러는 발생하지 않지만, 뒤에 작성된 클래스를 또 다른 타입변수로 본다.
 *  (즉 하나의 클래스만 상속받아 구현할 수 있음)
 * */
//public class RabbitFarm<T extends Rabbit & Animal> {   // 정상(순서 올바름)
//public class RabbitFarm<T extends Animal & Rabbit> {   // 에러(순서 틀림)
//public class RabbitFarm<T extends Rabbit & Snake> {   // '&' 안됨 -> 에러 / 에러(클래스끼리는 콤마 사용)
//public class RabbitFarm<T extends Rabbit, Snake> {    // 정상
public class RabbitFarm<T extends Rabbit> {

    /* 설명. 해당 클래스는 타입 변수를 작성하여 제네릭 클래스로 정의되었다.
     *  하지만, 제네릭스를 설정할 떄 extends Rabbit이라는 문구가 더 추가되었다.
     * */

    /* 설명. 타입 변수는 아직 어떤 토끼가 될 지 모르는 상태다.
     *  다만, 토끼이거나(Rabbit), 토끼의 후손(Bunny, DrunkenBunny)만 가능하다.
     * */
    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }


    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
