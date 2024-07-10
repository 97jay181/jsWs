package com.ohgiraffers.section01.generic;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 제네릭(generic)에 대해 이해할 수 있다. */

        /* 필기. 제네릭(Generic)이란?
         *  제네릭의 사전적 의미는 '일반적인'이라는 형용사다.
         *  Java영역에서 제네릭이란, 데이터의 타입을 일반화한다는 의미를 가진다.
         * */

        /* 설명. 제네릭 클래스로 인스턴스를 생성할 떄, 타입변수 자리에 사용하고자 하는 타입을 명시해야만 한다. */
        /* 설명. 타입을 Integer로 하여금 인스턴스를 생성하는 경우 */
        GenericTest<Integer> gt1 = new GenericTest<Integer>();

        /* 설명. 메소드 인자 및 반환값 모두 Integer 타입임을 확인. */
        gt1.setValue(Integer.valueOf(10));
        System.out.println("gt1.getValue() = " + gt1.getValue());
        System.out.println("(gt1.getValue() instanceof Integer) = " + (gt1.getValue() instanceof Integer));

        /* 설명. 타입을 String으로 하여금 인스턴스를 생성하는 경우 */
        GenericTest<String> gt2 = new GenericTest<String>();
        gt2.setValue("홍길동");
        System.out.println("gt2.getValue() = " + gt2.getValue());
        System.out.println("(gt2.getValue() instanceof String) = " + (gt2.getValue() instanceof String));
//        System.out.println("(gt2.getValue() instanceof Integer) = " + (gt2.getValue() instanceof Integer));

        /* 설명 JDK 7 버전부터 타입 선언 시 타입변수가 작성되면 타입추론이 가능해졌다.
         *  따라서 생성자 쪽의 타입을 생략하고 사용할 수 있다. (에러가 발생하지 않음.)
         *  단, 타입이 명시되지 않은 빈 다이아몬드 연산자를 사용해야 한다.
         * */
        GenericTest<Double> gt3 = new GenericTest<>();
        gt3.setValue(7.5);
        System.out.println("gt3.getValue() = " + gt3.getValue());
        System.out.println("gt3.getValue() instanceof Double = " + (gt3.getValue() instanceof Double));

        /* 설명. 사용된 제네릭은 컴파일 타임 때 타입 변환이 이루어진 후 사라지게 된다.
         *  컴파일이 완료된 코드에는 제네릭 코드가 제거되어 있는데,
         *  제네릭 이전에 작성된 코드와의 하위 호환성을 위해서다.
         * */

    }
}
