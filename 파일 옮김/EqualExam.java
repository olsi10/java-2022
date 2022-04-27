public class EqualExam {
    public static void main(String[] args) {
        String str1 = "mirim";
        String str2 = "mirim";
        String str3 = new String("highschool");
        String str4 = new String("highschool");

        String str5 = "test";
        String str6 = new String("test");

        if(str1 == str2) {
            System.out.println("주소같음");
        }else{
            System.out.println("주소 다름");
        }

        if(str3 == str4) {
            System.out.println("주소같음");
        }else{
            System.out.println("주소 다름");
        }

        if(str1.equals(str2)) {
            System.out.println("내용용같음");
       }else{
            System.out.println("내용다름");
        }

        if(str3.equals(str4)) {
            System.out.println("내용용같음");
        }else{
            System.out.println("내용다름");
        }

        //이제부터 책에 없는 내용임

        if(str1 == str3) {
            System.out.println("주소같음");
        }else{
            System.out.println("주소 다름");
        }

        if(str1.equals(str3)) {
            System.out.println("내용용같음");
        }else{
            System.out.println("내용다름");
        }


        if(str5 == str6) {
            System.out.println("주소같음");
        }else{
            System.out.println("주소 다름");
        }
    }
}
