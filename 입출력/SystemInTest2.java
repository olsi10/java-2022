package 입출력;

import java.io.IOException;

public class SystemInTest2 {
    public static void main(String[] args) {
        System.out.println("알파벳 여러 개 쓰고 Enter 누르기");

        int i;

        try {
            while((i = System.in.read()) != -1) {
                System.out.println((char)i);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
