package 입출력;

import java.io.*;

public class Echo1 {
    public static void main(String[] args) {
        int bt;
        try {
            bt = System.in.read();
            System.out.println((char)bt);
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
