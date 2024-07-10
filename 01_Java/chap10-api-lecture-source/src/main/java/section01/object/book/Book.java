package section01.object.book;

import java.util.Objects;

public class Book {

    int number;
    String title;
    String author;
    int price;

    public Book() {
    }

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /* 목차 1. Object.toString() 오버라이딩 */

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    /* 목차 2. Object.equals() 오버라이딩 */

//    @Override
//    public boolean equals(Object o) {
//
//        /* 목차 2-1. 필드 비교 전 */
//        /* 목차 2-1-1. 동일 객체 판단 */
//        /* 설명. 가장 먼저 두 인스턴스의 주소가 같다면 아래 조건들을 판단할 필요도 없이 동일한 객체다.(true) */
//        if(this == o) {
//            return true;
//        }
//
//        /* 목차 2-1-2. null 객체 판단 */
//        /* 설명. 비교 대상 객체가 null이라는 의미는 존재하지도 않는 객체다.(false) */
//        if (o == null) {
//            return false;
//        }
//
//        /* 목차 2-2. 필드 비교 시작 */
//        /* 설명. 전달인자 o를 Book 타입으로 형변환하여 각 필드의 비교를 시작한다. */
//        Book otherBook = (Book) o;
//
//        /* 목차 2-2-1. 첫 번째 필드인 int number(Primary type) 필드 값 비교 */
//        /* 설명. number 필드의 값 비교 -> 서로 다른 경우 두 인스턴스는 다른 인스턴스다. (false) */
//        if(this.number != otherBook.number) {
//            return false;
//        }
//
//        /* 목차 2-2-2. 두 번째 필드인 String title(Reference type) 필드 값 비교 */
//        /* 설명. title 필드의 값이 null인 경우, 전달인자의 title 필드도 null인지 비교해보고 판단해야함.
//         *  만약 자신과 전달인자의 title이 모두 nulldlfkaus, 어쨌든 null이란 동일한 값을 가진 것이니 같다고 판단해야함.(true)
//         *  그렇지 않은 경우, 즉, 둘 중 하나가 nulldlrh 다른 하나가 어떤 값을 가지고 있다면 다르다고 판단해야함.(false)   */
//        if(this.title == null) {
//            if(otherBook.title != null) {
//                return false;
//            }
//        } else if (this.title.equals(otherBook.title)) {
//            /* 설명. 여기서의 equals()는 Object의 equals()가 아닌, String의 equals()가 호출된다.
//             *  왜냐하면 이미 String 클래스는 Object의 equals()를 오버라이딩하여 재정의가 완료되었기 떄문이다.
//             *  따라서, 여기서의 String.equals()는 같은 값을 가지고 있는지 동등 비교를 한다.
//             * */
//
//            /* 설명. title 필드가 null이 아니면서, 비교중인 두 인스턴스의 title 필드값이 다른 경우. (false) */
//            return false;
//        }
//
//        /* 목차 2-2-3. 세 번째 필드인 String author(Reference type) 필드 값 비교 */
//        if(this.author == null) {
//            if (otherBook.author != null) {
//                return false;
//            }
//        } else if(!this.author.equals(otherBook.author)) {
//            return false;
//        }
//
//        /* 목차 2-2-4. 네 번째 필드인 int price(Primary type) 필드 값 비교 */
//        if(this.price != otherBook.price) {
//            return  false;
//        }
//
//        /* 목차 2-3. 위의 모든 조건을 통과하면 두 인스턴스는 같은 값을 가진 동등한 객체라고 판단.(true) */
//        return true;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    /* 목차 3. Object.hashCode() 오버라이딩*/
    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }
}
