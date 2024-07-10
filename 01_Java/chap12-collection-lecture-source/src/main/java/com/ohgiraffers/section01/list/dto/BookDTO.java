package com.ohgiraffers.section01.list.dto;

public class BookDTO {

    int no;
    String title;
    String autor;
    int price;

    public BookDTO() {
    }

    public BookDTO(int no, String title, String autor, int price) {
        this.no = no;
        this.title = title;
        this.autor = autor;
        this.price = price;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", price=" + price +
                '}';
    }


}
