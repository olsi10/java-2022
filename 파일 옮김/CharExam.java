public class CharExam {
    public static void main(String[] args) {     //문자열의 특정 위치의 문자를 반환하는 메서드
        String str = "I Love Korea";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println();
    }

}
