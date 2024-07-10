package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Product {

    private String code;
    private String brand;
    private String name;
    private int price;
    private Date manufacturedDate;

    public Product() {
        System.out.println("[Product] 기본 생성자 호출됨...");
    }

    public Product(String code, String brand, String name, int price, Date manufacturedDate) {
        System.out.println("[Product] 매개변수 생성자 호출됨...");
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturedDate = manufacturedDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public String getInformation() {
        return "Product{" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturedDate=" + manufacturedDate +
                '}';
    }
}
