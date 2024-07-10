package section01.object.run;

import section01.object.book.Book;

public class Application1 {

    public static void main(String[] args) {



        /* 수업목표. object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */

        /* 설명. "모든 클래스는 Object 클래스의 후손이다.
         *  따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있다.
         *  또한 부모 클래스가 가지는 메소드를 오버라이딩해서 재정의하여 사용하는것도 가능하다
         *  ========================================================================================
         *  Object 클래스의 메소드들 중, 관례상 많이 오버라이딩하는 메소드가 3가지 있다.
         *  - toString()
         *  - equals()
         *  - hashCode()
         * */

        Book b1 = new Book(1, "리버보이", "팀 보울러", 19000);
        Book b2 = new Book(1, "파페포포", "심승현", 18000);
        Book b3 = new Book(1, "목민심서", "정약용", 20000);

        /* 설명. 동일한 값을 가지는 인스턴스도 다른 해시코드값을 가지고 있다는 것을 확인할 수 있다.
         *  풀 클래스명(패키지경로 + 클래스타입) + @ + 16진수 해시코드
         * */
        System.out.println("book.toString() = " + b1.toString());
        System.out.println("book.toString() = " + b2.toString());
        System.out.println("book.toString() = " + b3.toString());

        /* 설명. toString() 메소드를 호출하지 않고 레퍼런스 변수만 출력해도 동일한 결과가 나온다.
         *  즉, 자동으로 toString()을 호출한 것이다.
         *  이러한 이유로 이 편의점을 이용해 toString() 메소드를 재정의해 사용하게 된 것이다.
         * */
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }
}
