package Thread;

class Top1 extends Thread {
    public void run() {
        for(int i = 0; i < 50; i++) {
            System.out.print(i + " \t");
        }
    }
}

public class ThreadExam1 {
    public static void main(String[] args) {

        System.out.println("프로그램 시작");
        
        Top1 t = new Top1();
        
        // JVM이 해당 스레드를 Ready(준비 상태)_로 만듦, JVM 스케쥴러에 의해 Run(실행 상태)_가 됨
        t.start();
        // 프로그래머가 직접 run 메소드를 호출하면 스레드로 동작하지 않는다.

        System.out.println("프로그램 종료");
        
    }
}
