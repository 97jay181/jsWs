package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. FileOutputStream을 이해하고 사용할 수 있다. */

        /* 필기. FileOutputStream :
         *  프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
         *  1바이트 단위로 데이터를 처리한다.
         * */

        FileOutputStream fout = null;

        try {
            fout = new FileOutputStream("01_Java/chap14-io-lecture-source/src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");

            fout.write(97);

            byte[] byteArr = new byte[] {98, 99, 100, 101, 102};

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
