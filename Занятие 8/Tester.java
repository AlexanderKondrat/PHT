package library;

public class Tester {
	public static String name;
	public static String surname;
	static int expirienceInYears;
	protected static String englishLevel;
	private static int salary;

//Task_1
	protected Tester(String name) {
		Tester.name = name;
	}

	Tester(String name, String surname) {
		this(name);
		Tester.surname = surname;
	}

	public Tester(String name, String surname, int exp, String english, int salary) {// если сделать private, то объект
																						// класса не создать
		this(name, surname);
		Tester.expirienceInYears = exp;
		Tester.englishLevel = english;
		Tester.salary = salary;

	}

//Task_2	
	static String getName() {
		return name;
	}

	static String getNameSurname() {
		return name + surname;
	}

	static String getAll() {
		return name + surname + expirienceInYears + englishLevel + salary;
	}

	void setName(String name) {
		Tester.name = name;
	}

	void setNameSurname(String name, String surname) {
		Tester.name = name;
		Tester.surname = surname;
	}

	void setAll(String surname, String name, int exp, String english, int salary) {
		Tester.name = name;
		Tester.surname = surname;
		Tester.expirienceInYears = exp;
		Tester.englishLevel = english;
		Tester.salary = salary;
	}

	// task3
	private int getSalary() { // Доступен только в этом классе
		return salary * 2;
	}

	// task4
	static int getExp() { // вызывается только в пакете с main
		return expirienceInYears * 12;
	}
	// task5

	protected static void printNameSurname() {
		System.out.println("Имя " + name + "\nФамилия " + surname);
	}

	// task6
	public static void printAll() {
		printNameSurname();
		System.out.println("Опыт работы в годах " + expirienceInYears + "\nУровень английского " + englishLevel
				+ "\nЗарплата " + salary);
	}

}
