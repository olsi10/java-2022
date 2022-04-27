package 상속;

class GrandFather {
    private String name;
    public GrandFather(String name) {
        this.name = name;
        System.out.println("GrandFather 생성자");
    }
}

public class MyClass extends GrandFather {
    public MyClass(String str) {
        //super 메소드
        //상위 클래스의 생성자를 명시적으로 호출할 때 사용하는 것으로 하위 클래스의 생성자에서 제일 먼저 호출
        super(str);
        //사용법
        //1. super()
        //2. super(인자, ...)
        System.out.println("MyClass 생성자");
    }

    public static void main(String[] args) {
        MyClass s = new MyClass("홍길동");
    }
}
