package com.ohgiraffers.section03.copy;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 복사 개념 중 얕은 복사에 대해 이해할 수 있다. */
        /* 필기.
         *  배열의 복사에는 크게 두 가지 종류가 있다.
         *  1. 얕은복사(shallow copy) : stack의 주소값만 복사
         *  2. 깊은복사(deep copy) : heap의 배열에 저장된 값을 복사
         * */

        /* 설명. 먼저 얕은 복사에 대해 알아보자 */
        /* 필기.
         *  얕은 복사는 stack에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
         *  따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
         *  하나의 레퍼런스변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하게 되면
         *  다른 레퍼런스변수로 배열에 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영되어 있다.
         * */

        /* 설명. 얕은복사 확인을 위한 원본 배열 생성 */

        int[] originArr = {1, 2, 3, 4, 5};

        /* 설명. originArr에 저장된 배열의 주소를 copyArr에도 저장 */
        int[] copyArr = originArr;

        /* 설명. hashcode를 출력해보면 두 개의 레퍼런스 변수는 동일한 주소를 가지고 있다는 것을 검증할 수 있다. */
        System.out.println("originArr의 HashCode = " + originArr.hashCode());
        System.out.println("copyArr의 HashCode = " + copyArr.hashCode());

        /* 설명. 원본 배열 및 복사본 배열의 값을 출력 */
        System.out.print("originArr의 값 = \t");
        for(int i = 0; i <= originArr.length - 1; i++) {
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        System.out.print("copyArr의 값 = \t\t");
        for(int i = 0; i <= copyArr.length - 1; i++) {
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();

        /* 설명. 두 배열은 동일한 값을 가지고 있다.
         *  복사본 배열의 특정 요소를 골라 그 값을 변경한 뒤 다시 배열의 값을 출력해보자.
         *  복사본 배열의 값을 변경했음에도 원본 배열에 영향을 미치는 것을 확인할 수 있다.
         *  서로 다른 배열을 가리키고 있기 때문이다. (현재 Heap 메모리 상에 현존하는 배열은 하나 뿐이다.)
         * */

        copyArr[0] = 99;    // 1 -> 99 값 변경

        System.out.print("originArr의 값 = \t");
        for(int i = 0; i <= originArr.length - 1; i++) {
            System.out.print(originArr[i] + " ");
        }
        System.out.println();

        System.out.print("copyArr의 값 = \t\t");
        for(int i = 0; i <= copyArr.length - 1; i++) {
            System.out.print(copyArr[i] + " ");
        }
        System.out.println();




    }
}
