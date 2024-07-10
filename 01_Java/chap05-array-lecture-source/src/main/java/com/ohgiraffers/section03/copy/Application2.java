package com.ohgiraffers.section03.copy;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 얕은복사를 확용하여 매개변수와 리턴값으로 활용할 수 있다. */
        /* 필기.
         *  얕은 복사의 활용
         *  얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
         *  리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
         * */

        String[] names = {"해리포터", "발락", "덤블도어"};

        /* 설명. 얕은 복사 확인을 위한 hashcode 출력 */
        System.out.println("names의 HashCode = " + names.hashCode());

        /* 설명. 배열을 매개변수로 전달받는 출력 기능이 구현된 메소드 추가:
         *  출력해보면 동일한 hashcode를 가지는 것을 볼 수 있다.
         *  이처럼 다른 메소드에서 동일한 배열(객체)을 사용하도록 하고 싶은 경우 얕은 복사를 사용한다.
         * */

        /* 목차1. 전달인자와 매개변수로 활용가능. */
        print(names);

        /* 목차2. 리턴값으로 활용 */
        String[] animals = getAnimals();

        System.out.println("[main] 리턴 받은 animals의 hashcode = " + animals.hashCode());

        print(animals);
    }

    // 3가지를 봐야한다. 메소드의 이름, 메소드의 반환형-메소드의 파라미터 접근제어자-static 여부
    // 메소드 파라미터를 볼때 1. 개수, 2. 순서, 3. 타입
    public static void print(String[] sarr) {
        System.out.println("sarr의 hashcode = " + sarr.hashCode());

        System.out.print("sarr = {");
        for(int i = 0; i <= sarr.length - 1; i++) {
            System.out.print(sarr[i] + " ");
        }
        System.out.println("}");
    }

    public static String[] getAnimals() {   // void가 아닌 메소드를 사용할 때 반환값이 있을거니 return 먼저 작성해두기!

        String[] animals = new String[] {"낙타", "사자", "토끼", "강아지"};  // animals의 타입은 String 배열

        System.out.println("[getAnimals] 새로 만든 animals의 hashcode = "  + animals.hashCode());

        return animals;
    }

}
