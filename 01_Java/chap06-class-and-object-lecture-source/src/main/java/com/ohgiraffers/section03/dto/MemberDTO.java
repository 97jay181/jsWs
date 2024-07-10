package com.ohgiraffers.section03.dto;

/* 설명. 취급하려고 하는 회원 정보를 고려해서 필드를 우선적으로 작성해본다.
 *  주로 화면(UI) 혹은 데이터베이스 테이블을 기준으로 한다.
 *  회원 번호, 회원명, 나이, 성별, 키, 몸무게, 회원탈퇴여부(활성화여부)를 관리할 것이다.
 *  값 객체(VO : Value Object)가 가지는 속성(필드)을 추출하는 과정 또는 추상화라고 볼 수 있다.
 *  DTO 클래스를 만들기 위해서는 모든 필드를 private로 만들어야 한다.
 * */
public class MemberDTO {

    private int no;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;

    /* 필기. 설정자(setter) 메소드 */
    public void setNo(int no) {
        this.no = no;
    }

    /* 필기. 접근자(getter) 메소드 */
    public int getNumber() {
        this.no = no;
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }
}
