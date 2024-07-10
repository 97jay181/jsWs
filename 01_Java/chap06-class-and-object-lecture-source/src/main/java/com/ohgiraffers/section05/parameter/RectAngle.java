package com.ohgiraffers.section05.parameter;

public class RectAngle {

   /* 설명. Field Area : 사각형의 길이와 높이를 저장하는 속성(필드) */
   /* v*/

   private double width;

   private double height;

   /* 설명. Field Area : 사각형의 길이와 높이를 저장하는 속성(필드) */

   public RectAngle() {
   }

   public RectAngle(double width, double height) {
   }


   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public String getInfo() {
      return "RectAngle={"
              + "width=" + this.width
              + ", height=" + this.height
              + "}";
   }

   public void calcArea() {
      System.out.println("이 사각형의 넓이는 " + (width * height) + "입니다.");
   }

   public void calcRound() {
      System.out.println("이 사각형의 둘레는 " + ((width + height) * 2) + "입니다.");
   }

}
