package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. Stack에 대해 이해하고 사용할 수 있다. */

        /* 필기.
         *  Stack
         *  Stack은 리스트 계열 클래스의 Vector 클래스를 상속받아 구현하였다.
         *  스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
         *  후입선출(LIFO - Last Input First Out)방식의 자료 구조라 불린다.
         * */

        /* 설명. Stack 인스턴스 생성 */
        Stack<Integer> integerStack = new Stack<>();

        /* 설명. push() : Stack에 값을 넣을 때는 push 메소드를 사용한다.*/
        integerStack.push(11);
        integerStack.push(22);
        integerStack.push(33);
        integerStack.push(44);
        integerStack.push(55);
        
        /* 설명. add() : add 메소드를 사용할 수 있찌만, 이는 Vector 클래스의 add이므로 가급적 push를 사용한다. */
        integerStack.add(66);

        /* 설명. Stack에는 toString()이 오버라이딩 되어있다. */
        System.out.println("integerStack = " + integerStack);

        System.out.println("integerStack.size() = " + integerStack.size());

        /* 설명. search() : Stack에서 특정 요소값을 찾을 때 사용.  
         *   단, Stack의 가장 위(top)부터의 순번을 나타내며 시작순서는 0이 아닌 1임에 주의한다.   
         * */
        System.out.println("integerStack.search(5) = " + integerStack.search(44));

        /* 설명. Stack 구조에서 값을 꺼내는 메소드는 크게 2가지다.
         *  peek() : 해당 Stack의 가장 위(top)에 있는 요소를 반환
         *  pop() : 해당 Stack의 가장 위(top)에 있는 요소를 반환한 후 '제거'
         * */
        System.out.println("integerStack.peek() = " + integerStack.peek());
        System.out.println("integerStack.peek() = " + integerStack.peek());
        System.out.println("integerStack.peek() = " + integerStack.peek());
        System.out.println("[after peek()...] integerStack = " + integerStack);

        System.out.println("============================================================");
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
        System.out.println("integerStack.pop() = " + integerStack.pop());
//        System.out.println("integerStack.pop() = " + integerStack.pop());      // java.util.EmptyStackException 발생
        System.out.println("[after pop()....] integerStack = " + integerStack);
    }
}
