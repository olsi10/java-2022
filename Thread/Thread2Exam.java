package Thread;

class DerivedThread extends Thread {
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class Thread2Exam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        DerivedThread d1 = new DerivedThread();
        DerivedThread d2 = new DerivedThread();
        d1.start();
        d2.start();
        System.out.println("프로그램 종료");
    }
}

// 출력 결과가 다르게 나오는 이유는 JVM 스케쥴러가 스레드의 실행 시간과 순서를 관리하기 때문이다.