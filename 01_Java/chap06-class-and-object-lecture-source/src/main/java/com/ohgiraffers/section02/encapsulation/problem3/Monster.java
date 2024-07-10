package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

//    String name;
//    int hp;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setHp(int hp) {
//        if(hp > 0) this.hp = hp;
//            else this.hp = 0;
//        }
//
//        public String getInfo() {
//        return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
//        }
    /* ------------------------------------------------------------------------------------------------ */
    /* 목차2. name 필드를 kinds로 변경한다. */
    /* 설명.
     *  필드를 kinds로 변경하게 되면 setName() 메소드와 getInfo() 메소드만 변경해주면 된다.
     *  즉, 사용자(클라이언트)의 호출 코드는 변경하지 않고 그대로 두어도 된다.
     * */
    String kinds;
    int hp;

    public void setName(String name) { this.kinds = name; }

    public void setHp(int hp) {
        if(hp > 0) this.hp = hp;
        else this.hp = 0;
    }

    public String getInfo() {
        return "몬스터의 종류는 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";
    }

    }

