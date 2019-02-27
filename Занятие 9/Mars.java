package homework;

public class Mars extends Planet {
	String water;
	String life;

	public Mars() {
		super(name, air);
	}

	public void infoGeneral() {
		System.out.println("Name " + name + " Life " + life);
	}

	public void infoTechnical() {
		System.out.println("Age " + age + " Weight " + weight + " Water " + water + "Air" + air);
	}

}
