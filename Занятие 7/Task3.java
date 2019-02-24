package library;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		int str = 1;
		int alllength = 0;
		System.out.print("Введите количество строк - ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String[] mymassiv = new String[size];

		for (int i = 0; i < mymassiv.length; i++) {
			System.out.println("Введите " + str + " строку - ");
			scanner = new Scanner(System.in);
			String vstr = scanner.nextLine();
			mymassiv[i] = vstr;
			str += 1;
			alllength += vstr.length();
		}
		alllength /= size;
		System.out.print("Строки больше средней - ");
		for (int i = 0; i < mymassiv.length; i++) {
			String m1 = mymassiv[i];
			if (m1.length() > alllength) { // при замене на < будет меньше средней
				System.out.println(mymassiv[i]);
			}
		}

	}

}
