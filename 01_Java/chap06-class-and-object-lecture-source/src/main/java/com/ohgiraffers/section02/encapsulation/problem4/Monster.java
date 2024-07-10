package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

    /* 필기. 접근제한자(Access Controller, Access Modifier)란?
     *  클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드(예약어)이다.
     * ----------------------------------------------------------------------------------------------------
     *  1. public : 모든 패키지에서 접근 허용
     *  2. protected : 동일 패키지에 접근 허용. (단, 상속관계에 있는 경우 다른 패키지에서 접근 허용)
     *  3. default : 동일 패키지에서만 접근 허용. (접근제한자를 작성하지 않는다면 default로 선언됨)
     *  4. private : 해당 클래스 내부에서만 접근 허용.
     * ----------------------------------------------------------------------------------------------------
     *  위의 네 가지 접근제한자는 클래스의 멤버(필드, 메소드)에 모두 사용할 수 있다.
     *  단, 클래스에 선언할 경우, 사용가능한 접근제한자는 public과 default로 제한된다.
     *  */

    private String kinds;
    private int hp;

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public int getHp() {
        return hp;
    }

    public String getInfo() {
//        System.out.println("일 안함?");
        return "몬스터의 종류는 : " + this.kinds
                  + "이고, 체력은 " + this.hp
                  + "입니다. ";
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
