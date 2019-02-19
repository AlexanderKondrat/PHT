package lilbrary;

public class Task_2 {
	public static void main(String[] args) {
		int random = (int) (Math.random() * 50);
		System.out.println("Число "+random+" четное это "+sr(random));
	}

	public static boolean sr(int a) {
		return (a % 2 == 0);
	}

}
