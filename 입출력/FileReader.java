package 입출력;

import java.io.*;

public class FileReader {
    public static void main(String[] args) {
        FileReader in = null;
        try {
            in = new FileReader("c:\\windows\\system.ini");
            int c;
            while((c = in.read()) != -1) {
                System.out.println((char)c);  
            } 
            in.close();
        }catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
