package 상속;
//상속과 생성자

class Car2 {
    //Car2(String name) //error 인자없는 생성자 필요
    //에러 수정 방법 디폴트 생성자 사용 () {} 하거나 하위 클래스에 super() 메소드로 명시적 호출
    Car2() { // 상위 클래스에 들어간 인자없는 생성자
        System.out.println("Car 생성자");
    }
}

class Truck2 extends Car2 {
    Truck2() {
    //super("SM3"); 하위 클래스에 super 메소드로 명시적 호출하는 방법    
        System.out.println("Truck 생성자");
    }

    public static void main(String[] args) {
        Truck2 truck = new Truck2();
    }
}
