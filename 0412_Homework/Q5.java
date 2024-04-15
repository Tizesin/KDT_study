import java.util.Scanner;

public class Q5 {
//        **목표:**
//        객체 지향 프로그래밍의 기본인 클래스와 객체의 개념을 이해하고, 클래스를 정의하고 사용하는 방법을 실습한다.
//
//        **과제:**
//        - Person 클래스를 생성하고, 이름(name)과 나이(age)를 필드로 가지게 하세요. 해당 클래스에는 이름과 나이를 설정할 수 있는 생성자와, 이를 출력할 수 있는 메서드를 포함하세요.
//        - Book 클래스를 만들고, 제목(title), 저자(author), 가격(price)을 필드로 정의하세요. 모든 필드를 초기화하는 생성자와, 필드 값을 출력하는 메서드를 포함하세요.
//        - Person 객체를 두 개 생성하고, 각 객체에 대한 정보를 출력하세요. 이어서 Book 객체를 생성하고, 그 정보를 출력하세요.
        public static void main(String[] args) {

            Person user1 = new Person("minjun",27);
            Person user2 = new Person("sumyeong",26);
            Book book_info1 = new Book("JAVA","jungmin",10000);

            user1.print();
            user2.print();
            book_info1.print();

        }
}
class Person{
    public String name;
    public int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void print()
    {
        System.out.println("이름 : "+this.name);
        System.out.println("나이 : "+this.age);
    }
}

class Book{
    public String title, author;
    public int price;

    public Book(String title,String author , int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void print()
    {
        System.out.println("제목 : "+this.title);
        System.out.println("저자 : "+this.author);
        System.out.println("가격 : "+this.price);
    }
}
