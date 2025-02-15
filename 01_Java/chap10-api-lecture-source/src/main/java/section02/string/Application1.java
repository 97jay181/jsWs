package section02.string;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. String 클래스의 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다. */

        /* 필기.
         *  charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
         *  인덱스는 0부터 시작하는 숫자 체계를 의미하며
         *  인덱스를 벗어난 정수를 인자로 전달하는 경우에는 IndexOutOfBoundsException이 발생한다.
         * */
        String str1 = "Apple";

        for (int i = 0; i <= str1.length() - 1; i++) {
            System.out.println("charAt(" + i + "): " + str1.charAt(i));
        }

        // 향상된 for문
        // 못돌림 -> 꼼수
        // 문자열은 문자의 집합이다.
        // 문자열을 char[] 로 만들어서 돌려줄거야
//        int count = 0;
//        for (char c : str1.toCharArray()) {
//            System.out.println("charAt(" + count + "): " + c);
//            count++;
//        }
//        count = 0;


        /* 필기.
         *  compareTo() : 인자로 전달된 문자열과 사전 순으로 비교를 하여
         *  두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를,
         *  크면 양수를 반환한다.
         *  단, 이 메소드는 대소문자를 구분하여 비교한다.
         * */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "MySQL";

        /* 설명. 같으면 0을 반환 */
        System.out.println("(str2.compareTo(str3)) = " + (str2.compareTo(str3)));   // 0
        System.out.println();

        /* 설명. 대문자와 소문자는 ASCII 코드 상에서 32만큼 차이가 발생 */
        System.out.println("(str2.compareTo(str4)) = " + (str2.compareTo(str4)));   // 32
        System.out.println("(str4.compareTo(str2)) = " + (str2.compareTo(str2)));   // 0
        System.out.println();

        System.out.println("(str2.compareTo(str5)) = " + (str2.compareTo(str5)));   // 29
        System.out.println("(str5.compareTo(str2)) = " + (str2.compareTo(str2)));   // 0
        System.out.println();

        /* 설명. compareToIgnoreCase() : 대소문자를 구분하지 않고 비교 */
        System.out.println("str3.compareToIgnoreCase(str4) = " + str3.compareToIgnoreCase(str4));
        System.out.println();

        /* 필기.
         *  concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
         *  원본 문자열에는 영향을 주지 않는다.
         * */
        System.out.println("str2.concat(str5 = " + str2.concat(str5));
        System.out.println("str2(원본문자열) = " + str2);
        System.out.println();

        /* 필기.
         *  indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
         *  단, 일치하는 문자가 없는 경우 -1을 반환한다.
         * */
        String indexOf = "Java oracle MySQL";

        System.out.println("indexOf.indexOf('a') = " + indexOf.indexOf('a'));   // 1
        System.out.println("indexOf.indexOf('a') = " + indexOf.indexOf('z'));   // -1
        System.out.println();

        /* 필기.
         *  lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환한다.
         *  lastIndexOf() : 문자열 내부에서 전달인자로 전달된 문자가 가장 마지막으로 사용된 인덱스를 반환한다.
         *  단, 일치하는 문자가 없는 경우 -1을 반환한다.
         * */
        System.out.println("indexOf.indexOf('a') = " + indexOf.lastIndexOf('a'));   // 7
        System.out.println("indexOf.indexOf('a') = " + indexOf.lastIndexOf('z'));   // -1

        /* 필기. trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */
        String trimStr = "   java   ";      //앞 뒤 공백 3칸

        /* 설명. 앞 뒤 공백을 확인하기 위해 # 기호를 붙였다. */
        System.out.println("trimStr : #" + trimStr + "#");
        System.out.println("trim() : #" + trimStr.trim() + "#");   //공백 제거됨

        /* 설명. 원본에 영향을 주지는 않는다. */
        System.out.println("trimStr : #" + trimStr + "#");

        /* 필기.
         *  toLowerCase() : 모든 문자를 소문자로 변환시킨다.
         *  toUpperCase() : 모든 문자를 대문자로 변환시킨다.
         *  원본에는 영향을 주지 않는다.
         * */
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());      //javaoracle
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());      //JAVAORACLE

        System.out.println("caseStr : " + caseStr);                     //JavaOracle

        /* 필기.
         *  substring() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다.
         *  원본에 영향을 주지 않는다.
         * */
        String javaoracle = "javaoracle";

        System.out.println("substring(3, 6) : " + javaoracle.substring(3, 6));   //aor
        System.out.println("substring(3) : " + javaoracle.substring(3));      //aoracle

        System.out.println("javaoracle : " + javaoracle);

        /* 필기.
         *  replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다.
         *  원본에 영향을 주지 않는다.
         * */
        System.out.println("replace() : " + javaoracle.replace("java", "python"));

        System.out.println("javaoracle : " + javaoracle);

        /* 필기. length() : 문자열의 길이를 정수형으로 반환한다. */
        System.out.println("length() : " + javaoracle.length());
        System.out.println("빈 문자열 길이 : " + ("".length()));

        /* 필기.
         *  isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false를 반환
         *  길이가 0인 문자열은 null과는 다르다.
         * */
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "abc".isEmpty());



    }

}
