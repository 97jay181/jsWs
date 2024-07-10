package com.ohgiraffers.section01.extend;

import org.w3c.dom.ls.LSOutput;

public class FireCar extends Car {

    public FireCar() {
        super();
        System.out.println("[FireCar] 기본 생성자 호출됨...");
    }

    @Override
    public void soundHorn() {

         /* 설명.
          *  주행중 상태인 것을 확인해야 한다.
          *  runningStatus는 private 필드이기에 해당 클래스에서 접근이 불가능하다.
          *  부모가 가지고 있는 public or protected 멤버인 isRunning() 메소드를 사용해야 주행중인 상태인지 확인할 수 있다.
          *  혹은. Car 클래스의 isRunning(필드)를 protected로 변경하면 사용 가능하지만, 권장되지는 않는다. (캡슐화 위배)
          *  this.isRunning() 혹은 super.isRunning 둘 다 사용 가능하며
          *  컴파일러는 기본적으로는 this.을 자동으로 추가한다.
          *  (super.을 명시적으로 사용해야 하는 상황도 존재한다.)
          */

        /* 접근 제어자의 접근범위를 넓은 것에서 좁은 것 순으로 나열하면 public > protected > (default) > private */






        if(isRunning()) {
            System.out.println("[FireCar.soundHorn] 빠앙~~! 빠앙~! ");
        } else {
            System.out.println("[FireCar.soundHorn] 소방차가 앞으로 갈 수 없습니다~ 길을 비켜주세요~~~");
        }

    }

    public void sprayWater() {
        System.out.println("[FireCar.sprayWater] 불난 곳을 발견했습니다! 물을 뿌립니다.");
    }

}
