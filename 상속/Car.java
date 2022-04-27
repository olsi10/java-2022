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
    //톤 멤버 변수 추가
    int ton;
}

//Car 클래스를 상속하여 3톤의 무게를 실을 수 있는 검정색 프론티어 트럭을 만들고자 한다.
//Truckmain 클래스를 실행하면 "나의 트럭은 검정색이다.", "프론티어는 3톤을 실을 수 있다." 출력하기

    class Truckmnain {
        public static void main(String[] args) {

            Truck truck = new Truck();

            truck.carName = "프론티어";
            truck.ton = 3;

            System.out.println("나의 트럭은 " + truck.color + "이다.");
            System.out.println(truck.carName + "은 " + truck.ton +"톤 실을 수 있다.");

        }
    }