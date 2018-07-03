package ex13;

import java.io.*;

public class ReadDic {
    public static void main(String[] args) {
        String filename = "dic.txt";
        // ここを作る。
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}