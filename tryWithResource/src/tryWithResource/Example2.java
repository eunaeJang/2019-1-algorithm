package tryWithResource;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example2 {

    static void printFile(String 파일명) throws Exception {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(파일명));
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } finally {
            if (reader != null) reader.close();
        }
    }

    public static void main(String[] args) throws Exception {
        String 파일명 = "/Users/eunae/Documents/eclipse-workspace/test.txt";
        printFile(파일명);
    }
}
