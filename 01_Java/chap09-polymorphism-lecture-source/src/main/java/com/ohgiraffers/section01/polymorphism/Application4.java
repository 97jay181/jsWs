package com.ohgiraffers.section01.polymorphism;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 리턴 타입에 알맞게 활용할 수 있다. */

        /* 설명. 랜덤한 동물 인스턴스를 반환받을 것이다. */
        /* 목차 1. getRandomAnimal() 추가 */
        /* 목차 2. getRandomAnimal() 호출 */
        Application4 app4 = new Application4();

        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();

        /* 설명. 만약 다형성을 적용할 수 없었더라면...
         *  호랑이를 반환하는 메소드와 토끼를 반환하는 메소드를 따로 만들어야 했을 것이다. */
    }

    public Animal getRandomAnimal() {

        // Math.random() 사용할 것.
        // 1이 나오면 Rabbit을, 0이 나오면 Tiger를 반환할 것.
        // return 구문에 3항 연산자 사용할 것

        /* 내 풀이 */
//            return (int) (Math.random() * 2) == 1 ? "Rabbit" : "Tiger";

//     쌤풀이
        int random = (int) (Math.random() * 2);
        return random == 0 ? new Tiger() : new Rabbit();
    }
}


