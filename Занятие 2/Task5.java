package library;

import java.util.Arrays;

public class Task5 {
	public static void main(String[] args) {
		int b;
		int zero = 0;
		int[] MyMassiv = new int[10];
		for (int a = 0; a < MyMassiv.length; a++) {
			b = (int) (Math.random() * 50);
			MyMassiv[a] = b;
			if (b == 0) {
				zero += 1;
				System.out.println("Ячейка №: " + a);
				continue;
			}
		}
		if (zero == 0) {
			System.out.println("Нулей нет!");
		}
	}
}
