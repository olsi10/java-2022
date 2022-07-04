import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class Copy2022_test {
    public static void main(String[] args) throws IOException{
        byte b[] = new byte[62];
        int len = 0;

        FileInputStream fis = new FileInputStream("C:\\Users\\Mirim\\Desktop\\test 2311\\test - 학생배부용\\mirim.txt");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\Mirim\\Desktop\\test 2311\\test - 학생배부용\\copy.txt");


        fis.read(b, 0, b.length);
        fout.write(b, 0, b.length);

        fis.close();
        fout.close();
    }
}
