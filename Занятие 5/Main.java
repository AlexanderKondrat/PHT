package library;

public class Main {

	public static void main(String[] args) {
		Tester infos = new Tester();
		System.out.println(infos.itPrint("����"));
		System.out.println(infos.itPrint("����", "������"));
		System.out.println(infos.itPrint("����", "������", 22));

		System.out.println("����� = " + Tester.staticMethod(4, 5, 7, 20));

	}

}
