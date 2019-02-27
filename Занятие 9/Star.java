package homework;

public class Star extends Starsystem {
	static int size;
	static String type;

	public Star(String type) {
		Star.type = type;
	}

	public Star(String type, int size) {
		Star.type = type;
		Star.size = size;
	}

	public void printInfo() {
		System.out.println("Stars");
	}
}