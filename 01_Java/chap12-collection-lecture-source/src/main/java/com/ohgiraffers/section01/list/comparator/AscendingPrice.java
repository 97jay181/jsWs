package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

/* 설명. 제네릭 타입을 BookDTO로 하여 Comparator 인터페이스를 구현한다. */
public class AscendingPrice implements Comparator<BookDTO> {

    /* 설명. Comparator 인터페이스를 상속받으면 오버라이딩 해야하는 추상 메소드가 강제화된다. */
    @Override
    public int compare(BookDTO b1, BookDTO b2) {

        /* 설명. sort()에서 내부적으로 사용하는 메소드다.
         *  인터페이스를 상속받아 메소드 오버라이딩을 강제해 놓았다.
         *  ===============================================================================================
         *  비교 대상이 두 인스턴스의 가격이 오름차순 정렬이 되기 위해서는 앞의 가격이 더 적은 가격이어야 한다,
         *  만약, 뒤의 가격이 더 적은 경우에는 두 인스턴스의 순서를 바꿔야 한다.
         *  그 때, 두 값을 바꾸라는 신호로 양수를 보내주게 되면 정렬 시 순서를 바꾸는 조건으로 사용된다.
         *  1 : 오름차순을 위해 순서를 바꿔야 하는 경우 양수를 반환
         *  -1 : 이미 오름차순 정렬로 되어 잇는 경우 음수를 반환
         *  0 :  두 값이 같은 경우 0을 반환
         * */

        int result = 0;
        if (b1.getPrice() > b2.getPrice()) {
            result = 1;
        } else if (b1.getPrice() < b2.getPrice()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }


}
