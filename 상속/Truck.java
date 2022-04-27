package 상속;
//상속과 생성자

class Car2 {
    Car2() {
        System.out.println("Car 생성자");
    }
}

class Truck2 extends Car2 {
    Truck2() {
        System.out.println("Truck 생성자");
    }

    public static void main(String[] args) {
        Truck2 truck = new Truck2();
    }
}
