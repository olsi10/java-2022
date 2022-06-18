package 입출력;

import java.io.IOException;

public class Echo2 {
    public static void main(String[] args) {
        int bt;
        try {
            while((bt = System.in.read()) != -1) {
                System.out.print((char) bt);
            }
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
