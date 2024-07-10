package section02.string;

import java.util.StringTokenizer;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 문자열 분리(parsing)에 대해 이해하고 적용할 수 있다. */

        /* 필기. 문자열을 특정 구분자(delimeter)로 하여금 분리한 문자열을 반환하는 기능을 수행한다.
         *  - split() :
         *      정규표현식을 이용하여 문자열을 분리함.
         *      비정형화된 문자열을 분리할 떄 좋지만(공백 문자열 값 포함)
         *      정규표현식을 이용하기 때문에 속도가 느리다는 단점이 있음.
         *      정규표현식은 Java에서는 다루지 않고 JavaScript에서 다룰 예정임.
         *   - StringTokenizer :
         *      문자열의 모든 문자들을 구분자로 하여금 문자열을 분리한다.
         *      정형화된 문자열 패턴을 분리할 때 사용하기 좋다. (공백 문자열 무시)
         *      split()보다 속도면에서 더 빠르다.
         *      구분자를 생략하는 경우, 공백이 default 구분자다.
         * */

        String emp1 = "100/홍길동/서울/영업부";     // 모든 값이 존재함
        String emp2 = "200/유관순/총무부";          // 주소 없음
        String emp3 = "300/이순신/경기도";          // 부서 없음

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        for (int i = 0; i <= empArr1.length - 1; i++) {
            System.out.println("empArr[" + i + "]" + empArr1[i]);   // emp1 : 전체 정상 출력
        }

        for (int i = 0; i <= empArr2.length - 1; i++) {
            System.out.println("empArr2[" + i + "]" + empArr2[i]);  // emp2 : 전체 정상 출력(중간에 빈 문자열 존재)
        }

        int index = 0;
        for(String s : empArr3) {
            System.out.println("empArr3[" + index + "]:" + s);          // emp3 : 마지막 빈 문자열 없음
            index++;
        }
        index = 0;

        /* 설명. 마지막 구분자 사이에 값이 존재하지 않는 경우, 이후 값도 추출하고 싶을 떄 몇 개의 토큰으로
         *  분리할 것인지 한계치(int limit)를 두 번쨰 인자로 전달할 수 있다.
         *  이 떄, 음수를 전달하게 되면 마지막 구분자 뒤의 값이 존재하지 않을 떄 빈 문자열로 토큰을 새성해 반환한다.
         * */
        String[] empArr4 = emp3.split("/", -1);

        for (int i = 0; i <= empArr4.length - 1; i++) {
            System.out.println("empArr4[" + i + "]" + empArr4[i]);   //
        }

        /* 설명. StringTokenizer의 경우 */
        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        /* 설명. StringTokenizer의 경우, 공백으로 존재하는 값을 무시해버린다. */
        System.out.println("==========================================");
        while(st1.hasMoreTokens()) {
            System.out.println("str1 : " + st1.nextToken());
        }
        System.out.println("==========================================");
        while(st2.hasMoreTokens()) {
            System.out.println("str2 : " + st2.nextToken());
        }
        System.out.println("==========================================");
        while(st3.hasMoreTokens()) {
            System.out.println("str3 : " + st3.nextToken());
        }
        /* 설명. nextToken()으로 토큰을 꺼내면 해당 StringTokenizer 객체의 currentPosition이 maxPosition에 도달했기 때문에
         *  다음 토큰이 없다고 판단한다. */
        System.out.println("==========================================");
        while(st1.hasMoreTokens()) {
            System.out.println("str1 : " + st3.nextToken());
        }

        /* 설명. split()은 정규표현식(문자열 패턴), StringTokenizer는 구분자 문자열을 사용한다. */
        String colorStr = "harry*potter#black/and the Order of the Phoenix yellow green";

        /* 설명. "*#/ " 라는 문자열이 구분자로 존재하지 않기 떄문에 에러가 발생 */
//        String[] colors = colorStr.split("*#/ ");
        /* 설명. 대괄호로 묶은 문자열은 문자열이 아니라 각 문자들의 패턴으로 인식해야 한다.
         *  따라서 순서 상관 없이 존재하는 문자들을 이용해 구문자로 사용할 수 있다.
         * */
        System.out.println("==========================================");
        String[] colors = colorStr.split("[*#/ ]");

        for(int i = 0; i <= colors.length - 1; i++) {
            System.out.println("colors[" + i + "]:" + colors[i]);
        }

        /* 설명. StringTokenizer의 두 번째 인자인 문자열 자체는 연속된 문자열이 아닌 하나하나를 구분자로 이용하겠다는 의미다. */
        System.out.println("==========================================");
        StringTokenizer colorTokenizer = new StringTokenizer(colorStr, "*#/ ");

        while(colorTokenizer.hasMoreTokens()) {
            System.out.println(colorTokenizer.nextToken());
        }
    }
}
