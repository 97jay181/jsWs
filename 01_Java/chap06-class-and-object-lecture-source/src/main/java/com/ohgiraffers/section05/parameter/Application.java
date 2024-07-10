package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */
        /* 설명. 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달하며 호출할 수 있다. */

        /* 필기.
         *  매개변수(parameter)로 사용 가능한 자료형
         *  1. 기본자료형
         *  2. 기본자료형 배열
         *  3. 클래스자료형
         *  4. 클래스자료형 배열
         *  5. 가변인자
         * */

        ParameterTest pt = new ParameterTest();

        /* 목차1. 기본자료형을 매개변수로 전달 받는 메소드 호출 확인 */
        /* 필기. 기본자료형  8가지 모두 가능 */
        int num = 20;

        pt.testPrimaryTypeParam(num);

        /* 목차2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 확인 */
        int[] iarr = new int[] {1, 2, 3, 4, 5};

        System.out.println("전달하려는 인자값 iarr = " + iarr);
        pt.testPrimaryTypeArrayParam(iarr);

        /* 목차3. 클래스형 자료형을 매개변수로 전달 받는 메소드 호출 확인 */
        RectAngle r1 = new RectAngle(12,13);
        System.out.println(r1.getInfo());
        System.out.println("r1 = " + r1);

        pt.testClassTypeParam(r1);

        /* 목차4. 클래스형 배열은 아직 안 배웠기 떄문에 향후 '객체 배열'을 확인할 수 있다.*/

        /* 목차5. 가변인자 */
        /* 설명. 인자로 전달하려는 값의 개수가 정해지지 않은 경우 가변배열을 활용할 수 있다. */
//        pt.testVariableTypeArrayParam();     // 에러 : 인자가 아무것도 없어서.
        pt.testVariableLengthArrayParam("junsik", "shooping");
        pt.testVariableLengthArrayParam("harry", "eating");
        pt.testVariableLengthArrayParam("jun", "movie", "soccer");
        pt.testVariableLengthArrayParam("tom", new String[]{"tennis", "soccer", "basketball"});

        /* 설명. 주의사항! 가변인자는 메소드 오버라이딩 시 유의해야 한다. */


    }
}
