package homework;

public class Sun extends Star {
	String name;
	int temp;

	public Sun() {
		super(type, size);

	}

	public void infoGeneral() {
		System.out.println("Name " + name + " Type " + type);
	}

	public void infoTechnical() {
		System.out.println("Age " + age + " Weight " + weight + " Temperature " + temp + "Size" + size);
	}

}