package library;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		System.out.println("Введите размер массива: ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();

		double[] MyMassiv = new double[size];
		for (int a = 0; a < MyMassiv.length; a++) {
			MyMassiv[a] = (int) (Math.random() * 50);
		}
		System.out.println("Исходный массив: " + Arrays.toString(MyMassiv));
		for (int a = 1; a < MyMassiv.length; a += 2) {
			if (a == MyMassiv.length - 1) {
				break;
			}
			MyMassiv[a] = (MyMassiv[a - 1] / 2) + (MyMassiv[a + 1] / 2);
		}
		System.out.println("Полусумма соседних элементов: " + Arrays.toString(MyMassiv));
	}
}