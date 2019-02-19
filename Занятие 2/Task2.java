package library;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int diapazon = 50;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите размер вашего массива: ");
		int size = scanner.nextInt();
		int[] MyMassiv = new int[size];
		for (int i = 0; i < MyMassiv.length; i++) {
			MyMassiv[i] = (int) (Math.random() * diapazon);

		}
		Pow(MyMassiv);
		System.out.println("Ваш массив: " + Arrays.toString(MyMassiv));
		System.out.println("Произведение элементов массива: " + Pow(MyMassiv));

	}

	public static int Pow(int[] PowMassiv) {
		int pow = 1;
		for (int i = 0; i < PowMassiv.length; i++) {
			pow = pow * PowMassiv[i];
		}
		return pow;
	}
}