package com.ohgiraffers.section05.logical;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 논리연결연산자의 진리표(truth table)에 대해 이해할 수 있다. */

        /* 필기
         *  AND 연산자와 OR 연산자의 특징
         *  {논리식} && {논리식} : 앞의 결과가 false면, 뒤는 실행 안함.
         *  {논리식 || {논리식} : 앞의 결과가 true면, 뒤는 실행 안함.
         *  */

        /* 목차. 1. 논리식 && 논리식 : 앞의 결과가 false면 뒤를 실행하지 않음. */
        /* 필기
         *  조건식 두 개가 모두 만족해야 true를 반환하지만, 앞에서 미리 false가 나오게 되면
         *  뒤의 조건을 확인할 필요도 없이 false를 반환한다.
         *  따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 앞에 false가 나올 가능성이 높은 조건을
         *  작성해두는 것이 더 효율적이다.
         *  */

        int num1 = 10;

        /* 설명
         *  앞에 조건이 false로 강제화 해두고 && 뒤의 조건은 선치 증가로 값을  증가시킨 후 별 의미없는 조건으로
         *  만들어 놓았다. num1 선치 증가 코드가 동작했다면, result1은 11일 것이고, 동작하지 않았따면 10일 것이다.
         *  */
        int result1 = (false && ++num1 > 0) ? num1 : num1;
        System.out.println("false && xxxx 실행 결과 확인 = " + result1);

        /* 목차 2. {논리식} || {논리식} : 앞의 결과가 true이면,, 뒤를 실행하지 않음  */
        /* 필기.
         *  조건식 둘 중 하나라도 true를 반환하면, 무조건 true를 반환하기 때문에 앞에서 미리 true가 나와버리면
         *  뒤의 조건을 확인할 필요도 없이 true를 반환한다.
         *  따라서 연산 횟수를 줄이기 위해서는 || 연산일 경우 앞에 true가 나올 가능성이 높은 조건을 작성하는 편이
         *  더 효율적이다.
         *  */
        int num2 = 10;

        /* 설명.
         *  앞에 조건을 true로 강제화 해두고 || 뒤의 조건은 선치 증가로 값을 증가시킨 뒤 별 의미없는 조건식으로
         *  만들어 놓았따. num1 선치 증가 코드가 작동했다면, result2는 11일 것이고, 동작하지 않았다면 10일 것이다.
         * */
        int result2 = (true || ++ num2 > 0) ? num2 : num2;
        System.out.println("true || xxxx 실행 결과 확인 = " + result2);

    }
}
