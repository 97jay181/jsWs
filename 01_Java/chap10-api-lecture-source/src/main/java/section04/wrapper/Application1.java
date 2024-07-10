package section04.wrapper;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */

        /* 설명.
         *  상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
         *  이 때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
         *  8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 래퍼클래스 (Wrapper class)
         *  라고 한다. (주방에서 사용하는 랩(Wrap)과 같은 의미로 감싼다는 의미이다.)
         * */

        /* 필기.
         *  기본타입      래퍼클래스
         *  byte          Byte
         *  short         Short
         *  int           Integer
         *  long          Long
         *  float         Float
         *  double        Double
         *  char          Character
         *  boolean       Boolean
         * */

        /* 필기. 박싱(boxing)과 언박싱(unboxing)
         *  기본 타입(Primary type)을 Wrapper 클래스의 인스턴스로 인스턴스화 하는 것을 박싱(boxing)이라고 하며,
         *  Wrapper 클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱(unboxing)이라고 한다.
         * */
        int intValue = 20;

//        Integer boxingNumber1 = new Integer(intValue);        // JDK 9버전부터 사용 안하는 문법(DEPRECATED)
        Integer boxingNo1 = Integer.valueOf(intValue);          // Integer가 기본 제공하는 valueOf() static 메소드 사용

        int unboxingNo1 = boxingNo1.intValue();

        /* 설명. 오토 박싱(auto-boxing)과 오토 언박싱(auto-unboxing)
         *  JDK 1.5부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해준다.
         *  이런 자도오하된 박싱과 언박싱을 각각 오토박싱, 오토언박싱이라 부른다.
         * */
        Integer boxingNo2 = intValue;       // 오토 박싱
        int unboxingNo2 = boxingNo2;        // 오토 언박싱

        /* 설명. Wrapper 클래스 값 비교 */
        int inum = 10;
        Integer integerNum1 = Integer.valueOf(10);
        Integer integerNum2 = Integer.valueOf(10);
        Integer integerNum3 = 10;
        Integer integerNum4 = 10;

        /* 설명. 기본 타입과 레퍼클래스 타입은 == 연산으로 비교 가능. */
        System.out.println("(inum == integerNum1) " + (inum == integerNum1));
        System.out.println("(inum == integerNum3) " + (inum == integerNum3));

        /* 설명. JDK 9버전 기준, 박싱은 == 연산이 불가능했다.
         *  하지만 동일 비교 연산이 박싱은 불가능하고, 오토박싱은 가능하고의 차이를 없애기 위해 현재 JDK 17 버전은 모두 가능하다.
         * */
        System.out.println("===========================================================================");
        System.out.println("(integerNum1 == integerNum2) = " + (integerNum1 == integerNum2));   // true
        System.out.println("(integerNum1 == integerNum3) = " + (integerNum1 == integerNum3));   // true
        System.out.println("(integerNum3 == integerNum4) = " + (integerNum3 == integerNum4));   // true

        /* 설명. 래퍼클래스 타입의 인스턴스를 비교할 때는 equals()를 사용해야 한다. */
        System.out.println("===========================================================================");
        System.out.println("(integerNum1 == equals(integerNum2) = " + integerNum1.equals(integerNum2));   // true
        System.out.println("(integerNum1 == equals(integerNum3) = " + integerNum1.equals(integerNum3));   // true
        System.out.println("(integerNum1 == equals(integerNum4) = " + integerNum1.equals(integerNum4));   // true

        /* 설명. Integer.valueOf 메서드를 이용하여 인스턴스를 생성하는 것이 더 권장된다.
         *  valueOf()는 동일한 값이 동일한 인스턴스임을 보장한다 : 동일비교 -> 동등비교
         * */
        System.out.println("===========================================================================");
        System.out.println("valueOf() : " + (Integer.valueOf(123) == Integer.valueOf(123)));    // true





    }
}
