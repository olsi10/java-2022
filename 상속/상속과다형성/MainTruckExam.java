package 상속.상속과다형성;
//메소드 오버라이딩
//상위 클래스에 있는 메소드와 하위 클래스에서 재정의하여 덮어쓰기
//상위 클래스와 같은 이름으로 하위 크래스에서 메소드의 기능을 바꾸는 것
//메소드 오버라이딩 된 경우 특별한 지시가 없는 한 하위 클래스 메소드 호출

class Car {
    String carName;
    String color;
    int velocity;

    void speedUp() {
        velocity += 5;
        System.out.println("속도 " + velocity + " 증가");
    }
    void speedDown() {
        velocity -= 5;
        System.out.println("속도 " + velocity + " 감소");
    }
}

class Truck extends Car {
    int ton = 5;

    void speedUp() {
        velocity += 10;
        System.out.println("속도 " + velocity + " 증가");
    }
}

public class MainTruckExam {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.speedUp();
        truck.speedDown(); // 하위클래스 메소드 호출

        //속도 10 증가
        //속도 5 감소
    }

}
