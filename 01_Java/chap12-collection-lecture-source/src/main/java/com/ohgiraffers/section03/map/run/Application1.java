package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이용할 수 있다. */

        /* 필기.
         *  Map 인터페이스의 특징
         *  Collection 인터페이스와는 다른 저장 방식을 가진다.
         *  키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         * 필기.
         *  키(key)란?
         *  값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
         *  1. 요소의 저장 순서를 유지하지 않는다.
         *  2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값은 저장 가능하다.
         *
         * 필기.
         *  HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
         *  HashMap이 가장 많이 사용되며 HashTable은 JDK 1.0부터 제공되며
         *  HahaMap과 동일하게 동작한다. 하위 호환을 위해 남겨놓았기 때문에 가급적이면 HashMap을 사용하는 것이 좋다.
         * */

        /* 필기.
         *  HashMap
         *  JDK 1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다.
         *  */

        /* 설명. HashMap 인스턴스 생성 */
        HashMap hmap = new HashMap();
//        Map hamp2 = new HashMap();      // 다형성 적용

        /* 설명. 키(key)-값(value) 쌍(pair)으로 저장한다. (단, 키, 값 모두 객체 타입이어야 한다.) */
        hmap.put("one", new Date());
        hmap.put(12, "white apple");
        hmap.put(45, 8580);

        System.out.println("hmap = " + hmap);

        /* 설명. 키 객체는 중복을 허용하지 않음(Set과 동일한 부분) -> 최근 값으로 덮어씀(override) */
        hmap.put(12, "yellow banana");
        System.out.println("hmap = " + hmap);

        /* 설명. 값 객체는 중복을 허용한다.  */
        hmap.put(13, "yellow banana");
        hmap.put(14, "yellow banana");
        System.out.println("hmap = " + hmap);

        /* 설명. Map에서 값을 추출할 떄는 get(Object k)을 사용. */
        System.out.println("hmap.get(13) = " + hmap.get(13));
        System.out.println("hmap.get(\"one\") = " + hmap.get("one"));

        /* 설명. Map에서 값을 지울떄는 remove(Object k)을 사용. */
        hmap.remove(13);
        System.out.println("hmap = " + hmap);

        /* 설명. 저장된 객체(k-v pair, k-v mapping)의 개수를 반환 */
        System.out.println("hmap.size() = " + hmap.size());

        /* 설명. 제네릭 설정하여 HashMap 인스턴스 생성 */
        HashMap<String, String> hamp2 = new HashMap<>();

        hamp2.put("one", "java 17");
        hamp2.put("two", "MySql 8");
        hamp2.put("three", "JDBC");
        hamp2.put("four", "HTML5");
        hamp2.put("fice", "CSS3");

        /* 설명. Map도 반복자를 사용할 수 있다. 기본적인 메커니즘은 Map을 Set으로 만들 수 있다는 점에서 시작한다. */
        /* 목차 1. HashMap.keySet()을 사용해 해당 Map의 key값으로만 Set 자료구조를 맞든다.
         *  이후 Set.iterator()로 key 값들에 대한 목록(반복자)을 만듦.
         * */
//        Set<String> keys = hamp2.keySet();
//        Iterator<String> keyIter = keys.iterator();
        Iterator<String> keyIter = hamp2.keySet().iterator();

        while(keyIter.hasNext()) {
            String key = (String) keyIter.next();
            String value = hamp2.get(key);

            System.out.println(key + "=" + value);
        }

        /* 목차 2. 저장된 value 객체들만 values()로 Collection 타입의 인스턴스로 생성 */
        Collection<String> values = hamp2.values();

        /* 목차 2-1. iterator() 메소드를 사용해 Iterator 타입으로 변환한 뒤 반복문 사용 */
        Iterator<String> valueIter = values.iterator();

        while(valueIter.hasNext()) {
            System.out.println("valueIter.next() = " + valueIter.next());
        }

        /* 목차 2-2. 배열로 만들어서 반복문 사용 */
        Object[] valueArr = values.toArray();
        for(int i = 0; i <= valueArr.length - 1; i++) {
            System.out.println(i + ":" + valueArr[i]);
        }

        /* 목차 3. Map의 내부 클래스인 EntrySet을 사용 -> entrySet() */
        Set<Map.Entry<String, String>> set = hamp2.entrySet();

        Iterator<Map.Entry<String, String>> entryIter = set.iterator();

        while(entryIter.hasNext()) {
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
