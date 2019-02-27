package homework;

public abstract class Starsystem {
	static int weight;
	static int age;

	public int getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public static void setWeight(int weight) {
		Starsystem.weight = weight;
	}

	public static void setAge(int age) {
		Starsystem.age = age;
	}

	public abstract void printInfo();

}
