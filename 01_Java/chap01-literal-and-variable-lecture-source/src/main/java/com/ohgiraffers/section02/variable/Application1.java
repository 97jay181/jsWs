package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {

        /*  수업목표. 변수의 사용 목적에 대해 이해할 수 있다. */
        /*  필기. 변수의 사용 목적 */
        /*   1. 값에 의미를 부여하기 위한 목적(의미 전달이 쉬워야 코드를 읽기 쉬워지고, 협업 및 유지보수에 유리하기 때문이다
        *    2. 한 번 저장해둔 값을 재사용하기 위한 목적(변수를 이용하여 코드를 작성하면, 값을 변경할 떄도보다 간편하게 변경할 수 있다
        *    3. 시간에 다라 변하는 값을 저장하고 사용할 수 있다 (변하는 값을 저장하기 위한 공간이다)
        * */

        /* 목차. 1. 값에 의미를 부여하기 위한 목적 */
        System.out.println("=========== 값에 의미 부여하는 테스트 =================");

        /* 설명. 아래처럼 작성하면 어느 값이 급여인지, 어느 값이 보너스인지 알 수 없다.  */
        System.out.println("보너스를 포함한 급여 : " + (7000000 + 350000) + "원");

        /* 설명. 아래처럼 작성하면 어느 값이 급여인지, 어느 값이 보너스인지 알 수 없다.  */
        int salary = 7000000;
        int bonus = 350000;
        System.out.println("보너스를 포함한 급여 : " + (salary + bonus) + "원");

        /* 목차. 2. 한 번 저장해둔 값을 재사용하기 위한 목적 */
        System.out.println("========== 변수에 저장한 값 재사용 테스트 ==========");
        /* 설명. 10명의 고객에게 100 포인트를 지급해주는 내용을 출력하도록 작성해보자 */
        System.out.println("1번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를 100포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를 100포인트 지급하였습니다.");

        /* 설명. 위 코드에서 공통적으로 사용된 100이라고 하는 값을 변수에 넣고, 변수를 호출하여 코드를 개선해보자! */

        int point = 100;
        System.out.println("1번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("6번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("7번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("8번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("9번 고객에게 포인트를" + point + "포인트 지급하였습니다.");
        System.out.println("10번 고객에게 포인트를" + point + "포인트 지급하였습니다.");

        

        /* 목차. 3. 시간에 따라 변경되는 값을 저장하고 사용할 수 있다. */
        System.out.println("============ 변수에 저장된 값 변경 테스트 ====================");

        /* 설명. 변수는 하나의 값을 저장하고 사용하기 위한 고악니익 보다, 변하는 값을 저장하기 위한 공간이다. */
        int sum = 0;

        sum = sum + 10;
        System.out.println("Step #1. sum에 10을 더하면 현재 sum의 값은? : " + sum);

        sum = sum + 10;
        System.out.println("Step #2. sum에 10을 더하면 현재 sum의 값은? : " + sum);

        sum = sum + 10;
        System.out.println("Step #3. sum에 10을 더하면 현재 sum의 값은? : " + sum);











    }
}
