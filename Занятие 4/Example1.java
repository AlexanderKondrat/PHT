package library;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Person info = new Person();
		Scanner scanner = new Scanner(System.in);
		System.out.print("¬ведите им€: ");
		String MyName = scanner.next();
		System.out.print("¬ведите фамилию: ");
		String MySurName = scanner.next();
		System.out.print("¬ведите возраст: ");
		int MyAge = scanner.nextInt();
		System.out.print("¬ведите телефон: ");
		String MyNumber = scanner.next();
		info.setprintAllInformation(MyName, MySurName, MyAge, MyNumber);
		
		
		info.printAllInformation();
		info.printName();
		if (info.isAdult()==true) {System.out.print("¬ам есть 18 лет."); break;}
		System.out.print(info.isAdult());
	}

}
