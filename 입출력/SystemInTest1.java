package 입출력;

import java.io.IOException;

public class SystemInTest1 {
    public static void main(String[] args) {
        System.out.println("알파벳 한 글자 쓰고 Enter 누르기");

        int c;
        try {
            c = System.in.read();
            System.out.println(c);
            System.out.println((byte)c);
        }catch (IOException e) {
            e.printStackTrace();
        }
        }
}
