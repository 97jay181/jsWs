package com.ohgiraffers.section06.singleton;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 싱글톤 패턴에 대해 이해하고 이를 구현할 수 있다. */

        /* 필기. 싱글톤 패턴(Singleton Pattern)이란?
         *  애플리케이션이 시작될 떄 어떤 클래스가 최초 한번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어서
         *  하나의 인스턴스만 공유해 사용하며 메모리 낭비를 방지할 수 있게 함 ( = 매번 인스턴스를 생성하지 않음)
         * ================================================================================================================
         * 장점
         * 1. 첫번쨰 이용시에는 인스턴스를 어쩔수 없이 한 번은 생성해야 하므로 차이가 나지 않지만,
         *    두번쨰 이용시에는 인스턴스 생성 시간 자체를 거치지 않기 때문에 빠르다.
         * 2. 인스턴스가 절대적으로 한 개만 존재하는 것을 Java 문법을 활용해 보장할 수 있다.
         * ================================================================================================================
         * 단점
         * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결국 결합도가 올라가게 된다.
         *    (유지보수와 테스트에 문제점이 생김)
         * 2. 동시성 문제를 고려해서 설계해야 하기 떄문에 난이도가 높은 편이다.
         * */

        /* 필기. 싱글톤 구현방법 2가지 :
         *  1. 이론 초기화(Eager Initialization)
         *  2. 게으른 초기화(Lazy Initialization)
         * */

        /* 목차1. 이른 초기화 구현 */
        /* 설명. 생성자를 이용하여 인스턴스 생성 할 수 없음.
         *  -> getInstance() 메소드를 호출해야만 인스턴스를 반환받을 수 있음.     */
//        EagerSingleton eager = new EagerSingleton();    // 에러 : 생성자가 private 라서 막혀있음.

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        /* 설명. 두 인스턴스의 hashCode가 동일함 -> 동일한 인스턴스다. */
        System.out.println("eager1 = " + eager1.hashCode());
        System.out.println("eager2 = " + eager2.hashCode());

        /* 목차2. 게으른 초기화 구현 */

        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1.hashCode() = " + lazy1.hashCode());
        System.out.println("lazy2.hashCode() = " + lazy2.hashCode());

        /* 필기.
         *  이른 초기화를 사용하면 클래스를 로드하는 속도가 느려지지만
         *  처음 인스턴스 반환 요청에서 속도가 빠르다는 장점을 가진다.
         *  반면 게으른 초기화는 클래스를 로드하는 속도는 빠르지만
         *  첫 번째 요청에 대한 속도가 두 번째 요청에 대한 속도보다 느리다는 특징을 가지고 있다.
         * */

        /* 설명.
         *  동시성을 고려한 다양한 싱글톤 구현 방식은 많지만
         *  난이도가 매우 높으므로 여기까지만 다루고 싱글톤이라는 개념을 이해하도록 한다.
         * */




    }
}
