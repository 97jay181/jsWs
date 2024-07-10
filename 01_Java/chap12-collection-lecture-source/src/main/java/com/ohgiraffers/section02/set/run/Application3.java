package com.ohgiraffers.section02.set.run;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. TreeSet에 대해 이해하고 사용할 수 있다. */

        /* 필기.
         *  TreeSet 클래스
         *  TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
         *  이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다.
         *  JDK 1.2부터 제공되고 있으며
         *  Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다.
         * */

        /* 설명. 자동으로 오름차순 정렬하여 이진트리(binary tree) 형태로 요소들을 관리하고 저장함. */
        TreeSet<String> tset = new TreeSet<>();
        Set<String> tset2 = new TreeSet<>();

        tset.add("java");
        tset.add("sql");
        tset.add("jdbc");
        tset.add("css");
        tset.add("html");

        System.out.println("tset = " + tset);

        /* 설명. TreeSet도 Set 계열의 컬렉션이기 때문에 반복문을 사용하려면 iterator() 메소드를 사용해야 한다. */
        Iterator<String> iter = tset.iterator();
        
        while(iter.hasNext()) {
            System.out.println("iter.next() = " + iter.next());
        }

        /* 설명. 배열로 바꿔서 연속 처리하기 */
        Object[] arr = tset.toArray();
        
        for(Object o : arr) {
            System.out.println("o = " + o);
        }

        /* 설명. 로또 번호 발생기 -> TreeSet 자료 구조의 성질을 활용 */
        Set<Integer> lotto = new TreeSet<>();

        while(lotto.size() < 6) {
            lotto.add( (int) (Math.random() * 45) + 1);
        }

        System.out.println("lotto = " + lotto);



    }
}
