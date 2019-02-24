package library;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.out.print("Введите количество строк - ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String[] mymassiv = new String[size];
		int str = 1;
		boolean sort = false;
		String change;
		for (int i = 0; i < mymassiv.length; i++) {
			System.out.println("Введите " + str + " строку - ");
			scanner = new Scanner(System.in);
			String vstr = scanner.nextLine();
			mymassiv[i] = vstr;
			str += 1;

		}

		while (!sort) {
			sort = true;
			for (int i = 0; i < mymassiv.length - 1; i++) {
				String m1 = mymassiv[i];
				String m2 = mymassiv[i + 1];
				if (m1.length() > m2.length()) { // при замене на < будет в порядке убывания
					sort = false;

					change = mymassiv[i];
					mymassiv[i] = mymassiv[i + 1];
					mymassiv[i + 1] = change;
				}
			}
		}
		System.out.println("Строки в порядке возрастания - " + Arrays.toString(mymassiv));

	}

}
