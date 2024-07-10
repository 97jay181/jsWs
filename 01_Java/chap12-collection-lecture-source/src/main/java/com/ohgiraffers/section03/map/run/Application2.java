package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. Properties에 대해 이해하고 사용할 수 있다. */

        /* 필기.
         *  Properties란?
         *  HashMap을 구현하여 사용 용법이 거의 유사하지만 key와 value 모두 문자열만 사용할 수 있는 자료구조이다.
         *  설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
         * */

        Properties props = new Properties();

        props.setProperty("driver", "mysql.jdbc.driver.MYSQLDriver");
        props.setProperty("url", "jdbc:mysql://localhost:3306");
        props.setProperty("username", "admin");
        props.setProperty("password", "system1234");

        System.out.println("props = " + props);

        try {
            props.store(new FileOutputStream("driver.dat"), "jdbc driver");
            props.store(new FileWriter("driver.txt"), "jdbc driver");
            props.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");

        } catch (IOException e) {
            e.printStackTrace();
        }

        /* 설명. 파일로부터 읽어와서 Properties 객체에 기록해보기 */

        Properties props2 = new Properties();

        try {
            props2.load(new FileInputStream("driver.dat"));
            props2.load(new FileReader("driver.txt"));
            props2.loadFromXML(new FileInputStream("driver.xml"));

            /* 설명. Properties의 모든 키-값 목록을 대상 스트림에 내보내기. */
            props2.list(System.out);

            System.out.println("props2.getProperty(\"driver\") = " + props2.getProperty("driver"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}