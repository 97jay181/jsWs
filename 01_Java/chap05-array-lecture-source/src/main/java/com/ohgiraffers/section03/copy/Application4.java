package com.ohgiraffers.section03.copy;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 깊은복사를 사용한 자바 문법을 이해하고 이를 활용할 수 있다. */
        /* 필기.
         *  깊은 복사는 원본과 복사본 중 둘 중 한 가지 값을 변경해도 다른 하나에 영향을 주지 않는다.
         *  같은 값을 가지고 있는 서로 다른 배열이기 때문이다.
         * */
        /* 설명. 이러한 깊은 복사의 특성을 이용하는 자바의 구문이 있다. */

        /* 설명. 두 개의 같은 값을 가지는 배열을 만든다. (깊은 복사) */
        int[] arr1= {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        /* 설명. 각 배열의 인덱스에 순환 참조하여 10씩 누적 증가를 시켜본다 */
        for(int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] += 10;
        }

        /* 설명. 반복문을 이용해 값을 출력해본다. */
        System.out.print("arr1 출력 : ");
        for(int i = 0; i <= arr1.length - 1; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        /* 필기. for-each문 (향상된 for문)
         *  JDK 1.5 버전부터 추가된 기능.
         *  배열 인덱스에 하나씩 차례로 접근해서 담긴 값을 임시로 사용할 변수에 담고, 반복문을 실행한다.
         * */
        System.out.print("arr2 출력 : ");
        for(int element : arr2) {
            element += 10;  // 누적 증가되지 않는다.
                            // 인덱스에 접근해서 값을 변경하는 방식이 아니라 꺼낸 값을 복사해서 사용했기 때문이다.
        }

        /* 필기. 주의!!!
         *  향상된 for문은 배열의 인덱스를 통해 차례로 접근할 때는 편하지만, 값을 변경할 수는 없다.
         *  대신 변경하는 것이 아니고 사용하는 것(참조)이 목적이라면 조금 더 편하게 사용할 수 있다.
         * */
        for(int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] += 10;
        }

        for(int element : arr2) {
            System.out.print(element + " ");
        }

        System.out.println();





    }
}
