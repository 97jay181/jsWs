package com.ohgiraffers.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 HashMap을 이요할 수 있다. */

        /* 필기. Set 인터페이스를 구현한 Set 계열 컬렉션 클래스의 특징
         *  1. 요소의 저장 순서를 유지하지 않는다. -> 순서가 중요한 자료구조가 아님.
         *  2. 같은 요소의 중복 저장을 허용하지 않는다. -> null값 조차도 중복될 수 있기 때문에 하나의 null만 저장.
         * */

        /* 설명. HashSet 클래스
         *  Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나다.
         *  JDK 1.2부터 제공되고 있으며 해시 알고리즘(hash algorithm)을 사용해 검색속도가 빠르다는 장점을 가진다.
         * */

        /* 설명. HashSet 인스턴스 생성 */
        HashSet<String> hset = new HashSet<>();

        /* 설명. 다형성을 적용해 상위 인터페이스 타입으로도 인스턴스 생성 가능  */
//        Set<String> hset2 = new HashSet<>();
//        Collection<String> hset3 = new HashSet<>();

//        hset.add("java");   // String Pool
        hset.add(new String("java"));
        hset.add(new String("mysql"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));

        /* 설명. 순서 유지 안됨 */
        System.out.println("hset = " + hset);
        System.out.println("hset.size() = " + hset.size());

        /* 설명. 중복 허용 안됨 */
        hset.add(new String("java"));   // 중복된 값이 이미 존재하기 때문에 아무일도 안함.
        System.out.println("hset = " + hset);
        System.out.println("hset.size() = " + hset.size());

        /* 설명. contains() : 해당 HashSet에 전달 인자로 전달한 객체가 존재한다면 true를, 없다면 false를 반환. */
        System.out.println("hset.contains(\"java\") = " + hset.contains("java"));
        System.out.println("hset.contains(new String(\"java\")) = " + hset.contains(new String("java")));

        /* 목차 1. toArray() 배열로 바꾸고 for loop 사용 */
        Object[] arr = hset.toArray();

        for(Object o : arr) {
            System.out.println("o = " + o);
        }

        /* 목차 2. iterator()로 목록 만들어 연속적으로 처리 */
        Iterator<String> iter = hset.iterator();
        
        while(iter.hasNext()) {
            System.out.println("iter.next() = " + iter.next());
        }

        /* 설명. clear()로 Set 전체 삭제 가능 */
        System.out.println("hset.isEmpty() = " + hset.isEmpty());
        hset.clear();
        System.out.println("hset.isEmpty() = " + hset.isEmpty());




    }
}
