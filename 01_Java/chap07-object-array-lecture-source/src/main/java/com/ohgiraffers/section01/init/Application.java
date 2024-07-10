package com.ohgiraffers.section01.init;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 객체 배열에 대해 이해할 수 있다. */

        /* 필기.
         *  객체배열은 레퍼런스변수에 대한 배열이다.
         *  생성한 인스턴스도 배열을 이용해서 관리하면
         *  동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고 연속 처리할 수 있어서 유용하다.
         *  또한 반환값은 1개의 값만 반환할 수 있기 때문에
         *  동일한 타입의 여러 인스턴스를 반환해야 하는 경우 객체배열을 이용할 수 있다.
         * */

        /* 목차 1. 일일이 자동차 5대 인스턴스 생성 후 모든 인스턴스가 최고 속도로 달리게 한다 */
        Car c1 = new Car("페라리", 300);
        Car c2 = new Car("맥라렌", 700);
        Car c3 = new Car("람보르기니", 500);
        Car c4 = new Car("롤스로이스", 240);
        Car c5 = new Car("부가티", 760);

        c1.driveMaxSpeed();
        c2.driveMaxSpeed();
        c3.driveMaxSpeed();
        c4.driveMaxSpeed();
        c5.driveMaxSpeed();

        /* 목차 2. 객체 배열을 사용해 자동차 5대 인스턴스 생성 후 모든 인스턴스가 최고 속도로 달리게 한다. */
        Car[] carArray = new Car[5];

        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("맥라렌", 700);
        carArray[2] = new Car("람보르기니", 500);
        carArray[3] = new Car("롤스로이스", 240);
        carArray[4] = new Car("부가티", 760);

        for(int i = 0; i <= carArray.length - 1; i++) {
            carArray[i].driveMaxSpeed();
        }

        /* 목차 3. 객체 배열도 할당과 동시에 초기화할 수도 있다. */
        Car[] carArray2 = {
                new Car("페라리", 300)
                , new Car("맥라렌", 700)
                , new Car("람보르기니", 500)
                , new Car("롤스로이스", 240)
                , new Car("부가티", 760)

                };

        for(Car c : carArray2) {
            c.driveMaxSpeed();
        }


    }
}
