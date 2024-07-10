package com.ohgiraffers.section04.sort;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 변수의 두 값을 변경하는 방법에 대해 이해할 수 있다. */
        /* 필기. 변수의 두 값 변경해보기. */
        int n1 = 10;
        int n2 = 20;
        
        System.out.println("변경 전 값 출력");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        /* 설명. 두 변수의 값을 바꾸기 위해 다른 변수 한 개가 더 필요하다. */
//        int temp = n1;
//        n1 = n2;
//        n2 = temp;

        int temp;
        temp = n1;
        n1 = n2;
        n2 = n1;

        System.out.println("변경 후 값 출력");
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        /* 설명. 배열의 인덱스에 있는 값도 서로 변경할 수 있다. (변수와 크게 다르지 않다.) */
        int[] arr = {2, 1, 3};

        for(int i : arr) {    // for( single  : set  )
            System.out.print(i + " ");
        }
        System.out.println();

        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        System.out.print("변경 후 값 출력");
        for(int i : arr) {    // for( single  : set  )
            System.out.print(i + " ");
        }
        System.out.println();



    }
}
