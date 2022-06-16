package IO;

import java.io.*;
import java.util.StringTokenizer;

class MDataRWExam {
    int length;
    String [] name = new String[10];
    String [] address = new String[10];
    double [] math = new double[10];
    double [] eng = new double[10];
    double [] total = new double[10];
    double [] avg = new double[10];

    public void writingData(String fname, boolean append) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(new File(fname));
            bw = new BufferedWriter(fw);

            for(int i = 0 ; i < length; i++) {
                bw.write(name[i] + "\t" + address[i] + "\t"
                        + math[i] + "\t" + eng[i] + "\t" + total[i] + "\t" + avg[i]);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (FileNotFoundException fe) {
            System.out.println("잘못된 파일 이름 입력됨");
        }
    }

    public void readingData(String fname) throws IOException {
        try {
            String csvstr = "";
            String tmpstr = "";
            FileReader fr = new FileReader(new File(fname));
            BufferedReader br = new BufferedReader((fr));

            do {
                tmpstr = br.readLine();
                if(tmpstr != null) {
                    csvstr += tmpstr + "\t";
                }
            } while(tmpstr != null);
            StringTokenizer parse = new StringTokenizer(csvstr, "\t");
            length = parse.countTokens()/4;

            for(int i = 0 ; i < length; i++) {
                name[i] = parse.nextToken();
                address[i] = parse.nextToken();
                math[i] = Double.valueOf(parse.nextToken()).doubleValue();
                eng[i] = Double.valueOf(parse.nextToken()).doubleValue();
                total[i] = math[i] + eng[i];
                avg[i] = total[i] / 2.0;
            }

        } catch (FileNotFoundException fe) {
            System.out.println("잘모댄 파일 이름 입력ㄷ댐");
        }
    }
}

public class WritingDatasMain {
    public static void main(String[] args) {
        MDataRWExam mrw = new MDataRWExam();
        try {
            mrw.readingData("writed.txt");
            mrw.writingData("writing.txt", true); //append는 값 false는 파일 이어쓰기를 하지 않음

        }catch (Exception ie) {
            ie.printStackTrace();
        }
    }

}
