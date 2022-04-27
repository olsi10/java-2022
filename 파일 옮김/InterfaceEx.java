interface PhoneInterface {
    final int TIMEOUT = 10000; //인터페이스에 상수 필드 선언
    void sendCall(); //인터페이스에서는 abstract 생략해도 추상 메소드로 인식
    void receiverCall(); //추상 메소드
    default void printLogo() { //default 메소드
        System.out.println("** Phone **");
    }
}

interface MobilePhoneInterface extends PhoneInterface {
    void sendSNS(); //추상 ㅁㅔ서드
    void receiveSNS(); //추상 메서드

}

interface  MP3interface {
    public void play();
    public void stop();
}

class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmatrPhone extends PDA implements MobilePhoneInterface, MP3interface {
    //MobilePhoneInterface 추상 메소드 구현

    @Override
    public void sendCall() {
        System.out.println("전화걸기");
    }

    @Override
    public void receiverCall() {
        System.out.println("전화받기");
    }

    @Override
    public void sendSNS() {
        System.out.println();
    }

    @Override
    public void receiveSNS() {

    }

    @Override
    public void play() {
        System.out.println("음악재생");
    }

    @Override
    public void stop() {
        System.out.println("재생중지");
    }
    
    //추가로 작성한 메소드
    public void schedule() {
        System.out.println("일정 관리");
    }
}

class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("빵빵또도도땅땅 따라라라라");

    }

    @Override
    public void receiverCall() {
        System.out.println("전화왓숑");
    }

    //삼성폰에만 있는 메서드
    public void flash() {
        System.out.println("후레시 켜짐");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo(); //인터페이스에 존재하는 디폴트 메서드
        phone.sendCall(); //삼성폰에서 재정의한 메서드
        phone.receiverCall(); //삼성폰에서 재정의한 메서드
        phone.flash(); //삼성폰에만 있는 메서드

        SmatrPhone sPhone = new SmatrPhone();
        sPhone.printLogo(); //인터페이스에 존재하는 디폴트 메서드
        sPhone.sendCall(); //삼성폰에서 재정의한 메서드
        sPhone.receiverCall(); //삼성폰에서 재정의한 메서드
        System.out.println("3과 5를 더하면 " + sPhone.calculate(3, 5));
        sPhone.schedule(); //SmartPhone에 존재하는 메소드
    }
}
