package homework;

public class Example {

	public static void main(String[] args) {
		Planet planet = new Planet("Eatrh", "Yes");
		Star star = new Star("Dwarf");
		Earth earth = new Earth();
		earth.water = "Yes";

		Starsystem.setAge(23434234);
		Starsystem.setWeight(64564535);
		earth.infoTechnical();
		planet.printInfo();
		star.printInfo();

	}

}
