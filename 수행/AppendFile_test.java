import java.io.*;

public class AppendFile_test {
    public static void main (String[] args) {
        FileReader fReader = null;
        FileWriter fWriter = null;
        try {
            // 1. 첫번째 파일 스트림 열기 (Dynamite1.txt 사용)
            fReader = new FileReader("Dynamite1.txt");
            // 2. 합치는 파일 지정 (appended.txt 사용)
            fWriter = new FileWriter("append.txt");
            // 3. 첫번째 파일을 읽어 합치는 파일에 기록
            writeToFile(fReader, fWriter);
            // 4. 첫번째 스트림 닫기
            fReader.close();
            // 5. 두번째 스트림 열기 (Dynamite2.txt 사용)
            fReader = new FileReader("Dynamite2.txt");
            // 6. 두번째 파일을 읽어 합치는 파일에 연이어 기록
            writeToFile(fReader, fWriter);

            fReader.close();
            fWriter.close();

            System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("입출력 오류가 발생했습니다.");
        }
    }

    private static void writeToFile(FileReader in, FileWriter out) throws IOException {
        char buf[] = new char[50]; // 버퍼 크기 50 바이트
        int count = 0; // count는 읽은 문자 개수. while 문에 처음 들어가기 위한 임시 값.
        while (true) {
            count = in.read(buf, 0, buf.length);   // 7. buf[] 크기 만큼 읽기
            if(count == -1)
                break; // 파일 끝에 도달함
            if (count > 0) { // 읽은 것이 있다면
                out.write(buf, 0, buf.length);// 8. 읽은 만큼 합치는 파일에 저장
            }
        }
    }
}
