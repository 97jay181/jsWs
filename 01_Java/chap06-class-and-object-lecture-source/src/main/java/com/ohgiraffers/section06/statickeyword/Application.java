package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. static 키워드에 대해 이해할 수 있다. */

        /* 필기. static 키워드 :
         *  정적 메모리 영역에 프로그램이 Start될 때 할당하고자 하는 키워드다.
         *  인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다.
         *  여러 인스턴스가 공유해서 사용할 목적의 공간이다.
         * --------------------------------------------------------------------------------------
         *  하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하게 되며, 이는 피해야 한다.
         * '명확한 목적'이 존재하지 않는 이상 static 키워드 사용은 자제하도록 하자.
         *  의도적으로 static 키워드를 사용하는 대표적인 예는 '싱글턴(singleton)' 객체를 생성할 떄다.
         * */

        /* 목차 1. static 키워드를 필드에서 사용 */
        /* 설명. StaticFieldTest 인스턴스 생성 */
        StaticFieldTest sf1 = new StaticFieldTest();

        System.out.println("=============== sf1 인스턴스 생성 ====================");
        System.out.println("non-static 필드 변수 = " + sf1.getNonStaticCount());
        System.out.println("static 필드 변수 = " + sf1.getStaticCount());

        sf1.increaseNonStaticCount();
        sf1.increaseStaticCount();


        System.out.println("non-static 필드 변수 = " + sf1.getNonStaticCount());
        System.out.println("static 필드 변수 = " + sf1.getStaticCount());

        /* 설명. 새로운 StaticFieldTest 인스턴스 생성 */
        StaticFieldTest sf2 = new StaticFieldTest();

        System.out.println("=============== sf2 인스턴스 생성 ====================");
        System.out.println("non-static 필드 변수 = " + sf2.getNonStaticCount());
        System.out.println("static 필드 변수 = " + sf2.getStaticCount());

        /* 필기.
         *  인스턴스 변수의 경우에는 sf1과 sf2 두 개의 인스턴스가 서로 값을 공유하지 못하고
         *  인스턴스를 생성할 때 마다 0으로 초기화 되었다.
         *  하지만 static 필드의 경우에는 클래스변수 자체가 프로그램을 종료할 때 까지 유지되고 있기 때문에 값을 유지하고 있다.
         *  따라서 여러 개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static 키워드를 사용한다.
         * */


        /* 목차 2. static 키워드를 메소드에 사용 */
        StaticMethodTest smt = new StaticMethodTest();

        /* 목차 2-1. non-static 키워드를 메소드에 사용 */
        smt.nonStaticMethod();
        /* 목차 2-1. non-static 키워드를 메소드에 사용 */
        /* 주의사항.
         *  static 메소드도 이렇게 호출은 할 수 있다.
         *  하지만 static메소드의 경우에는 인스턴스를 생성하지 않고 호출하는 방식으로 사용해야 한다.
         *  static method는 정적 영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로 만들기 때문에
         *  static 메소드를 호출하는 방식으로 호출해야 한다.
         * */
        smt.staticMethod();              // 권장하지 않음(에러는 안뜸)

        StaticMethodTest.staticMethod();    // 권장되는 표현 방식
    }

}
