public class ValueofExam {
    public static void main(String[] args) {
        String stri = "123456";
        String strd = "123.56";

        System.out.println(stri);
        System.out.println(strd);
        System.out.println(stri + strd);
        System.out.println(Integer.valueOf(stri) + Double.valueOf(strd));
    }

}
