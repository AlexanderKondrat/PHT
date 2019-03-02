package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {

	public static int number;

	public static void main(String[] args) {

		ArrayList<String> text = new ArrayList<String>();
		System.out.println("Number of element - ");
		Scanner scanner2 = new Scanner(System.in);
		number = scanner2.nextInt();
		entering(text);
	}

	private static void entering(ArrayList<String> basics) {
		System.out.println("Enter text - ");
		Scanner scanner = new Scanner(System.in);
		String entered = scanner.nextLine();
		basics.add(entered);
		System.out.println("Do you want to enter text again? - Y or N ");
		String yesno = scanner.next();

		if (yesno.compareToIgnoreCase("y") == 0) {
			entering(basics);
		} else if (yesno.compareToIgnoreCase("n") == 0) {
			Basic.sortBasic(basics);
		}
	}

}