package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. ArrayList의 정렬 기능을 이용할 수 있다. */

        /* 설명. 여러권의 책을 목록으로 관리할 ArrayList 인스턴스 생성 */
        List<BookDTO> bookList = new ArrayList<>();

        /* 설명. 도서 정보 추가 */
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        /* 설명. 제네릭 타입 제한에 의해 Comparable 타입을 가지고 있는 경우에만 sort() 메소드 사용 가능.
         *  따라서 BookDTO의 경우 다른 방법을 사용해서 정렬해야 한다.
         * */
//        Collections.sort(bookList);

        System.out.println("======== Before sorting ================");

        for (BookDTO b : bookList) {
            System.out.println("b = " + b);
        }

        /* 설명. 가격 순으로 오름차순 정렬을 해볼 것이다.
         *  comparator 패키지를 추가, Comparator 인터페이스를 상속받은 클래스를 AscendingPrice를 하나 추가한다.
         * */

        /* 설명. Comparator 인터페이스를 구현해 정렬의 기준을 정해준뒤, List의 default 메소드인 sort() 메소드의
         *  인자로 정렬 기준이 되는 인스턴스를 넣어주게 되면 내부적으로 우리가 오버라이딩한 메소드가 동작하게 되며
         *  그것을 정렬 기준으로 삼는다.
         * */
        bookList.sort(new AscendingPrice());

        System.out.println("=========== after sorting (asc) ====================");

        for (BookDTO b : bookList) {
            System.out.println("b = " + b);
        }
        /* 설명.
         *  인터페이스를 구현한 클래스를 재사용 하는 경우 AscendingPrice 클래스 처럼 작성하면 되지만
         *  한 번만 사용하기 위해서는 조금 더 간편한 방법을 이용할 수 있다.
         *  익명클래스(Anonymous)를 이용해 역순 정렬(descending)을 구현할 수 있다.
         * */
        /* 설명. 인터페이스이기 때문에 바로 인스턴스 생성 불가능. */
//        bookList.sort(new Comparator<BookDTO>());

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO b1, BookDTO b2) {
                /* 설명. 내림차순 정렬이 되어 있어서 순서를 바꾸는 경우 양수, 바꾸지 않는 경우 음수를 반환 */
                return b1.getPrice() >= b2.getPrice() ? -1 : 1;
            }
        });

        System.out.println("=================== after sorting(desc) ==============================================");

        for (BookDTO b : bookList) {
            System.out.println("b = " + b);
        }

        /* 설명. 이번에는 제목(String) 순으로 오름차순 정렬해보자. */
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO b1, BookDTO b2) {
                /* 설명. 앞의 값이 더 작은 경우 음수를 반환, 같으면 0을 반환, 앞의 값이 더 큰 경우 양수를 반환 */
                return b1.getTitle().compareTo(b2.getTitle());
            }
        });
        System.out.println("=================== after sorting(asc) by title ==============================================");

        for (BookDTO b : bookList) {
            System.out.println("b = " + b);
        }

        /* 설명. 람다식을 활용해 제목을 내림차순 정렬 */
        bookList.sort((BookDTO b1, BookDTO b2) ->
            b2.getTitle().compareTo(b1.getTitle()));

            System.out.println("=================== after sorting(desc) by title ==============================================");

            for (BookDTO b : bookList) {
                System.out.println("b = " + b);
            }

            /* 설명.
             *  나머지 필드 정렬 기준은 추가적으로 연습 해보려면 해보자
             *  다음은 Vector의 경우 스레드 동기화처리가 된다는 점만 다르고 ArrayList와 동일하게 동작한다.
             *  JDK 1.0부터 사용하긴 했지만 하위 호환을 위해 남겨놓았고 성능 문제로 현재는 사옹하지 않는다.
             *  가급적이면 ArrayList를 이용하면 된다.
             * */
        }
    }