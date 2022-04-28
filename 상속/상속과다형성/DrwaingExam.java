package 상속.상속과다형성;

class Shape {
    void draw() {
        System.out.println("도형 그리기");
    }
}

class Circle extends Shape {
    private String type = "원";
    public void draw() {
        System.out.println(type + " 그리기");
    }
    public void painting() {
        System.out.println("색 칠하기");
    }
}

public class DrwaingExam {
    public static void main(String[] args) {
        Circle c = new Circle();
        //c는 Circle형 객체 변수이므로 Circle 클래스의 draw() 메소드와 painting() 메소드에 접근
        c.draw();
        c.painting();

        Shape s = new Shape();
        s.draw();
        //s.painting(); 접근 불가능
        //s는 Shape형 객체 변수이므로 draw() 메소므나 호출 가능, Circle 클래스가 갖고 있는 메소드와 painting에는 접근 불가

        Shape s = c; //업 캐스팅 = 슈퍼 클래스 객체 = 서브 클래스 객체
        s.draw();
        //s.painting(); 접근 불가능

        //Circle 클래스는 Shape 클래스 상속받고 Shape형 객체 변수 s는 Circle형 객체 변수 c를 업캐스팅
        //상속 관꼐에 있을 때 상위 클래스의 객체 변수는 하위 클래스의 재정의된 메소드에는 접근 가능하지만
        //그렇지 않은 메소드는 접근 불가하다.
        //따라서 객체 변수 s는 painting 메소드에 접근 불가.
        //접근 불가능으로 에러 발생시키는 s.painting(); 명령의 실행결과로 "색 칠하기"를 출력하려면
        //Shape 클래스에 painting 메소드를 정의해주면 가능하다

    }
}
