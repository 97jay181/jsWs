package com.ohgiraffers.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. File 클래스의 사용 방법을 이해할 수 있다. */

        /* 설명. File 클래스를 이용해 인스턴스를 생성한다.
         *  (대상 파일이 존재하지 않아도 인스턴스를 생성할 수 있음) */
        File file = new File("src/main/java/com/ohgiraffers/section01/file/myNote.txt");

        try {
            /* 설명. 파일 생성 후, 성공 실패 여부를 boolean으로 반환. */
            boolean createSuccess = file.createNewFile();

            /* 설명. 최초로 실행했을 때는 실제로 파일이 생성되기 때문에 true를 반환하지만,
             *  한 번 파일이 생성되고 나면 새로 파일을 만들지 않기 때문에 false를 반환.
             * */
            System.out.println("createSuccess = " + createSuccess);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("file.length() = " + file.length());                     // 파일의 크기
        System.out.println("file.getPath() = " + file.getPath());                   // 파일의 경로(상대경로)
        System.out.println("file.getParent() = " + file.getParent());               // 현재 파일의 상위 경로
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());   // 파일의 절대 경로

        /* 설명. 파일 삭제 -> 삭제 후 성공 여부를 boolean으로 반환. */
        boolean deleteSuccess = file.delete();
        System.out.println("deleteSuccess = " + deleteSuccess);
        deleteSuccess = file.delete();
        System.out.println("deleteSuccess = " + deleteSuccess);
    }
}
