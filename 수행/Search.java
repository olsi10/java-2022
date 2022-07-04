import java.util.*;
import java.io.*;

public class Search_test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("<< 학생 정보 입력 >>");

        String find_num = scan.next();

        try  {
            FileReader fr = new FileReader("Student.txt"); //파일 스트림 연결 (메인 스트림)
            BufferedReader br = new BufferedReader(fr); //(보조 스트림)
            String temp = " "; //비교
            String value = " "; //비교
            
            while ((temp = br.readLine()) != null) { //br을 temp에 넣음 값이 없을 때까지 계속
                value += temp + " ";
            }

            StringTokenizer parse = new StringTokenizer(value, " "); //value를 넣고 스페이스바로 나눔

            boolean flag = false;

            while(parse.hasMoreTokens())  { // 토큰이 남아 있으면 True 그렇지 않으면 False
                String number = parse.nextToken(); //토큰값 반환

                if(number.equals((find_num))) {
                    System.out.println(number + "\t" + parse.nextToken() + "\t" + parse.nextToken()); //학번, 이름, 전화번호
                    flag = true;
                }
            }

            if(flag == false) {
                System.out.println("찾는 값이 없다.");
            }

            br.close(); //끝

        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


//        FileReader fr = null;
//        int i = 0; //세 번만 검색할 수 있게
//        StringTokenizer parse = new StringTokenizer("\r");
//
//        try {
//            fr = new FileReader("C:\\Users\\Mirim\\Desktop\\test 2311\\test - 학생배부용\\student.txt");
//            Scanner scan = new Scanner(System.in);
//            System.out.println("<<학생 정보 검색>>");
//
//            while(i != 3) {
//                System.out.print("학번 입력 : ");
//                String line = scan.next();
//
//                if(line.equals("2022")) {
//                    System.out.println("2022 김미림 111-1111");
//                } else if(line.equals("2023")) {
//                    System.out.println("2023 나미림 222-2222");
//                } else if(line.equals("2024")) {
//                    System.out.println("2024 최미림 333-3333");
//                }
//
//                    i++;
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }

}
