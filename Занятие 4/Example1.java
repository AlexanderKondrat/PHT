package library;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Person info = new Person();
		Scanner scanner = new Scanner(System.in);
		System.out.print("������� ���: ");
		String MyName = scanner.next();
		System.out.print("������� �������: ");
		String MySurName = scanner.next();
		System.out.print("������� �������: ");
		int MyAge = scanner.nextInt();
		System.out.print("������� �������: ");
		String MyNumber = scanner.next();
		info.setprintAllInformation(MyName, MySurName, MyAge, MyNumber);
		
		
		info.printAllInformation();
		info.printName();
		if (info.isAdult()==true) {System.out.print("��� ���� 18 ���."); break;}
		System.out.print(info.isAdult());
	}

}
