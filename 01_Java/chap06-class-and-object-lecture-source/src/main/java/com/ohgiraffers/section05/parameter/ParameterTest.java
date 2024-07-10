package com.ohgiraffers.section05.parameter;

import java.awt.*;

public class ParameterTest {

    public void testPrimaryTypeParam(int num) {
        System.out.println("매개변수로 전달받은 값 num = " + num);
    }

    public void testPrimaryTypeArrayParam(int[] iarr) { // heap 메모리에 들어있는 주소값만 가지고 있음
        System.out.println("매개변수로 전달받은 iarr = " + iarr);

        /* 설명. 배열의 값 출력 */
        System.out.print("배열의 값 출력 iarr={");
        for (int num : iarr) {
            System.out.print(num + " ");
        }
        System.out.print("}");
    }

    /* 필기. 밑변과 높이가 담긴 값이 아닌, 인스턴스의 주소가 전달된다.
     *  즉, 인자로 전달하는 인스턴스와 매개변수 전달받은 인스턴스는 서로 동일한 인스턴스를 가리키게 된다(얕은복사).
     * */
    public void testClassTypeParam(RectAngle rect) {

        System.out.println("매개변수로 전달받은 값 rect = " + rect);

        System.out.println("사각형의 넓이와 둘레 계산");
        rect.calcArea();
        rect.calcRound();

    }

    public void testVariableLengthArrayParam(String name, String... hobbies) {

         /* 필기. 가변길이의 배열은 몇 개가 매개변수로 전달될 지 컴파일 타임에는 모른다.
          * 따라서 이름(name)과 구분하기 위해 가장 마지막 순서의 매개변수로 선언해야 한다.
          * */

        System.out.println("name = " + name);           // 이름
        System.out.println("hobbies.length = " + hobbies.length);       // 취미의 개수

        System.out.print("취미 : [");
        for( String h : hobbies) {
            System.out.print(h + " ");
        }
        System.out.print("]");

    }
    /* 설명. 가변인자 사용시 메소드 오버라이딩을 주의해야 한다.
     *  메소드를 오버라이딩하고 다시 돌아와보면 위 호출구문에 컴파일에러가 발생한 것을 확인할 수 있다.
     *  둘 중 어떤 메소드를 호출해줘야 하는지 '모호성'이 발생했기 때문이다.
     *  이렇게 가변배열을 매개변수로 이요한 메소드는 모호성으로 인해 오버로딩 하지 않는것이 좋댜ㅏ.
     * */

//    public void testVariableLengthArrayParam(String... hobbies) {
//
//        System.out.println("hobbies.length = " + hobbies.length);       // 취미의 개수
//
//        System.out.print("취미 : [");
//        for( String h : hobbies) {
//            System.out.print(h + " ");
//        }
//        System.out.print("]");
//
//    }
}
