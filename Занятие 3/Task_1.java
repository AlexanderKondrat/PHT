package lilbrary;

public class Task_1 {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 50);
		int b = (int) (Math.random() * 50);
		Sravnenie(a, b);
		System.out.println(a + " " + b);
		System.out.println("Наибольшее число - " + Sravnenie(a, b));
	}

	public static int Sravnenie(int e, int c) {
		if (e == c) {
			return e;
		}
		if (e > c) {
			return e;
		}
		return c;
	}
}
