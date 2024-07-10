package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. LinkedList에 대해 이해하고 사용할 수 있다. */


        /* 필기.
         *  LinkedList
         *  ArrayList가 배열을 이용해서 발생할 수 있는 성능적인 단점을 보완하고자 고안되었다.
         *  내부는 이중 연결리스트로 구현되어 있다.
         *
         * 필기.
         *  단일 연결 리스트
         *  : 저장한 요소가 순서를 유지하지 않고 저장되지만 이러한 요소들 사이를 링크로 연결하여 구성하며
         *    마치 연결된 리스트 형태인 것 처럼 만든 자료구조이다.
         *    요소의 저장과 삭제 시 다음 요소를 가리키는 참조 링크만 변경하면 되기 때문에
         *    요소의 저장과 삭제가 빈번히 일어나는 경우 ArrayList보다 성능면에서 우수하다.
         *   하지만 단일 연결 리스트는 다음 요소만 링크하기 때문에 이전 요소로 접근하기가 어렵다.
         *   이를 보완하고자 만든 것이 이중 연결 리스트이다.
         *
         * 필기.
         *  이중 연결 리스트
         *  : 단일 연결 리스트는 다음 요소만 링크하는 반면 이중 연결 리스트는 이전 요소도 링크하여
         *    이전 요소로 접근하기 쉽게 고안된 자료구조 이다.
         *
         * 필기.
         *  LinkedList는 이중 연결 리스트를 구현한 것이며 역시 List 인터페이스를 상속받아서
         *  ArrayList와 사용하는 방법이 거의 유사하다.
         *  하지만 내부적으로 요소를 저장하는 방법에 차이가 있는 것이다.
         *  각 컬렉션 프레임워크 클래스들의 특징을 파악하고 그에 따라 적합한 자료구조를 구현한 클래스를 선택하는것이 좋다.
         * */

        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("carrot");
        linkedList.add("mango");
        linkedList.add("grape");

        /* 설명. size() : 저장된 요소의 개수(실제 사이즈 아님) */
        System.out.println("linkedList.size() = " + linkedList.size());
        System.out.println("===============================================");

        // 정통 for문
        /* 설명. get() : 인덱스를 사용하여 저장된 요소를 반환 */
        for(int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " : " + linkedList.get(i));
        }

        System.out.println("===============================================");
        // 향상된 for문 -> 인덱스 i를 못씀 , 대신에 Iterable 객체 돌릴수 있음
        for(String e : linkedList) {
            System.out.println("e = " + e);
        }

        System.out.println("===============================================");

        /* */
        /* 설명. remove() : 특정 인덱스이 요소를 삭제 */
        linkedList.remove(1);

        for(String e : linkedList) {
            System.out.println("e = " + e);
        }
        System.out.println("===============================================");

        /* 설명. set() : 특정 인덱스이 요소값을 수정 */
        linkedList.set(0,"pineApple");

        for(String e : linkedList) {
            System.out.println("e = " + e);
        }
        System.out.println("===============================================");

        /* 설명. LinkedList에는 toString()이 오버라이딩 되어있음 */
        System.out.println("linkedList = " + linkedList);

        /* 설명. isEmpty() : 해당 List가 비어있는지를 확인 */
        System.out.println("linkedList.isEmpty() = " + linkedList.isEmpty());

        /* 설명. clear() : 해당 List내 모든 요소를 제거 */
        linkedList.clear();
        System.out.println("linkedList.isEmpty() = " + linkedList.isEmpty());

    }
}
