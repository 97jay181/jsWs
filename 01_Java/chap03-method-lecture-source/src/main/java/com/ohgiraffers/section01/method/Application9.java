package com.ohgiraffers.section01.method;

public class Application9 {

    public static void main(String[] args) {

        /* 수업목표. 다른 클래스에 작성한 메소드를 호출할 수 있다. */
        /* 설명. 서로 다른 클래스에 작성한 메소드 호출하기
         *  동일한 패키지에 Calculator라는 클래스를 하나 추가하고, 메소드를 작성하여 테스트한다.
         *  먼저 Calculator.java를 생성하고 메소드를 작성한다.
         *  (단, 두 값이 동일한 경우는 존재하지 않는다고 가정.)   */

        int first = 500;
        int second = 250;

        /* 목차. 1. non-static 메소드의 경우 */
        /* 필기. 클래스가 다르더라도, 사용하는 방법은 동일하다.
         *  클래스명 변수명 = new 클래스명();
         *  변수명.메소드명();
         * */
        Calculator calc = new Calculator();
        int max = calc.maxNumberOf(first, second);

        System.out.println("두 수 중, 큰 값은? " + max);

        /* 목차. 2. static 메소드의 경우 */
        /* 필기.
         *  다른 클래스에 작성한 static 메소드의 경우, 호출할 때 클래스명을 '반드시' 기술해야 한다.
         *  클래스명.static_메소드명();
         * */
        int min = calc.minNumberOf(first, second);  // int min = Calculator.minNumberOf(first, second); 썜은 이렇게 쓰심
        System.out.println("두 수 중, 작은 값은? " + min);

        /* 설명. 주의사항!
         *  static 메소드도 non-static 메소드처럼 호출할 수는 있다.
         *  그러나 권장되지 않는다.
         *  왜냐하면 이미 메모리에 로딩되어 있는 static 메소드는 여러 객체가 공유하게 된다.
         *  이 떄, 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못하는 동작을 유발할 수 있기 때문에
         *  사용을 제한해 달라는 경고(warning)이 발생한다.
         *  시스템이 복잡해지고 거대해질수록 객체의 상태를 추적하기 어려워지기 떄문에 유지보수에 악영향을 미친다.
         * */
        int min2 = Calculator.minNumberOf(first, second);


    }
}
