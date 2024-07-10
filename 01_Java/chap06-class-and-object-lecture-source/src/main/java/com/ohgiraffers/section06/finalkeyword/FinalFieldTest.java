package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /* 수업목표. final 키워드에 대해 이해할 수 있다. */

    /* 필기. final : final은 종단의 의미를 가지는 키워드다.
     *  final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미는 약간씩 다르지만
     *  결국 '변경불가'의 의미를 나타낸다.
     *  1. 지역 변수 : 초기화 이후 값 변경불가
     *  2. 매개변수 : 호출시 전달한 인자 변경 불가
     *  3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
     *  4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가
     *  5. non-static 메소드 : 메소드 재작성(overriding) 불가
     *  6. static 메소드 :  메소드 재작성(overriding) 불가
     *  7. 클래스 : 상속 불가
     * */

    /* 목차 1. non-static field에 final 사용 */
//    private final int nonStaticNo;  // 에러 : 0으로 초기화되어 이후 변경할 수 없음.
    /* 설명. final은 변경 불가의 의미를 가진다.
     *  따라서 초기 인스턴스가 생성되고 나면 기본값 0이 JVM에 의해 필드에 대입되는데,
     *  그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 즉시 초기화 해줘야 한다.
     *  그렇지 않으면 compile error가 발생한다.
     * */
    /* 설명. 이를 해결할 수 있는 방법은 2가지가 있다. */
    /* 목차 1-1. 선언과 동시에 초기화*/
    private final int NON_STATIC_NUM = 1;

    public FinalFieldTest(String NON_STATIC_STRING) {
        this.NON_STATIC_STRING = NON_STATIC_STRING;
    }


    /* 목차 1-2. 생성자를 이용해서 초기화*/
    private final String NON_STATIC_STRING;

    /* 목차 2. static field에 final 사용 */
//    private static final int STATIC_INT;
    /* 필기.
     *  static에도 자바에서 지정한 기본값이 초기에 대입되기 때문에
     * final 키워드 사용시 초기화를 하지 않으면 에러가 발생한다.    */
// 에러 : 0으로 초기화되어서 이후에 변경할 수 없기 때문.
    private static final int STATIC_INT = 1;

    public static final double STATIC_DOUBLE;

    /* 필기. static field에 선언된 final 키워드의 경우, 생성자를 사용한 초기화가 불가능하다.
     *  생성자는 인스턴스가 생성되는 시점에 호출되기 때문에 그 전에는 초기화를 할 수 없다는 뜻이다.
     *  하지만 static은 프로그램이 start될 때 할당되기 때문에 초기화가 되지 않은 상태로 선언된 것과 동일하여
     *  기본값으로 초기화된 후 값을 변경하지 못하기 때문에 에러가 발생한다.
     * */

//    public FinalFieldTest(double staticDouble) {
//        STATIC_DOUBLE = staticDouble;
//    }

    /* 설명. 하지만 초기화 블럭(initialization block)으로는 초기화 가능하다.
     *  (지금은 '가능하다'는 것에 초점을 맞추고, 필드에 대해 좀더 정리한 뒤 초기화 블럭에 대해 다시 살펴보자.   */

    static {
        STATIC_DOUBLE = 2.0;
    }


}
