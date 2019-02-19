package library;

public class Main {

	public static void main(String[] args) {
		Tester infos = new Tester();
		System.out.println(infos.itPrint("Иван"));
		System.out.println(infos.itPrint("Иван", "Петров"));
		System.out.println(infos.itPrint("Иван", "Петров", 22));

		System.out.println("Сумма = " + Tester.staticMethod(4, 5, 7, 20));

	}

}
