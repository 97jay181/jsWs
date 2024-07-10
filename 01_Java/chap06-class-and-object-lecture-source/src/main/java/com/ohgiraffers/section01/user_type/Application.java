package com.ohgiraffers.section01.user_type;

public class Application {

    public static void main(String[] args) {



        /* 수업목표. 클래스가 무엇인지 이해하고 작성할 수 있다. */

        /* 설명.
         *  지금까지 자바에서 제공되는 자료들을 취급하는 자료형에 대해 학습했다.
         *  이제 조금 더 복잡한 자료를 취급할 수 있는 방법을 생각해보자
         *  회원 정보를 관리하기 위해 회원의 여러 정보(아이디, 비밀번호, 이름, 나이, 성별, 취미)를 취급하여 관리 하려고 한다.
         *  지금까지 배운 내용을 가지고 한 번 값을 저장하고 출력해보자
         * */

        /* 목차1. 변수를 이용한 회원 데이터 관리 */

        /* 설명.
         *  지금까지 우리는 클래스 내부에 메소드만 작성 해봤다.
         *  하지만 클래스 내부에는 메소드를 작성하지 않고 바로 변수를 선언할 수 도 있다.
         *  이것을 전역변수(필드 == 인스턴스변수 == 속성) 라고 부른다.
         * */

        /* 설명.
         *  앞에서 사용했던 홍길동, 20 이런 값들은 한 명 회원을 구성하고 있는 값들이다.
         *  이런 값들의 명칭은 이름, 나이 라고 하는 명사로 표현될 수 있는데 이것을 속성이라고 한다.
         *  어떠한 속성들을 가지고 있는지를 현 위치에 정의를 할 것이다.
         *  정의하는 방법은 간단하다. 변수를 선언하는 것과 동일하다.
         * */
        String id = "ofice89@naver.com";
        String pwd = "1234!!";
        String name = "변준식";
        int age = 20;
        char gender = 'm';
        String[] hobbies = new String[]{"러닝", "영화감상", "카페탐방", "맛집탐방", "서점탐방"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        for(String h : hobbies) {
            System.out.print(h + " ");
        }
        System.out.println();

        /* 필기.
         *  이렇게 각각의 변수로 관리하게 되면 여러 가지 단점이 있다.
         *  1. 변수명을 다 관리해야 하는 어려움이 생긴다.
         *  2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면 너무 많은 값들을 인자로 전달해야 해서 한 눈에 안들어온다.
         *  3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴값으로 사용할 수 없다. (서로 다른 자료형들이기 때문)
         * */

        /* 설명.
         *  그래서 자바에서는 서로 다른 자료형의 데이타를 사용자(개발자) 정의로 하나로 묶어서 새로운 타입을 정의할 수 있는 방법을 제공해준다.
         *  필요로 하는 자료형이 추가로 존재하는 경우 자바에서는 클래스라는 매커니즘을 이용해서 사용자 정의의 자료형을 만들 수 있게 한다.
         *  위에서 만든 데이터들의 공통적인 부분은 '회원정보' 라는 것이다.
         *  이러한 공통점을 고려하여 그룹화 할 수 있는 명사 형태로 클래스를 작성할 것이다.
         *  Member라는 클래스를 추가해보자.
         * */

        /* 목차. 2. 사용자 정의 자료형 사용하기 */
        /* 목차. 2-1. 변수 선언 및 객체 생성 */
        /* 필기.
         *  자료형 변수명 = new 클래스명(); <- 지금까지 사용한 이 구문은 객체(instance)를 생성하는 구문이다.
         *  사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap에 할당을 해야 한다.
         *  객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance)가 생성된다.
         *  아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속된 메모리 주소에서 사용하도록 heap에 공간을 만들었다. (클래스에 작성한 내용 대로 생성함)
         */

        Member myMem = new Member();

        /* 목차. 2-2. 생성된 인스턴스의 초기값 확인하기 */
        /* 설명.
         *  이렇게 객체를 생성하고 나면 서로 다른 자료형들을 하나의 member 라는 이름으로 관리할 수 있도록 공간을 생성한 것이다.
         *  heap에 생성되기 때문에 jvm 기본값으로 초기화된다.
         * */

        /* 필기.
         *  필드에 접근하기 위해서는 레퍼런스변수명.필드명 으로 접근한다.
         *  '.'은 참조연산자 라고 하는데, 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미를 가진다.
         *  각 공간은 필드명으로 접근한다. (배열은 인덱스로 접근, 객체는 필드명으로 접근이다)
         * */

        System.out.println("myMem.id = " + myMem.id);
        System.out.println("myMem.pwd = " + myMem.pwd);
        System.out.println("myMem.name = " + myMem.name);
        System.out.println("myMem.age = " + myMem.age);
        System.out.println("myMem.gender = " + myMem.gender);
        System.out.println("myMem.hobbies = " + myMem.hobbies);
        System.out.println("=========(END)===================");

        /* 목차 2-3. 필드에 접근해서 변수 사용하듯 사용하기 */
        myMem.id = "ofice89@naver.com";
        myMem.pwd = "jun19!@#$";
        myMem.name = "junsik";
        myMem.age = 23;
        myMem.gender = 'm';
        myMem.hobbies = new String[] {"running, shopping, watching movies"};

        /* 설명. 값이 변경되었는지 확인해보기 */
        System.out.println("변경 후 myMem.id = " + myMem.id);
        System.out.println("변경 후 myMem.pwd = " + myMem.pwd);
        System.out.println("변경 후 myMem.name = " + myMem.name);
        System.out.println("변경 후 myMem.age = " + myMem.age);
        System.out.println("변경 후 myMem.gender = " + myMem.gender);
        System.out.print("변경 후 myMem.hobbies = ");
        for(String h : myMem.hobbies) {
            System.out.print(h + " ");
        }
        System.out.println();
    }
}
