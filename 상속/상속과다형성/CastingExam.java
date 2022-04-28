package 상속.상속과다형성;

class Car2 {
    String name = "차";
    String print() {
        return "[나는 " + name + "이다.]";
    }
}

class Bus extends Car2 {
    String name = "버스";
    String print() {
        return "[나는 " + name + "이다.]";
    }
}

class Truck2 extends Car2 {
    String name = "트럭";
    String print() {
        return "[나는 " + name + "이다.]";
    }
}

public class CastingExam {
    public static void main(String[] args) {
        Car2 mycar, yourcar;
        Bus mybus, yourbus;
        Truck2 mytruck,yourtruck;

        mycar = new Car2();
        mybus = new Bus();
        mytruck = new Truck2();

        System.out.println("[" + mycar.print() + "]");
        System.out.println("[" + mybus.print() + "]");
        System.out.println("[" + mytruck.print() + "]");

        yourcar = mybus;        //업캐스팅 = 슈퍼 클래스 객체 = 서브 클래스 객체
        yourbus = (Bus)yourcar; //다운캐스팅 = 서브 클래스 객체  = (클래스명)슈퍼 클래스 객체

        System.out.println("[" + yourbus.print() + "]");

        yourcar = mytruck;      //업캐스팅
        yourtruck = (Truck2)yourcar; //다운캐스팅

        System.out.println("[" + yourtruck.print() + "]");
    }
}
