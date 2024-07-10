package section03.stringbuilder;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. String과 StringBuilder의 차이점에 대해 이해하고 사용할 수 있다. */

        /* 필기. 두 클래스는 스레드 동기화 기능 제공 여부에 차이점이 존재한다.
         *  1. StringBuilder:
         *    - 스레드 동기화 기능 제공 안함.
         *    - 스레드 동기화 처리를 고려하지 않은 상황에서 StringBuffer보다 성능이 높음.
         *  2. StringBuffer:
         *    - 스레드 동기화 기능 제공함.
         *    - 성능면에서는 StringBuilder보다 느림.
         * ===========================================================================================
         *  즉, 두 클래스는 스레드 동기화 유무의 차이가 존재하고, 우리는 고급 개발자가 아니기 때문에
         *  스레드를 고려하지 않을 것이다.
         *  따라서 StringBuilder를 사용하면 된다.    */

        /* 필기.
         *  String과 StringBuilder
         *  String : 불변이라는 특성을 가지고 있다.
         *           문자열에 + 연산으로 합치기 하는 경우, 기존 인스턴스를 수정하는 것이 아닌,
         *           새로운 인스턴스를 반환한다.
         *           따라서 문자열 변경이 자주 일어나는 경우 성능 면에서 좋지 않다.
         *           하지만 변하지 않는 문자열을 자주 읽어 들이는 경우에는 오히려 좋은 성능을 기대할 수 있다.
         *  StringBuilder : 가변이라는 특성을 가지고 있다.
         *                  문자열에 append() 메소드를 이용하여 합치기 하는 경우
         *                  기존 인스턴스를 수정하기 때문에 새로운 인스턴스를 생성하지 않는다.
         *                  따라서 잦은 문자열 변경이 일어나는 경우 String보다 성능이 좋다.
         *
         * 필기.
         *  단, jdk 1.5 버전에서는 문자열의 + 연산이 StringBuilder의 append()로 컴파일이 된다.
         *  따라서 성능에 큰 차이를 보이지는 않는다.
         *  하지만 반복문에서 문자열의 + 연산을 수행하는 경우 StringBuilder 인스턴스를
         *  반복 루프 시 마다 생성하기 때문에 성능에는 좋지 않은 영향을 준다.
         *
         * 설명.
         *  역컴파일 결과 예시
         *  원본코드
         *  ---------------------------------------------------
         *  String str1 = "java";
         *  String str2 = "oracle";
         *  String str3 = str1 + str2;
         *  String str4 = "";
         *  for(int i = 0; i < 10; i++) {
         *      str4 += str1;
         *  }
         *  ----------------------------------------------------
         *
         * 설명.
         *  JDK 1.4 이하
         *  ----------------------------------------------------
         *  String str1 = "java";
         *  String str2 = "oracle";
         *  String str3 = str1 + str2;
         *  String str4 = "";
         *  for(int i = 0; i < 10; i++) {
         *      str4 = str4 + str1;
         *  }
         *  ----------------------------------------------------
         *
         * 설명.
         *  JDK 1.5 이상
         *  ----------------------------------------------------
         *  String str1 = "java";
         *  String str2 = "oracle";
         *  String str3 = new StringBuilder(str1).append(str2).toString();
         *  String str4 = "";
         *  for(int i = 0; i < 10; i++) {
         *      str4 = new StringBuilder(str4).append(str1).toString();
         *  }
         * */


        /* 설명. StringBuilder 인스턴스 생성 */
        StringBuilder sb = new StringBuilder("java");

        /* 설명. StringBuilder에 toString()이 오버라이딩 된 것을 확인. */
        System.out.println("sb = " + sb);
        System.out.println("sb = " + sb.toString());
        System.out.println("sb.length() = " + sb.length());

        /* 설명. StringBuilder에 hashCode()는 오버라이딩 되어 있지 않은 것을 확인.
         *  즉, 동일한 값을 가지는 경우 같은 해쉬코드를 반환하는 것이 아닌,
         *  인스턴스가 동일해야 같은 해쉬코드를 반환한다.
         * */
        System.out.println("sb.hashCode() = " + sb.hashCode());

        /* 설명. 기존 문자열 수정(String은 할 수 없는 작업) */
        sb.append("mysql");

        System.out.println("sb = " + sb);                    // 바뀐 문자열 값 확인
        System.out.println("sb.length = " + sb.length());         // 바뀐 문자열 길이 확인

        /* 설명. hashCode를 다시 출력해보면 기존 인스턴스와 동일한 것을 확인할 수 있다.
         *  즉, 문자열을 변경했다고 해서 새로운 인스턴스가 생성된 것이 아니다.
         * */
        System.out.println("sb.hashCode() = " + sb.hashCode());  // 인스턴스 주소 확인


    }
}
