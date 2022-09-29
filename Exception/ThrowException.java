package Exception;

public class ThrowException {
    public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
        String[] irum = new String[3];
        irum[3] = "메토드"; // 에러

    }

    public static void main(String[] args) {
        ThrowException ts = new ThrowException();
        try {
            arrayMethod();
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("메토드 ㅋㅋ");
        }
    }
}
