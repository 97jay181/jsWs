package com.ohgiraffers.section01.array;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용시킬 수 있다. (2) */
        /* 필기. 랜덤한 카드를 한 장 뽑아서 출력해보자. */
        String[] shape = {"♠", "♣", "♥", "♦"};
        String[] cardNumbers = {"2", "3", "4,", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int) (Math.random() * shape.length);
        int randomCardNumberIndex = (int) (Math.random() * cardNumbers.length);

        System.out.println("당신이 뽑은 카드는 " + shape[randomShapeIndex] + cardNumbers[randomCardNumberIndex] + " 입니다.");
    }
}
