package library;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) throws InterruptedException {
		int str = 1;
		System.out.print("Введите количество слов - ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String[] mymassiv = new String[size];

		for (int i = 0; i < mymassiv.length; i++) {
			boolean result = false;
			System.out.println("Введите " + str + " слово - ");
			scanner = new Scanner(System.in);
			String vstr = scanner.next();
			mymassiv[i] = vstr;
			str += 1;
			char[] mas = vstr.toCharArray();
			for (int e = 0; e < mas.length - 1; e++) {
				boolean f2 = false;
				char c = vstr.charAt(e);
				String b = String.valueOf(c);
				String s = vstr.substring(e + 1);
				if (e > 0) {
					String d = vstr.substring(0, e - 1);
					f2 = d.contains(b);
				}
				boolean f1 = s.contains(b);

				if (f1 == true || f2 == true) {
					result = true;
					break;
				}

			}

			if (!result) {
				System.out.println("Слово состоит из различных символов - " + vstr); break;

			}

		}

	}
}
