package com.ohgiraffers.section01.method;

public class Application6 {

    public static void main(String[] args) {

        /* 수업목표. 메소드 리턴값을 이해하고 활용할 수 있다. */
        /* 필기.
         *  메소드 리턴값 테스트
         *  메소드는 항상 마지막에 return명령어가 존재한다.
         *  return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
         *  복귀를 할 때 그냥 복귀를 할 수도 있지만, 값을 가지고 복귀할 수 도 있다.
         *  이 때 가지고 가는 값을 리턴값 이라고 한다.
         *
         * 필기.
         *  return값을 반환받기 위해서는 메소드 선언부에 리턴 타입을 명시해 주어야 한다.
         *  void는 아무 반환값도 가지지 않겠다는 리턴타입에 사용할 수 있는 키워드이다.
         *  반환값이 없는 경우 return 구문은 생략해도 컴파일러가 자동으로 추가해주지만,
         *  반환값이 있는 경우는 return 구문을 반드시 명시적으로 작성해야 한다.
         *  또한 메소드 선언부에 선언한 리턴타입 반환값의 자료형은 반드시 일치해야 한다.
         * */

        System.out.println("main() 메소드 호출됨...");

        Application6 app6 = new Application6();

        app6.testMethod();

        /* 설명. 변수에 저장하지 않고 바로 출력할 수 있다 */
        System.out.println(app6.testMethod());

        /* 설명. 변수에 한 번 저장한 뒤, 그 변수를 출력할 수 있다. */
        String returnText = app6.testMethod();
        System.out.println(returnText);

        System.out.println("main() 메소드 종료됨...");
    }

    public String testMethod() {

        /* 필기. public 뒤에 바로 return문을 사용해서 호출된 시점으로 돌아갈 떄 가지고 갈 데이터의 타입을 명시한다.
         *  아무 값도 리턴하지 않는 경우 void를, 값을 반환하려는 경우 반환값의 자료형을 작성해야 한다.   */
        return "Hello World";
    }

    public void testMethod1() {

    }
}
