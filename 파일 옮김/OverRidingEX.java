class Shape { //슈퍼 클래스
    public Shape next;
    public Shape() { next = null; }
    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    @Override //컴파일러가 읽도록 하는 주석 = 어노테이션
    public void draw() { //메소드 오버라이딩
       // super.draw();
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}

public class OverRidingEX {
    static void paint(Shape p) {
        p.draw(); //p가 가리키는 객체 내에 오버라이딩된 draw() 호출
    } //동적 바인딩

    public static void main(String[] args) {
        Line line = new Line();
        paint(line);

        //위에 두 줄을 축약한 것
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Triangle());
    /*
    * 업캐스팅 = 서브 클래스 객체를 슈퍼 클래스 타입으로 타입 변환
    * 다운캐팅 = 슈퍼 클래스 객체를 서브 클래스 타입으로 변환
    * +개발자의 명시적 타입 변환 필요*/

        //Shpae p = new Line(); <- 이런식으로 선언가능

        //오버로딩(Overloading)은 기존에 없던 새로운 메서드를 정의하는 것이고,
        //오버라이딩(Overriding)은 상속 받은 메서드의 내용만 변경 하는 것.
    }
}