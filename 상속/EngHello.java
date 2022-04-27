package 상속;

class Greeting {
    public String name = "홍길동";
    public void sayHello() {
        System.out.print("씨 안녕하세요.");
    }
}

public class EngHello extends Greeting {
    public String name = "Mr.hong";
    public void sayHello() {
        System.out.println(name + " Nice to meet you");
    }
    public void test() {
        System.out.println(super.name);
        //super 키워드
        //상위 클래스를 참조할 수 있는 가상의 참조변수로 상위 클래스의 멤버 변수나 메소드를 하위 클래스에서 명시적 호출할 때 사용
        super.sayHello();
    }

    public static void main(String[] args) {
        EngHello eng = new EngHello();
        eng.sayHello();
        eng.test();
    }
}
