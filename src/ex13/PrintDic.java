package ex13;

import java.io.*;
import java.time.format.TextStyle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintDic {
    public static void main(String[] args) {
        String filename = "dic.txt";
        String a = "(.*)(,)";
        String b = "(,)(.*)";
        Pattern a1 = Pattern.compile(a);
        Pattern b1 = Pattern.compile(b);
        Matcher Eng;
        Matcher Jap;
        // ここを作る。
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                Eng = a1.matcher(line);
                Jap = b1.matcher(line);
                if (Eng.find() && Jap.find()) {//なぜこの1文を入れると動作する？
                    System.out.println("英単語[" + Eng.group(1) + "]は、日本語の[" + Jap.group(2) + "]という意味です。");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
