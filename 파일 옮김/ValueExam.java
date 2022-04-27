public class ValueExam {
    public static void main(String[] args) {
        char ch = 'A';
        String strData1 = "A";
        String strData2;
        strData2 = String.valueOf(ch);

        if(strData1.equals(strData2)) {
            System.out.println("같음");
        } else{
            System.out.println("다름");
        }
    }
}
