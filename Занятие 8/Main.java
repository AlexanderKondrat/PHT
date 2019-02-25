package library;

public class Main {

	public static void main(String[] args) {
		Tester tester = new Tester("Oleg", "Ivanov", 4, "B1", 1200);
		System.out.println(Tester.getName());
		System.out.println(Tester.getNameSurname());
		System.out.println(Tester.getAll());
		System.out.println("ќпыт работы в мес€цах " + Tester.getExp());
		tester.setName("Victor");
		tester.setNameSurname("Victor", "Volkov");
		tester.setAll("Victor", "Volkov", 6, "C2", 2100);

		Tester.printNameSurname();
		Tester.printAll(); // это единственный метод, который будет вызыватьс€ из другого пакета. ќстальным
							// не позволит модификаторы доступа.

	}

}
