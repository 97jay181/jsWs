package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. FileWriter를 이해하고 사용할 수 있다. */

        FileWriter fw = null;

        try {

            /* 설명. 아래는 매개변수가 1개짜리인 새엇ㅇ자를 호출했다. 하지만 매개변수가 2개인 생성자도 존재한다.
             *  두번쨰 전달인자로 true(boolean)를 전달하면 이어쓰기를 가능하게 해주며,
             * 기본값인 false는 덮어쓰기를 수행한다.
             *  */
            fw = new FileWriter("src/main/com/ohgiraffers/section02/stream/testWriter.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);


        }
    }
}
