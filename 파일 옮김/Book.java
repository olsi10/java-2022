public class Book {
    String title;
    String author;

    void show() {
        System.out.println(title + " " + author);
    }

    public Book() {
        this("","");
        //3번째 생성자를 호출함.
        System.out.println("생성자 호출됨");
    }

    public Book(String title) { //춘향전 들어옴
            this(title, "작자미상");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book LittlePrince = new Book("어린왕자", "생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book empty = new Book();
        //기본 default 생성자 (자동생성됨)

        //show를 하지 않아도 default 생성자에서 출력 먼저 하기 때문에 생성자 호출됨이 나옴
        LittlePrince.show();
        loveStory.show();
        empty.show();


    }
}
