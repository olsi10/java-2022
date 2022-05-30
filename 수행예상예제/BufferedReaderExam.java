package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExam {
    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(isr); //인풋스트링
//        InputStreamReader isr = new InputStreamReader(System.in); 한 줄로 축약가능
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //시험 문제 예상!!!!!!!!!!!!
        try {
            String aa = br.readLine();
            System.out.println(aa);
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}