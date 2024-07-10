package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    /* 설명. 클래스가 초기화되는 시점에서는 정적 필드를 선언 -> 컴파일 때 null로 초기화 */
    private static LazySingleton lazy;  // 클래스변수(Static 키워드를 가지고 필드에 선언하는 변수 / 메모리 static 영역 사용)

    /* 설명. 싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하는 것을 제한. */
    private LazySingleton() {}

    /* 설명. public 인터페이스로 인스턴스를 반환 */
    public static LazySingleton getInstance() {

        /* 필기.
         *  인스턴스를 생성한 적이 없을 떄 => 인스턴스를 생성해서 반환
         *  인스턴스를 생성한 적이 있을 때 => 기존에 만들어둔 인스턴스를 반환
         * */

        if(LazySingleton.lazy == null) {
            LazySingleton.lazy = new LazySingleton();
        }
        return LazySingleton.lazy;
    }



}
