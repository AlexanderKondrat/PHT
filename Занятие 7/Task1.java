package library;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.print("Введите количество строк - ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String[] mymassiv = new String[size];
		int str = 1;
		int maxL = 0;
		int minL = 0;
		String maxS = "";
		String minS = "";
		for (int i = 0; i < mymassiv.length; i++) {
			System.out.println("Введите " + str + " строку - ");
			scanner = new Scanner(System.in);
			String vstr = scanner.nextLine();
			mymassiv[i] = vstr;
			maxL = Math.max(maxL, vstr.length());

			if (maxS.length() < vstr.length()) {
				maxS = vstr;
			}
			if (mymassiv[i] == mymassiv[0]) {
				minL = vstr.length();
				minS = vstr;
			} else if (minS.length() > vstr.length()) {
				minS = vstr;
			}

			minL = Math.min(minL, vstr.length());

			str += 1;
		}
		System.out.println("Самая длинная строка " + maxS + "\nСамая короткая строка " + minS
				+ "\nМинимальная длина строки - " + minL + "\nМаксимальная длина строки - " + maxL);

	}

}
