package library;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		int str = 1;
		int word = 0;
		System.out.print("Введите количество слов - ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String[] mymassiv = new String[size];

		for (int i = 0; i < mymassiv.length; i++) {
			System.out.println("Введите " + str + " слово - ");
			scanner = new Scanner(System.in);
			String vstr = scanner.next();
			mymassiv[i] = vstr;
			str += 1;
			Pattern p = Pattern.compile("[a-zA-z[^а-яА-Я0-9]]+");
			Matcher m = p.matcher(vstr);

			if (m.matches() == true) {
				int gl = 0;
				int sgl = 0;

				for (int e = 0; e < vstr.length(); e++) {
					char c = vstr.charAt(e);
					String b = String.valueOf(c);
					Pattern p1 = Pattern.compile("[aeiouyAEIOUY]+");
					Matcher m1 = p1.matcher(b);
					if (m1.matches() == true) {
						gl += 1;
					} else {
						sgl += 1;
					}

				}

				if (gl == sgl) {
					word += 1;
				}
			}

		}

		System.out.println("Количество слов с одникововым количество гласных/согласных - " + word);

	}
}
