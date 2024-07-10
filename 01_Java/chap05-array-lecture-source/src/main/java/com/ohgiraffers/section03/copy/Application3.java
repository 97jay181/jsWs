package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 깊은 복사에 대해 이해할 수 있다. */
        /* 필기.
         *  깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
         *  또 다른 배열에 복사를 해 놓은 것이다.
         *  서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
         *  하나의 배열에 변경을 하더라도 다른 배열에는 영향을 주지 않는다.
         * */

        /* 필기.
         *  깊은 복사를 하는 방법은 4가지가 있다.
         *  1. for문을 이용한 동일한 인덱스의 값 복사
         *  2. Object의 clone()을 이용한 복사
         *  3. System의 arraycopy()를 이용한 복사
         *  4. Arrays의 copyOf()를 이용한 복사
         *  이 중 가장 높은 성능을 보이는 것은 순수 배열의 복사를 위해 만들어진 arraycopy() 메소드이며
         *  가장 많이 사용되는 방식은 좀 더 유연한 방식인 copyOf() 메소드 이다.
         *  clone()은 이전 배열과 같은 배열밖에 만들 수 없다는 특징을 가지고
         *  그 외 3가지 방법은 복사하는 배열의 길이를 마음대로 조절할 수 있다는 특징을 가지고 있다.
         * */

        /* 설명. 원본 배열 할당 및 초기화 */
        int[] originArr = new int[] {1, 2, 3, 4, 5};

        /* 설명. 배열을 출력하는 메소드를 따로 생성해 호출한다. */
        print(originArr);

        /* 목차1. for문을 이용한 동일한 인덱스 값 복사 */
        int[] copyArr1 = new int[5];

        for(int i = 0; i <= originArr.length - 1; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);

        /* 목차2. Object의 clone()을 이용한 복사 */
        int[] copyArr2 = originArr.clone();
        String str = "Hello Java";

        print(copyArr2);

        /* 목차3. System의 arraycopy()을 이용한 복사 */
        int[] copyArr3 = new int[10];

        System.arraycopy(originArr, 0, copyArr3, 0 , originArr.length);
        // src(source : 출발,원점) <--> dest(destination : 도착, 끝점)
        print(copyArr3);

        /* 목차4. Arrays의 copyOf()을 이용한 복사 */
        int[] copyArr4 = Arrays.copyOf(originArr, 4);

        print(copyArr4);

    }

    public static void print(int[] iarr) {
        System.out.println("iarr의 hashcode = " + iarr.hashCode());

        System.out.print("iarr = {");
        for(int i = 0; i <= iarr.length - 1; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println("}");
    }



}
