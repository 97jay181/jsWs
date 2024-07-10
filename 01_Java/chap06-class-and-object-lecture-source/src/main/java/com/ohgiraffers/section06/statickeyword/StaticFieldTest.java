package com.ohgiraffers.section06.statickeyword;

/* 설명.
 *  static 필드에 접근하기 위해서는 클래스명.필드명으로 접근한다.   -> static 메소드를 호출하기 위해서는 클래스명.메소드명() 으로 호출한다.
 *  this.으로도 접근 가능하긴 하지만, this.을 사용하지 않는 것이 좋다.
 * */
public class StaticFieldTest {

    /* 설명. non-static 필드와 static 필드 선언 */
    private int nonStaticCount;
    private static int staticCount;

    /* 설명. 기본생성자 */

    public StaticFieldTest() {
    }


    /* 설명. getter : 두 필드의 값 확인 */
    public int getNonStaticCount() {
        return this.nonStaticCount;
    }

    public int getStaticCount() {
        return staticCount;
    }

    public void increaseNonStaticCount() {
        nonStaticCount++;
    }

    public void increaseStaticCount() {
        StaticFieldTest.staticCount++;
    }

}
