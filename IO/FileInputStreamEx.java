import java.io.*;
public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b[] = new byte[6];
        try {
            FileInputStream fin = new FileInputStream("test.out");
            int n = 0, c;
            while ((c = fin.read()) != -1) { //파일 끝 -1 end of file (eof)
                b[n] = (byte) c;
                n++;
            }
            System.out.println("test.out에서 읽은 배열 출력"); //배열 b[]의 바이트값 출력
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i] + " ");
            }
            System.out.println("\n");
            fin.close();
        } catch (IOException e) {
            System.out.println("test.out에서 읽지 못했습니다. 경로 확인");
        }
    }
}