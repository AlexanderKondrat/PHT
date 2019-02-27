package homework;

public class Sirius extends Star {
	String name;
	int temp;

	public Sirius() {
		super(type, size);

	}

	public void infoGeneral() {
		System.out.println("Name " + name + " Type " + type);
	}

	public void infoTechnical() {
		System.out.println("Age " + age + " Weight " + weight + " Temperature " + temp + "Size" + size);
	}

}
