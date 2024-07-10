package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. LinkedHashSet에 대해 이해하고 사용할 수 있다. */

        /* 필기.
         *  LinkedHashSet 클래스
         *  HashSet이 가지는 기능을 모두 가지고 있고
         *  추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
         *  JDK 1.4 부터 제공하고 있다.
         * */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("css");
        lhset.add("sql");
        lhset.add("jdbc");
        lhset.add("html");

        System.out.println("lhset = " + lhset);

        /* 설명. LinkedHashSet을 TreeSet으로 새로운 객체를 생성하면 자동으로 오름차순으로 정렬해준다.
         *  (단, 같은 클래스 타입일때만)
         * */
        TreeSet<String> tset = new TreeSet<>(lhset);
        System.out.println("tset = " + tset);
    }
}
