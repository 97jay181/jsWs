package com.ohgiraffers.section02.encapsulation.problem1;

public class Application {

    public static void main(String[] args) {        // 실행을 하기 위한 코드

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다. (1) */
        /* 필기.ㅍ ㅣㄹ드에 올바르지 않은 값이 들어가도 통제 불가능하며 알아차릴 수 없다. */

        /* 설명. 1번 몬스터 생성 */
        Monster m1 = new Monster();

        /* 설명. 몬스터의 이름과 체력 변경 */
        m1.name = "아구몬";
        m1.hp = 200;

        /* 설명. 몬스터의 정보 출력 */
        System.out.println("=========== 멤버 변수에 직접 접근 ==============");
        System.out.println("몬스터의 이름은 = " + m1.name);
        System.out.println("몬스터의 체력은 = " + m1.hp);
        System.out.println("----------------------------------");

        /* 설명. 2번 몬스터 생성 */
        Monster m2 = new Monster();

        /* 설명. 몬스터의 이름과 체력 변경 */
        m2.name = "워그레이몬";
        m2.hp = -200;

        /* 설명. 몬스터의 정보 출력 */
        System.out.println("몬스터의 이름은 = " + m2.name);
        System.out.println("몬스터의 체력은 = " + m2.hp);

        /* 설명. 이처럼 검증되지 않은 값을 넣을 때 문제가 발생할 수도 있다.
         *  이를 해결하기 위해 Monster 클래스를 수정해본다.     */

        /* 설명. 3번 몬스터 생성 */
        System.out.println("=========== setHp() 메소드로 간접 접근 ==============");
        Monster m3 = new Monster();

        m3.name = "오메가몬";
        m3.setHp(200);

        System.out.println("몬스터의 이름은 = " + m3.name);
        System.out.println("몬스터의 체력은 = " + m3.hp);
        System.out.println("----------------------------------");

        /* 설명. 4번 몬스터 생성 */
        Monster m4 = new Monster();

        m4.name = "가트몬";
        m4.setHp(-600);     // 음수 hp 입력

        System.out.println("몬스터의 이름은 = " + m4.name);
        System.out.println("몬스터의 체력은 = " + m4.hp);
        System.out.println("----------------------------------");

    }
}
