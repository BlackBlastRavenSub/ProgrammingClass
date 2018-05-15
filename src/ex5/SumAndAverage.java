package ex5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumAndAverage {
    public static int Sum = 0;
    public static int Ava = 0;

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        try {
            while (scanner.hasNext()) {
                int i = scanner.nextInt();
                numberList.add(i);
            }
        } catch (InputMismatchException e) {
            System.out.println("型が違います: " + e);
        }

        for (Integer I : numberList) {
            System.out.println(I);
        }
        for (Integer I : numberList) {
            Sum = Sum + I;
        }
        Ava = Sum / numberList.size();
        System.out.println("合計" + Sum);
        System.out.println("平均" + Ava);
    }
}
