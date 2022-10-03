package Exception;

public class ThrowExam {

    //리턴 타입, 메소드 이름(매개변수) throws 예외타입 {
    public static void mthd() throws ArrayIndexOutOfBoundsException {
        String num[] = new String[3];
        num[3] = "String";
    }

    public static void main(String[] args) {
        try {
            //throws 키워드가 붙은 메서드는 무조건 try 블록 내에서 호출되어야 함
            mthd();
        } catch (ArrayIndexOutOfBoundsException e) {
            // 무책임한 메소드를 책임질 든든한 녀석의 이름은.. 「캣치」
            System.out.println("길이가 안돼잇-!");
        }
    }
}
