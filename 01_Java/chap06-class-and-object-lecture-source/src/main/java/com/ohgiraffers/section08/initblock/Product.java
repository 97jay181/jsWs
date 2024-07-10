package com.ohgiraffers.section08.initblock;

public class Product {

    /* 목차 1. 필드를 초기화하지 않으면 JVM이 알고있는 기본값으로 객체가 생성된다. */
//    private String name;
//    private int price;
//    private static String brand;

    /* 목차 2. 명시적 초기화(explicit initialization) */
    private String name = "갤럭시";
    private int price = 1800000;
    private static String brand = "SAMSONG";

    /* 목차 3. 인스턴스 초기화 블럭 */
    /* 설명. 주의사항!
     *  인스턴스 초기화 블럭에서는 static 필드를 초기화할 수 있는 것처럼 보인다.
     *  하지만 static 초기화 블럭은 클래스가 로드될 때 이미 기본값으로 초기화가 된 상태다.
     *  따라서 인스턴스 쵝화 블럭이 동작하는 시점에는 이미 초기화가 진행된 정적 필드에
     *  인스턴스 초기화 블럭에서 대잆한 값으로 덮어쓰게 되는 것이다.
     * */

    {
        System.out.println("인스턴스 초기화 블럭 동작...");

        name = "애니콜";
        price = 600000;
        brand = "사과";
    }

    /* 목차 4. 정적 초기화 블럭 */
    /* 설명. 주의사항!
     *  static 쵝화 블럭에서는 non-static 필드를 초기화할 수 없다.
     *  정적 초기화 블럭은 클래스 도르시에 동작한다.
     *  따라서 정적 초기화 블럭의 동작 시점에는 인스턴스가 아무것도 존재할 수 없기 떄문에
     *  존재하지 않는 인스턴스 변수에 초기화하는 행위 자체가 말이 안된다.   (어불성설)
     * */
    static {
        System.out.println("정적 초기화 블럭 동작...");
//        name = "아이언";
//        price = 990000;
        brand = "엘 어쩌고";
    }

    /* 설명. 기본 생성자 */
    public Product() {
        System.out.println("기본생성자 호출됨...");
    }

    /* 설명. 매개변수 있는 생성자 */
    public Product(String name, int price, String brand) {
        System.out.println("매개변수 있는 생성자 호출됨...");
        this.name = name;
        this.price = price;
        Product.brand = brand;
    }

    public String getInformation() {
        return "Product {name=" + this.name
                + ", price=" + this.price
                + ", brand=" + Product.brand
                + "}";
    }
}
