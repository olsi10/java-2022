package 추상클래스;

//요기에 모든 도형은 둘레와 면적을 구할 수 있다고 할 대,학생들에게 특정 도형 클래스를 만들어 둘레와 면적을 반드시 구하게 하려 한다.
// 즉, 도형 클래스에 둘레와 면적을 구하는 메소드를 작성하지 않으면 에러가 발생하도록.
//이때, 반드시 작성해야 하는 메소드를 추상 클래스로 제공하면 된다. 도형의 둘레와 면적을 구하는 추상 클래스가 다음과 같을 때

public class ShapeExam {

    public abstract class ShapeExam1 {
        public abstract double getArea();
        public abstract double getCircum();

    }

    class getCircle extends ShapeExam {

    }
}
