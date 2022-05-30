package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

class sungDataExam {
    public static void main(String fname) throws IOException {
        try {
            FileReader fr = new FileReader(new File(fname));
            BufferedReader br = new BufferedReader(fr);
            String csvstr = "";
            String tmpstr = "";

            do {
                tmpstr = br.readLine();
                if(tmpstr != null) {
                    csvstr += tmpstr + "\t";
                }
            } while(tmpstr != null);
            StringTokenizer parse = new StringTokenizer(csvstr, "\t");
            int length = parse.countTokens()/4;
            String [] name = new String[length];
            String [] address = new String[length];
            double [] math = new double[length];
            double [] eng = new double[length];
            double [] total = new double[length];
            double [] avg = new double[length];

            for(int i = 0 ; i < length; i++) {
                name [i] = parse.nextToken();
                address[i] = parse.nextToken();
                math[i] = Double.valueOf(parse.nextToken()).doubleValue();
                eng[i] = Double.valueOf(parse.nextToken()).doubleValue();
                total[i] = math[i] / eng[i];
                avg[i] = total[i]/2.0;
            }
            for(int i = 0; i < length; i++) {
                System.out.println(name[i] + "\t" + address[i] + "\t"
                + math[i] + "\t" + eng[i] + "\t" + total[i] + "\t" + avg[i]);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

public class DataMain {
    public static void main(String[] args) {
        sungDataExam wd = new sungDataExam();
        try {
            wd.readingData("writed2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
