package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;             // CPU명

    private int hdd;                // HDD 용량
    private int ram;                // Ram 용량
    private String operatingSystem; // 운영체제

    public Computer() {
        System.out.println("[Computer] 기본 생성자 호출됨....");
    }

    public Computer(String cpu, int hdd, int ram, String operatingSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    /* 설명. 부모의 필드도 모두 초기화하는 생성자 */

    public Computer(String code, String brand, String name, int price, Date manufacturedDate,
                    String cpu, int hdd, int ram, String operatingSystem) {

        /* 설명. 부모의 모든 필드를 초기화하는 생성자로 Product 클래스가 가진 필드를 초기화할 값을 전달. */
        super(code, brand, name, price, manufacturedDate);
        System.out.println("[Computer] 부모의 매개변수 있는 생성자 호출됨...");

//        this(cpu, hdd, ram, operatingSystem);     // 에러 : super()를 두번 호출하는 것과 같기 때문.

        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        System.out.println("[Computer] 나의 매개변수 있는 생성자 호출됨....");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /* 설명. Product 클래스에 작성한 getInformation()을 오버라이딩하여 작성 */
    @Override
    public String getInformation() {

        /* 설명. 부모 클래스에 작성한 getter 메소드를 호출해 부모의 필드변수에 접근한다.
         *  부모가 가진 멤버는 super.과 this. 둘다 사용이 가능하다.
         *  하지만 코드의 의미를 명확하게 하기 위해 super.를 사용하는 것이 좋다.
         * */
//        return "Computer["
//                + "code=" + super.getCode()
//                + ", brand=" + super.getBrand()
//                + ", name=" + super.getBrand()
//                + ", price=" + super.getPrice()
//                + ", manufacturingDate=" + super.getManufacturedDate()
//                + ", cpu=" + this.cpu
//                + ", hdd=" + this.hdd
//                + ", ram=" + this.ram
//                + ", operationSystem=" + this.operatingSystem
//                + "]";

        /* 설명. Computer에 있는 getInformation()에서 이미 작성해둔 필드를 문자열로 반환하는 내용이 존재한다.
         *  오버라이딩을 하지만, 부모클래스에 작성한 메소드를 호출해서 반환받은 문자열에
         *  현재 클래스의 필드값을 추가로 덧붙여 반환해보자.
         * =========================================================================================================
         *  super.getInformation() : 정상적으로 부모의 메소드 호출
         *  this.getInformation() : 재귀 호출이 일어나며 stackOverflow 발생
         *  getInformation() : 'this.'이 자동으로 추가되어 재귀 호출 발생
         *  따라서, 이 경우 'super.'을 사용해 명시적으로 호출해줘야 한다.
         * */
        return super.getInformation() + " " +
                "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';


//        return "Computer{" +
//                "cpu='" + cpu + '\'' +
//                ", hdd=" + hdd +
//                ", ram=" + ram +
//                ", operatingSystem='" + operatingSystem + '\'' +
//                '}';
    }
}
