package 상속;

public class Student2 {
    String name;
    String hakbun;
    String phone;
    String juso;
    String major;

    public Student2() {}
    public Student2(String name, String hakbun) {
        this.name = name;
        this.hakbun = hakbun;
    }

    public void study() {System.out.println("공부하다.");}
    public void eat() {System.out.println("식사하다.");}
    public void test() {System.out.println("시험보다.");}
    public void extra_act() {System.out.println("동아리 활동을 하다.");}
}

class Mainclass {
    public static void main(String[] args) {
        //Leader hong = new Leader("홍길동", "30130", true);
                //hong.isLeader();
    }
}

