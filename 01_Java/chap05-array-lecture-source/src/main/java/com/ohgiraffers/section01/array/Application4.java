package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다. (1) */
        /* 필기. Q) 학생 5명의 Java 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 작성하시오. */

        /* 설명. 5명의 Java 점수를 저장할 배열 생성 */
        int[] scores = new int[5];


        /* 설명. 반복문을 이용해 배열에 점수를 입력 받음 */
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 쨰 학생의 자바 접수를 입력해주세요 : ");
            scores[i] = sc.nextInt();
        }

        /* 설명. 합계 및 평균 연산 */
        double sum = 0.0;
        double avg = 0.0;

        //
        for(int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        avg = sum / scores.length;


        /* 설명. 값 출력 */
        System.out.println("5명 학생의 자바 점수 합계는 = " + sum + " 입니다.");
        System.out.println("5명 학생의 자바 점수 평균은 = " + avg + " 입니다.");
    }



}
