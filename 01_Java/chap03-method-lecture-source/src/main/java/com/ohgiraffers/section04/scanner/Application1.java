package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /*수업목표. java.util.Scanner를 이용한 다양한 자료형 값 입력 받기 */
        /* 설명.
         *  콘솔 화면에 값을 입력받아 출력해보기
         *  이렇게 초보자가 바로 작성하기 어려운 기능들을 JDK에 미리 구현한 후 JDK를 배포한다.
         * */

        /* 목차. 1. Scanner 객체 생성 */
        /* 목차. 1-1. 원래 이렇게 Scanner 객체를 생성하는것이 FM이다. */
//        java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);

        /* 목차. 1-2. 하지만, java.lang은 패키지 이름이 생략 가능하다*/
//        java.util.Scanner sc = new java.util.Scanner(System.in);

        /* 목차. 1-3. 다른 패키지에 있는 클래스 사용시 패키지명을 생략하기 위해 사용하는 구문인 import를 사용 */
        Scanner sc = new Scanner(System.in);

        /* 목차. 2. 자료형별 값 입력받기 */
        /* 설명.
         *  입력받을 때의 안내 문구는 별도로 출력되지 않기 떄문에 사람이 직접 입력해줘야 한다.
         *  print()와 println()은 줄바꿈 문자가 있냐 없냐의 차이다.
         *  다음 줄에 입력을 대기시키는 것이 아니고, 줄바꿈하지 않고 입력받게 하기 위해 print()를 사용할 것이다.
         *  */

        /* 목차. 2-1. 문자열 입력 받기 */
        /* 설명. nextLine(): 입력받은 값을 문자열로 반환 */

        System.out.print("이름을 입력하세요 : ");

        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        /* 목차 2-2. 정수형 값 입력 받기 */
        /* 설명. nextInt(): 입력받은 값을 int형으로 반환 */
        System.out.print("나이를 입력하세요 : ");

        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "살입니다.");

        /* 설명.
         *  nextByte() 및 nextShort()는 생략한다.
         *  매개변수로 사용할 수 있는 radix는 진법을 지정할 수 있다.
         *  숫자가 아닌 값을 입력하게 되면 InputMismatchException이 발생한다.
         *  int 범위를 초과한 값을 입력받게 되면 역시 InputMismatchException이 발생한다.
         *  Exception은 나중에 다시 다루게 되겠지만 쉽게 표현하자면 에러 같은 개념이라고 생각하자.
         * */

        /* 필기.
         *  nextLong(): 입력받은 값을 long형으로 반환.
         *  (nextInt와 Exception이 발생하는 이유는 동일하다.   */

        System.out.print("금액을 입력해주세요 : ");

        long money = sc.nextLong();
        System.out.println("입력하신 금액은 : " + money + "원 입니다.");

        /* 목차. 2-3. 실수형 값 입력받기 */
        /* 필기. nextFloat(): 입력받은 값을 float형으로 변환
         *  정수형태로 입력받으면 실수로 변환한 후 정상 동작됨.
         *  숫자 형태의 값이 아닌 경우 InputMismatchException이 발생함.
         *    */
        System.out.println("키(cm)를 입력해주세요 : " );

        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height + "cm 입니다.");

        /* 필기. nextDouble() : 입력받은 값을 double 형으로 반환한다. */
        /* 설명.
         *  정수 형태로 입력받으면 실수로 변환 후 정상 동작
         *  숫자형태의 값이 아닌 경우 InputMismatchException 발생
         * */
        System.out.print("원하는 실수(real number)를 입력하세요 : ");

        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 " + number + "입니다.");

        /* 목차. 2-4. 논리형 값 입력받기 */
        /* 필기. nextDouble() : 입력받은 값을 double 형으로 반환한다. */
        /* 설명.
         *  정수 형태로 입력받으면 실수로 변환 후 정상 동작
         *  숫자형태의 값이 아닌 경우 InputMismatchException 발생
         * */
        System.out.println("true(참)와 false(거짓) 중, 한 가지를 골라 입력해주세요 : ");

        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리값은 \"" + isTrue + "\"입니다.");

        /* 목차. 2-5. 문자형 값 입력받기 */
        /* 설명. 아쉽게도 문자를 직접 입력받을 수 있는 기능은 제공하지 않는다.
         *  따라서 문자열로 입력받은 후 입력받은 문자열에서 원하는 순번의 문자를 골라내어 분리해 사용해야 한다.
         *  java.lang.String에 charAt(int index) 메소드를 사용할 수 있다.
         *  index를 정수형에서 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자 타입으로 반환해주는 기능이다.
         *  index는 0부터 시작하는 숫자 체계이며, 컴퓨터에서 주로 사용되는 방식이다.
         *  만약, 존재하지 않는 인덱스를 입력하게 되면 IndexOutOfBoundsException이 발생한다.
         * */
        sc.nextLine();
        System.out.println("아무 문자나 입력해주세요 : ");

        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 \'" + ch + "\'입니다.");


    }
}
