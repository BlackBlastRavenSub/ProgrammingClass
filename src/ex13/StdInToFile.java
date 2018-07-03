package ex13;

import java.io.*;
import java.util.Scanner;

public class StdInToFile {
    public static void main(String[] args) {
        String filename = "test.txt";
        // ここを作る。
        File file = new File(filename);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
            Scanner scan = new Scanner(System.in);
            String str;
            str = scan.next();
            pw.println(str);
            pw.close();
            */