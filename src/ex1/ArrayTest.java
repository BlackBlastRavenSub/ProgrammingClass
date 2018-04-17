package ex1;

import java.util.Random;

public class ArrayTest {
	public static void main(String[] args) {
		int TEST[] = new int[10];
		Random R = new Random();
		for (int i = 0; i < 10; i++) {
			TEST[i] = R.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(TEST[i]);
		}
	}
}
