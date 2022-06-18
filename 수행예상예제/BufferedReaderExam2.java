package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//수행평가
public class BufferedReaderExam2 {
    public static void main(String[] args) {
        String a = "", b = "";
        int sum = 0;
        float avg = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the string(정수) > ");
            a = in.readLine();
            System.out.println("Enter the string(정수) >");
            b = in.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("your input is 뿡 " + a  + ","  + b);
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        sum = c + d;
        avg = (float)sum / 2;
        System.out.println(a + "+" + b + " = " + sum);
        System.out.println("평균 = " + avg);
    }
}