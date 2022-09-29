package Thread;

class Top implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<50; i++) {
            System.out.print(i + " \t");
        }
    }
}

public class Thread1Exam{
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        Top t = new Top();
        Thread thd = new Thread(t);
        thd.start();
        System.out.println("프로그램 종료");
    }
}

// 자바는 단일상속을 지원함, 만약 스레드를 상속하면 다른 것을 상속하지 못함
// 그런데 인터페이스는 중복 구현ㅇ ㅣ가능 그래서 인터페이스를 이용하여 스레드를 사용함
// 편한 대로 쓰면 됨

// Thread 클래스를 상속하는 방법과 Runnable 인터페이스를 구현하는 방법에는 큰 차이
//가 없다. 하지만 Thread 클래스를 상속하는 경우 Thread 클래스의 모든 메소드를 상속받
//아 사용할 수 있기 때문에 훨씬 편리하다. 그러면 Runnable 인터페이스를 구현하는 이유
//는 무엇일까? 자바는 단일 상속만을 지원하기 때문에 만약 스레드를 구현하고자 하는 클래
//스가 다른 클래스를 상속받았을 경우 Thread 클래스를 상속할 수 없기 때문에 Runnable
//인터페이스를 구현하여 스레드 프로그램을 작성한다.