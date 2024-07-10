package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /* 필기. 생성자의 작성위치 :
     *  문법상으로는 클래스 내부에 작성하기만 하면 된다.
     * 하지만 통상적으로 필드 선언부와 메소드 선언부 중간에 위치하는것이 판례다.
     * */

    /* 필기. 생성자의 사용 목적 :
     *  1. 인스턴스 생성 시점에 '특별히' 수행할 명령이 있는 경우.
     *  2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적.
     *  3. 작성한 생성자 외에는 인스턴스를 생성하는 방법(수단)을 제한하기 위한 용도 -> 초기값 전달을 '문법적으로' 강제화
     *      (따라서 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수도 있다.)  */

    /* 목차. 기본생성자(default constructor) */

    public User() {
        System.out.println("User 클래스의 기본생성자 호출됨...");
    }

    public User(String id, Date enrollDate) {
        this.id = id;
        this.enrollDate = enrollDate;
    }

//    public User() {} // 동일한 이름의 생성자, 또는 메소드를 한 클래스 내부에서 작성 불가능함(Compile Error)

    public User(String id, String pwd, String name, Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

    /* 목차4. 복사 생성자
     *  이미 만들어진 동일한 타입의 인스턴스가 가지는 필드값을 이용해서 새로운 인스턴스 생성시 초기화값으로 사용가능.
     *  동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 떄문에 서로 다른 주소값을 가지게 된다. (깊은복사)
     * */
    public User(User otherUser) {
        /* 필기. 기존에 작성된 생성자를 호출하여 초기화 -> this() 사용 */
        this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
//        this(otherUser.id, otherUser.enrollDate);
        System.out.println("User 클래스의 복사 생성자 호출됨...");

        /* 필기. 모든 필드에 직접 접근하여 초기화 -> this() 사용 */
//        this.id = otherUser.id;
//        this.pwd = otherUser.pwd;
//        this.name = otherUser.name;
//        this.enrollDate = otherUser.enrollDate;


        /* 설명. this의 주소와 otherUser의 주소를 비교 */
        System.out.println("this.hashCode() = " + this.hashCode());
        System.out.println("otherUser.hashCode() = " + otherUser.hashCode());
    }
    public String getInformation() {
        System.out.println("User 클래스의 모든 매개변수를 초기화 하는 매개변수 있는 생성자 호출됨...");
        return "User [id=" + this.id
                + ", pwd=" + this.pwd
                + ", name=" + this.name
                + ", enrollDate=" + this.enrollDate
                + "]";

    }



}
