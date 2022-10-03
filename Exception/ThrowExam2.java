package Exception;

public class ThrowExam2 {
    public static void gogo() throws ArrayIndexOutOfBoundsException {
        int a[] = new int[5];
        for(int i = 0; i < 6; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }

    public static void main(String[] args) {
        try {
            gogo();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("길이가 안돼잇-!");
        }
        finally {
            System.out.println("This is HACK");
        }
    }
}
