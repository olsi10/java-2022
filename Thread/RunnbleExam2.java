package Thread;

class Top4 implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print(i + " \t");
        }
    }
}

public class RunnbleExam2 {
    public static void main(String[] args) {

        System.out.println("프로그램 시작");

        // Runnable을 구현하는 객체 (extends Thread 시 사용하는 객체 생성 문법)
        Top4 t4 = new Top4();

        // Runnable을 장착한 후 진짜 스레드 만들기
        Thread thr4 = new Thread(t4);
        Thread thr5 = new Thread(t4);

        // 스레드 동작
        thr4.start();
        thr5.start();

        System.out.println("프로그램 종료");
    }
}
