package library;

import java.util.Arrays;

public class Task6 {
	public static void main(String[] args) {
		int[] MyMassiv = new int[10];
		for (int a = 0; a < MyMassiv.length; a++) {
			MyMassiv[a] = (int) (Math.random() * 50);
		}
		System.out.print("Исходный массив: " + Arrays.toString(MyMassiv));
		System.out.println(" ");
		int[] MyMassiv2 = new int[10];
		for (int a = 1; a < MyMassiv2.length; a += 2) {
			MyMassiv2[a - 1] = MyMassiv[a];
		}
		for (int a = 0; a < MyMassiv2.length; a += 2) {
			MyMassiv2[a + 1] = MyMassiv[a];
		}
		System.out.print("Соседние элементы массива поменяны местами: " + Arrays.toString(MyMassiv2));

	}
}
