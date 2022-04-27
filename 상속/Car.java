package 상속;
//Car를 상속받는 Truck 기술
public class Car {
    String carName;
    String color = "검정색";
    int velocity;
    
    void speedUp() {
        velocity += 5;
    }
    void speedDown() {
        velocity -= 5;
    }
}

class Truck extends Car {
    //멤버 변수나 메소드 정의
}
