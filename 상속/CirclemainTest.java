package 상속;
//에러 발생하는 이유 찾기
class CircleArea_Exam {
    //private double area(int r) { priavte는 상속관계에서 하위 크래스 접근 불가하다.
    protected double area(int r) {
        return 3.14 * r * r;
    }

    protected double round(int r){
        return 2 * 3.14 * r;
    }
}

class CirclemainTest extends CircleArea_Exam {
    public static void main(String[] args) {
        CircleArea_Exam cp = new CircleArea_Exam();
        System.out.println("원의 면적은" + cp.area(10));
        System.out.println("원의 둘레는" + cp.round(10));
    }
}
