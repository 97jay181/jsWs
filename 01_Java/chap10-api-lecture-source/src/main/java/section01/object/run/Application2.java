package section01.object.run;

import section01.object.book.Book;

public class Application2 {

    public static void main(String[] args) {

        /* 필기.
         *  equals() 메소드 오버라이딩
         *  equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산하여 true or false를 반환한다.
         *  즉 '동일한 인스턴스인지를 비교'하는 기능을 한다.
         *
         * 필기.
         *  동일객체와 동등객체
         *   동일객체 : 주소가 동일한 인스턴스를 동일객체라고 한다.
         *   동등객체 : 주소는 다르더라도 필드값이 동일한 객체를 동등객체라고 한다.
         *
         * 설명. equals() 메소드의 기본 기능은 동일객체 판단을 한다고 볼 수 있다. (동일성 확인)
         *
         * 설명.
         *  하지만 경우에 따라서는 동등객체를 동일 객체로 취급해서 비교하고 싶은 경우가 발생한다.
         *  즉, 동일한 필드값을 가지는 객체를 같은 객체로 판단할 수 있도록 하는 경우를 말한다.
         *  그러한 경우 equals() 메소드를 오버라이딩하여, 각각의 필드가 동일한 값을 가지는지를 확인하고
         *  모든 필드값이 같은 값을 가지는 경우 true, 아닌 경우 false를 반환하도록 작성한다.
         * */

        /* 설명.
         *  먼저 equals() 메소드를 오버라이딩 하기 전에
         *  동일한 값을 가지는 인스턴스 두 개를 이용해서 비교를 해 보자
         * */

        /* 수업목표. Object 클래스의 equals() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */

        Book b1 = new Book(1,"별주부전", "오바마", 20000);
        Book b2 = new Book(1,"별주부전", "오바마", 20000);

        System.out.println("b1 == b2 의 결과는? :" + (b1 == b2));           // == : 동등비교 연산
        System.out.println("b1.equals(b2)의 결과는? : " + (b1.equals(b2))); // equals() : 동등비교 연산

        /* 설명. 두 인스턴스는 서로 다른 인스턴스임을 알 수 있다.
         *  하지만 동일한 필드값을 가지는 경우 true를 반환할 수 있도록 equals() 메소드를 오버라이딩 했다.
         *  Object.equals() : 동일(identity)비교 ====(오버라이드)====> Book.equals() : 동등(equality) 비교
         *  */



    }
}
