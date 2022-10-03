package Thread;

class Top2 implements Runnable {
    public void run() {
        for(int i = 0 ; i < 50; i++) {
            System.out.println(i + " \t");
        }
    }
}

public class RunnableExam {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        Top2 t = new Top2();

        // Runnable 추상 메서드의 스레드 객체 생성 방법
        // Thread tt = new Thread(new SeThread);
        Thread tt = new Thread(t);
        tt.start();

        System.out.println("프로그램 종료");
    }
}
