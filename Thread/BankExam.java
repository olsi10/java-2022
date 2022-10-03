package Thread;

class Bank {
    private int money = 10000;
    public int getM() {
        return this.money;
    } // 돈 리턴

    public void setM(int money) {
        this.money = money;
    } // 돈 세팅

    public void saveM(int save) {
        int m = this.getM();

        try {
            Thread.sleep(500); // 0.5 초간 정지 후 실행
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setM(m + save); // 기존 예금액 + 지금 입금한 금액
    } // saveMoney 종룐

    public void minusMoney(int minus) {
        int m = this.getM();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.setM((m - minus));
    } // minus 머니 닫음
} // 뱅크 닫음

class Family1 extends Thread { // 스레드상속 받아서 구현
    public void run() {
        // 부분 객체 동기화
        synchronized (BankExam.myBank) {
            BankExam.myBank.saveM(5000);
        }
        System.out.println("saveMoney(5000) : " + BankExam.myBank.getM());
    }
}

class Family2 extends Thread { // 스레드상속 받아서 구현
    public  void  run() {
        // 부분 객체 동기화
        synchronized (BankExam.myBank) {
            BankExam.myBank.minusMoney(5000);
        }
        System.out.println("minusMoney(5000) : " + BankExam.myBank.getM());
    }
}

public class BankExam {
    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        System.out.println("원금 : " + myBank.getM());
        Family1 f1 = new Family1(); // 스레드
        Family2 f2 = new Family2(); // 스레드

        f1.start(); // f1 스레드 시작

        try {
            Thread.sleep(200); // 0.2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        f2.start(); // f2 스레ㄷ 시작
    }
}

