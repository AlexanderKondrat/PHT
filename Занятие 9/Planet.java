package homework;

public class Planet extends Starsystem {
	static String name;
	static String air;

	public Planet(String name) {
		super();
		Planet.name = name;
	}

	public Planet(String name, String air) {
		this(name);
		Planet.air = air;
	}

	public void printInfo() {
		System.out.println("Planets");
	}
}
