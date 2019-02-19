package lilbrary;

public class Task_4 {
	public static void main(String[] args) {
		int random = (int) (Math.random() * 50);
		System.out.println("Исходное число - " + random + " Возведенное в квадрат - " + sr(random));
	}

	public static int sr(int a) {
		return a = (int) (Math.pow(a, 3));
	}

}
