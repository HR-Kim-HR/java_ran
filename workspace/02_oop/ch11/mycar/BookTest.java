package ch11.mycar;

// 하나의 소스코드(.java) 내에 여러 개의 클래스를 정의할 수 있음
// 단, public class는 하나에만 지정 가능하며, 파일명과 동일한 이름의 클래스에만 지정 가능 (=파일명과 똑같은 이름의 클래스 하나에만 public 을 붙일 수 있음)
class Book {
    String title;
    String author;

    // 생성자 작성
    Book(){
        this("제목미상","작가미상");       // 자신의 생성자 호출  // this 는 클래스 내에서만? 사용 가능
//        this.title = "제목미상";
//        this.author = "작가미상";
    }

    // 생성자 작성
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

}

public class BookTest {
    public static void main(){
        Book book1 = new Book();
//        book1.title = "자바 기초";
//        book1.author = "자바의 신";

        Book book2 = new Book("자바를 잡아라", "용쌤");

        System.out.println("제목: " + book1.title + ", 작가: " + book1.author);
        System.out.println("제목: " + book2.title + ", 작가: " + book2.author);
    }

}
