package Exception;

public class num6Exam {
    public static void main(String[] args) {
        String[] irum = new String[3];

        try {
            for (int i = 0; i < irum.length; i++) {
                System.out.println(irum[i]);
            }

            // 다중 catch를 쓸 때엔 상위 클래스가 나중에 등장해야 한다. (최후의 수단처럼)
//        } catch (Exception e) {
//            System.out.println("예외 발생");
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("배열 예외 발생");
    }
}
