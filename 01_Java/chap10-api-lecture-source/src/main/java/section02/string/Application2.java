package section02.string;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 문자열 객체를 만드는 다양한 방법을 숙지하고 인스턴스가 생성되는 방식을 이해할 수 있다. */

        /* 필기. 문자열 객체를 만드는 2가지 방법
         *  1. 리터럴 형태 -> String str = "";
         *   : 동일한 값을 가지는 인스턴스를 '단일 인스턴스(singleton)'로 관리한다.
         *  2. 객체 형태 -> String str = new String("some string");
         *   : 매번 새로운 인스턴스를 생성한다.
         * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        /* 설명. 리터럴 형태로 생성한 문자열 인스턴스는 동일한 (주소)값을 가지는 인스턴스는 하나의 인스턴스로 관리.
         *  따라서 주소값을 비교하는 ==(동일비교) 연산으로 비교했을 떄 서로 동일한 Stack에 저장된 주소를 비교하여 true를 반환.
         * */
        System.out.println("(str1 == str2) = " + (str1 == str2));   // true

        /* 설명. new 연산자로 새로운 인스턴스를 생성하게 되면 기존 인스턴스를 두고 새로운 인스턴스를 할당한 것이다.
         *  따라서 == 연산으로 비교했을 떄 서로다른 주소값을 가지고 있기 떄문에 false를 반환한다.
         * */
        System.out.println("(str2 == str3) = " + (str2 == str3));   // false

        /* 설명. 위와 동일하게 new 연산자로 새로운 인스턴스를 생성하면 문자열 값이 같더라도 새로운 인스턴스를 할당한다.
         *  따라서 == 연산으로 비교했을 때 서로 다른 주소갑승ㄹ 가지고 있기 떄문에 false를 반환한다.
         * */
        System.out.println("(str3 == str4) = " + (str3 == str4));   // false
        System.out.println("===================================================");

        /* 설명. 하지만 4개의 문자열 모두 동일한 hashCode값을 가진다.
         *  동일한 문자열은 동일한 hashCode값을 반환하도록 재정의 되어있기 떄문이다.
         *  (cmd + 클릭하여 hashCode()로 이동해본다.)    */
        System.out.println("str1.hashCode = " + str1.hashCode());
        System.out.println("str2.hashCode = " + str2.hashCode());
        System.out.println("str3.hashCode = " + str3.hashCode());
        System.out.println("str4.hashCode = " + str4.hashCode());

        /* 설명. 문자열은 불변성(immutable)이라는 특성을 가진다.
         *  기존 문자열에 + 연산을 수행하게 되면 문자열을 수정하는 것이 아닌, 새로운 문자열을 할당하게 된다.
         * */
        str2 += "MySQL";    // str2 = str2 + "MySQL"를 줄인것;

        /* 설명. str1과 str2은 기존에 "java"라는 동일한 값을 가지는 동일 인스턴스였으나,
         *  + 연산 이후 다른 인스턴스가 된 것을 볼 수 있다. */
        System.out.println("str1 == str2 = " + (str1 == str2));

        /* 설명. String.equals()
         *   : String 클래스의 equals() 메소드는 인스턴스 비교(주소)가 아닌 문자열 값을 비교.
         *     동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를 반환하도록 Object.equals() 메소드를
         *     오버라이딩하여 재정의한 메소드다.
         *     따라서 문자열 인스턴스 생성 방식과 관계 없이, 동일한 문자열인지만을 비교하기 위해서는 == 연산 대신에
         *     String.equals() 메소드를 사용해야 한다.
         **/
        System.out.println("str1.equals(str3) = " + str1.equals(str3));
        System.out.println("str1.equals(str4) = " + str1.equals(str4));

        /* 설명.
         *  참고로 new java.util.Scanner(System.in).nextLine(); 을 이용해 문자열을 입력받는 경우,
         *  substring()으로 잘라내기 연산을 수행해 새로운 문자열을 생성한 후 반환하기 때문에
         *  new String()으로 인스턴스를 생성한 것과 동일한 것으로 볼 수 있다.
         *  따라서 Scanner로 입력받은 문자열을 비교할 때에는  String.equals()를 사용해야 한다.
         *  구분하기 힘들다면 그냥 문자열은 모두 다 equals()를 사용해 비교하는 것이 가장 좋다고 생각하면 된다.
         * */
        System.out.println("===========");
        String myStr = "java";

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하시오: ");
        String userInput = sc.nextLine();

        System.out.println("(userInput == myStr) = " + (userInput == myStr));
        System.out.println("myStr.equals(userInput) = " + myStr.equals(userInput));

    }
}
