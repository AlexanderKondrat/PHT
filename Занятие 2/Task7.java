package library;

import java.util.Arrays;

public class Task7 {
	public static void main(String[] args) {
		int[] MyMassiv = new int[10];
		for (int a = 0; a < MyMassiv.length; a++) {
			MyMassiv[a] = (int) (Math.random() * 50);
		}
		System.out.println("Исходный массив: " + Arrays.toString(MyMassiv));
		System.out.print("Массив в обратном порядке: [");
		for (int a = MyMassiv.length - 1; a >= 0; a--) {
			System.out.print(MyMassiv[a] + ", ");
		}
		System.out.print("] ");
	}
}