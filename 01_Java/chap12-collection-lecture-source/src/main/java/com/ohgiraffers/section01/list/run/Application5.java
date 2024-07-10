package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {

    public static void main(String[] args) {

        /*  수업목표. Queue에 대해 이해하고 사용할 수 있다.  */

        /* 필기.
         *  Queue
         *  Queue는 선형 메모리 공간에 데이터를 저장하는
         *  선입선출(FIFO - First Input First Out)방식의 자료구조이다.
         *  Queue 인터페이스를 상속받는 하위 인터페이스들은
         *  Deque, BlockingQueue, BlockingDeque, TransferQueue등 다양하지만
         *  대부분의 큐는 LinkedList를 이용한다.
         * */

        /* 설명. Queue 자체는 인터페이스이기 때문에 인스턴스를 생성할 수 없다. */
//        Queue<String> que = new Queue<>();

        /* 설명. Queue의 자식 인터페이스인 Deque를 구현한 LinkedList를 사용해 인스턴스 생성 */
        Queue<String> que = new LinkedList<>();
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        /* 설명. Queue에는 toString()이 오버라이딩 되어있다. */
        System.out.println("que = " + que);
        System.out.println("que.size() = " + que.size());
//        que.clear();
//        System.out.println("que.size() = " + que.size());

        /* 설명. Queue에서 데이터를 꺼낼 때 두가지 메소드를 사용할 수 있다.
         *  peek() : 해당 큐의 가장 앞(front)에 있는 요소를 반환.
         *  poll() : 해당 큐의 가장 앞(front)에 있는 요소를 반환한 후 제거.
         * */
        System.out.println("que.peek() = " + que.peek());
        System.out.println("que.peek() = " + que.peek());
        System.out.println("que.peek() = " + que.peek());
        System.out.println("que = " + que);
        System.out.println("===================================================");
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que.poll() = " + que.poll());
        System.out.println("que = " + que);

    }
}
