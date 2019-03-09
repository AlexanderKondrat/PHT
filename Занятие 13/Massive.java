package homework;

public class Massive {
	static int div;
	static int value;
	static String name;
	static int age;

	public static void main(String[] args) {
		division();
		values();
		multi();
		showFinally();
	}

	public static void division() {
		try {
			div = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}
	}

	public static void values() {
		try {
			value = 50; // via Scanner
			if (value < 0) {
				throw new IllegalArgumentException("Negative number");
			} else if (value == 0) {
				throw new NullPointerException("Void value");

			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void multi() {
		try {
			name = "Ivan"; // Can comment
			name.charAt(2);
			Integer.parseInt(name); // Cay comment
		} catch (IllegalArgumentException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void showFinally() {
		try {
			div = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("It will be shown");
		}

	}

}