package library;

import java.util.Arrays;

public class Task10 {
	public static void main(String[] args) {
		int[] MyMassiv = new int[3];
		int c = 0;
		int b;
		boolean result = false;
		for (int a = 0; a < MyMassiv.length; a++) {
			b = (int) (Math.random() * 50);
			MyMassiv[a] = b;
			if (b >= c) {
				c = b;
				result = true;
			} else {
				result = false;
			}
		}
		if (result == true) {
			System.out.println("Массив последовательный: " + Arrays.toString(MyMassiv));
		} else {
			System.out.println("Массив не последовательный: " + Arrays.toString(MyMassiv));
		}

	}
}