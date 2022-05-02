package 상속;

//학생 클래스를 상속받아 학급회장 클래스 만들기
public class Student {
    //학생 멤버 변수
    String name;
    int number;
    int phone_number;
    String adress;
    String hakgwa;

    //메소드
    public void Study() {}
    public void eat() {}
    public void test() {}
    public void club() {}

}
//학생 클래스를 상속받는 학급회장 클래스
class Leader extends Student {
    //멤버 변수나 메소드 정의 가능

    //학급 회장인지 아닌지 구별하는 멤버 변수 추가
    Boolean isLeader;

    //인사하다 라는 메소드 추가
    public void gretting() {
        System.out.println("안녕!");
    }
}

