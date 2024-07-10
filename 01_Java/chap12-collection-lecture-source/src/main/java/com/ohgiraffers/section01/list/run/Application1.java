package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크에 대해 이해할 수 있다. */

        /* 필기. 컬렉션 프레임워크(Collection Framework)란?
         *  Java에서 컬렉션 프레임워크는 여러개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
         *  표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
         *  즉, 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스다.
         * */

        /* 필기. Collection Framework는 크게 3가지 인터페이스 중 한 가지를 상속받아 구현해 놓았다.
         *  1. List 인터페이스
         *  2. Set 인터페이스
         *  3. Map 인터페이스
         * ================================================================================================
         *  List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있다.
         *  하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다.
         * */

        /* 필기.
         *  각 인터페이스 별 특징
         *  1. List 인터페이스
         *   - 순서 있는 데이터 집합으로 데이터의 중복 저장을 허용한다.
         *   - Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
         *  2. Set 인터페이스
         *   - 순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
         *   - HashSet, TreeSet 등이 있다.
         *  3. Map 인터페이스
         *   - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
         *   - key를 Set 방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고 중복된 key를 허용하지 않는다.
         *   - value는 중복된 값을 저장할 수 있다.
         *   - HashMap, TreeMap, HashTable, Properties 등이 있다.
         *  */

        /* 설명.
         *  List와 Set의 공통인 Collection 인터페이스 주요 메소드
         *  add(), clear(), contains(), equals(), isEmpty(),
         *  iterator(), remove(), size(), toArray() 등이 있다.
         *  */

        /* 설명. 그 중 먼저 List 계열을 컬렉션 클래스부터 살펴 보자 */

        /* 필기.
         *  List 인터페이스를 구현한 모든 클래스는 요소의 저장 순서가 유지되며, 중복 저장을 허용한다.
         *  ArrayList, LinkedList, Vector, Stack이 있다.
         * */

        /* 설명. 그 중 ArrayList를 먼저 살펴보도록 하자 */

        /* 필기.
         *  ArrayList
         *  가장 많이 사용되는 컬렉션 클래스 이다.
         *  JDK 1.2부터 제공된다.
         *  내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
         *
         * 필기.
         *  ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
         *  배열은 크기를 변경할 수 없고, 요소의 추가, 삭제, 정렬 등이 복잡하다는 단점을 가지고 있다.
         *  ArrayList는 저러한 배열의 단점을 보완하고자
         *  크기 변경(새로운 더 큰 배열 만들고 옮기기), 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
         *  자동적으로 수행되는 것이지 속도가 빨라지는 것은 아니다.
         * */

        /* 설명. ArrayLists는 인스턴스를 생성했을 때 내부적으로 10칸짜리 뱅뎔을 생성해 관리한다. */
        ArrayList aList = new ArrayList();

        /* 설명. 다형성을 적용하여 상위 레퍼런스인 List와 Collection으로도 객체를 생성할 수 있다.
         *  List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 떄문에
         *  레퍼런스 타입은 List로 지정해 두는 것이 더 유연한 코드를 작성하는 방법이다.
         * */
        List list = new ArrayList();
        Collection cList = new ArrayList();

        /* 설명. ArrayList는 저장 순서가 유지되며, 이를 index를 사용해 관리한다.
         *  add(Object e) : ArrayList는 Object 클래스의 하위 타입 인스턴스 모두를 저장할 수 있다.
         * */
        aList.add("apple");
        aList.add(1234);    // int -> Object -> Integer     (오토 박싱)
        aList.add(45.67);   // double -> Object -> Double   (오토 박싱)
        aList.add(new Date());

        /* 설명. ArrayList에는 toString()이 오버라이딩 되어있다. */
        System.out.println("aList = " + aList);

        /* 설명. ArrayList의 크기는 size() 메소드로 확인할 수 있다.
         *  단, size() 메소드는 배열의 크기가 아닌, 요소의 개수를 반환한다.
         *  내부적으로 관리되는 배열의 사이즈는 외부에서 알 필요가 없기 때문에 해당 기능은 제ㅗㄱㅇ하지 않고 있다.
         * */
        System.out.println("aList.size() = " + aList.size());

        /* 설명. 내부 배열에 인덱스가 지정되어 있기 떄문에 for문으로 접근 가능하다. */
        for (int i = 0; i <= aList.size() - 1; i++) {
            /* 설명. 배열의 요소에 접근할 떄는 get() 메소드에 전달인자로 index를 전달하면 된다. */
            System.out.println("aList의 " + i + "번쨰 element:" + aList.get(i).getClass().getName() + "]" + aList.get(i));
        }

        /* 설명. ArrayList는 데이터의 중복 저장을 허용한다.
         *  배열과 동일하게 인덱스로 요소를 관리하기 떄문에 데이터가 중복된다고 해서 해당 데이터를 검색하지 못하는건 아니다.
         * */
        aList.add("apple");
        System.out.println("aList = " + aList);

        /* 설명. 원하는 인덱스 위치에 값을 추가할 수 있다.
         *  값을 중간에 추가하는 경우, 인덱스 위치에 덮어쓰는 것이 아니라
         *  새로운 값이 들어가는 인덱스 위치에 값을 넣고 이후 인덱스는 하나씩 밀리게 된다.
         * */
        aList.add(1, "banana");
        System.out.println("aList = " + aList);

        /* 설명. 저장된 값을 삭제할 때는 remove() 메소드를 사용한다.
         *  중간 인덱스의 값을 삭제하는 경우, 자동으로 인덱스를 하나씩 앞으로 당긴다.
         * */
        aList.remove(2);
        System.out.println("aList = " + aList);

        aList.remove("apple");
        System.out.println("aList = " + aList);

        /* 설명. 지정된 인덱스의 위치 값을 수정할 때에도 인덱스를 활용할 수 있으며 set() 메소드를 사용한다. */
//        aList.set(1, true);                       // 오토박싱
        aList.set(1, Boolean.valueOf(true));    // 박싱
        System.out.println("aList = " + aList);

        /* 설명. 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어 있다. */
        List<String> stringList = new ArrayList<>();

//        stringList.add(123);      // 에러 : String 제네릭 때문에 에러 발생.
        stringList.add("grape");
        stringList.add("pineapple");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("watermelon");

        System.out.println("stringList = " + stringList);

        /* 설명. 저장 순서를 유지하고 있는 stringList를 '손쉽게' 오름차순 정렬할 수 있다.
         *  Collection 인터페이스가 아닌 Collections 클래스임을 헷갈리지 않도록 주의한다.
         *  Collection에서 사용되는 기능들을 static 메소드들로 구현한 클래스로,
         *  인터페잏스명 뒤에 s가 붙은 클래스들은 관례상 비슷한 방식으로 작성된 클래스를 의미하게 된다.
         * */
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);   // 오름차순 정렬

        /* 설명. 조금(?) 복잡하지만, 내림차순 정렬을 할 수도 있다.
         *  다만, ArrayList에서는 역순 정렬 기능을 제공하지 않는다는 것이 문제다.
         *  역순 정렬 기능은 LinkedList에 정의되어있는데, 현재 사용중인 ArrayList를 LinkedList로 변형해본다.   */
        System.out.println("[Before] stringList.getClass().getName() = " + stringList.getClass().getName());    // java.util.ArrayList -> ArrayList는 내림차순 기능이 없음
        stringList = new LinkedList<>(stringList);
        System.out.println("[After] stringList.getClass().getName() = " + stringList.getClass().getName());     // java.util.LinkedList

        /* 설명. Iterator(반복자) 인터페이스를 활용해서 역순으로 정렬할 수 있다.
         *  (이때, 가능하면 제네릭 문법을 적용해주는 것이 좋다.)
         *  LinkedList 타입으로 형변환 한 후, descendingIterator() 메소드를 사용하면
         *  내림차순으로 정렬된 Iterator 타입의 목록을 반환해준다.
         * */

        /* 필기. 반복자(Iterator)란?
         *  Collection 인터페이스의 iterator() 메소드를 이요해 인스턴스를 생성할 수 있다.
         *  컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
         *  반복자라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
         *  인덱스로 관리되는 컬렉션이 아닌 경우, 반복문을 사용해서 요소에 하나씩 접근할 수 없는 구조이기 떄문에
         *  인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
         *  ==========================================================================================
         *  - hasNext() : 다음 요소를 가지고 있다면 true, 더이상 요소가 없다면 false를 반환
         *  - next() : 다음 요소를 반환
         * */
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();

//        int count = 0;
//        while (dIter.hasNext()) {
//            System.out.println(count + ":" + dIter.next());
//            count++;
//        }
        
        /* 설명. 한번 꺼낸 요소는 다시 사용할 수 없다. */
//        while (dIter.hasNext()) {
//            System.out.println(count + ":" + dIter.next());
//        }
        
        /* 설명. 역순으로 정렬된 결과를 저장하기 위해 새로운 ArrayList를 만들어 저장해두면 된다. */
        List<String> descList = new ArrayList<>();
        
        while(dIter.hasNext()) {
            descList.add(dIter.next());
        }

        System.out.println("descList = " + descList);
    }
}
