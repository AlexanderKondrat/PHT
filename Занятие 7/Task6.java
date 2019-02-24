package library;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
		System.out.print("Введите количество строк - ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String[] mymassiv = new String[size];
		int str = 1;
		boolean result = false;
		for (int i = 0; i < mymassiv.length; i++) {
			System.out.println("Введите " + str + " строку - ");
			scanner = new Scanner(System.in);
			String vstr = scanner.next();
			mymassiv[i] = vstr;
			str += 1;
			for (int e = 0; e < vstr.length(); e++) {
				if (e == vstr.length() - 1) {
					break;
				}
				char c = vstr.charAt(e);
				int b = Character.valueOf(c);
				char c1 = vstr.charAt(e + 1);
				int b1 = Character.valueOf(c1);
				if (b > b1) {
					result = true;
					break;
				}
				result = false;
			}
			if (!result) {
				System.out.println("Коды символов в порядке возрастания - " + vstr);
				break;
			}

		}

	}

}
