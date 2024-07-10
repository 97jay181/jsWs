package section03.stringbuilder;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. StringBuilder의 자주 사용되는 메소드의 용법을 이해할 수 있다. */

        StringBuilder sb1 = new StringBuilder();

        /* 설명. capacity() : 용량(현재 버퍼의 크기)을 정수형으로 반환
         *  -> 기본용량 = 문자열 길이 + 16 */
        System.out.println("===========초기 인스턴스 상태=================");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1.capacity() = " + sb1.capacity());

        /* 필기. append() : 인자로 전달된 값을 문자열로 변환한 후 기존 문자열의 마지막에 추가한다.
         *  기본 용량을 초과하는 경우, (기존 문자열 + 1) * 2를 하여 용량을 확장시킨다.
         *  https://stackoverflow.com/questions/3184244/stringbuilder-capacity?newreg=a54cb01055f349ad90a33b60a7c4b613
         * */
        for(int i = 0; i <= 50; i++) {
            System.out.println("=========" + (i + 1) + "회차 ==========");
            sb1.append(i);

            System.out.println("sb1 = " + sb1);
            System.out.println("sb1.capacity() = " + sb1.capacity());   // 2n + 2씩 증가
            System.out.println("sb1.hashCode() = " + sb1.hashCode());
        }
        System.out.println("======================================================================================");
        
        /* 설명. 새로운 StringBuilder 인스턴스 생성 */
        StringBuilder sb2 = new StringBuilder("javamysql");

        /* 설명.
         *  - delete() : 시작 인덱스와 종료 인덱스를 이용해 문자열에서 원하는 부분의 문자열을 제거하여 반환.
         *  - deleteCharAt() : 문자열 인덱스를 이용해 문자 '하나'를 제거하여 반환.
         *  두 메소드 모두 원본 문자열에 영향을 미친다. (누적)
         * */
        System.out.println("sb2.delete(2, 5) = " + sb2.delete(2, 5));                   // jaysql
        System.out.println("sb2.deleteCharAt(0) = " + sb2.deleteCharAt(0));     // aysql
        
        System.out.println("======================================================================================");
        System.out.println("sb2.insert(1, \"vmy\") = " + sb2.insert(1, "vmy"));     // avmyysql

        /* 설명. insert() : 인자로 전달된 값을 문자열로 변환한 후, 지정한 인덱스 위치에 추가.
         *  원본에 영향을 미침(누적)   */
        System.out.println("======================================================================================");
        System.out.println("sb2.insert(0,\"oracle\") = " + sb2.insert(0,"oracle"));               // 맨 앞
        System.out.println("sb2.insert(sb2.length(), \"jdbc\") = " + sb2.insert(sb2.length(), "jdbc"));   // 맨 뒤

        /* 필기. reverse() : 문자열 인덱스 순번을 역으로 재배열한다.
         *  원본에 영향을 미침(누적) */
        System.out.println("======================================================================================");
        System.out.println("sb2.reverse() = " + sb2.reverse());
        System.out.println("sb2 = " + sb2);

        /* 설명. String 클래스와 동일한 메소드들도 많다.
         *  charAt(), indexOf()/lastIndexOf(), length(), replace(), substring(), toString()...
         * */


    }
}
