package library;

public class Tester {
	public String name;
	public String surname;
	public int expirienceInYears;
	public String englishLevel;
	public int salary;

//Task_1
	public Tester(String name) {
		this.name = name;
	}

	public Tester(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	public Tester(String name, String surname, int exp, String english, int salary) {
		this(name, surname);
		this.expirienceInYears = exp;
		this.englishLevel = english;
		this.salary = salary;

	}

//Task_2	
	public Tester() {

	}

	public String itPrint(String name) {
		return "Ваше имя: " + name;
	}

	public String itPrint(String name, String surname) {
		return "Ваше имя: " + name + " Ваша фамилия: " + surname;
	}

	public String itPrint(String name, String surname, int age) {
		return "Ваше имя: " + name + " Ваша фамилия: " + surname + " Ваш возраст: " + age;
	}

	// Task 3
	public static int staticMethod(int a, int b, int c, int d) {
		return a + b + c + d;
	}

}
