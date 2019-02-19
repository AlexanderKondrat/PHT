package library;

import java.util.Arrays;

public class TaskD {
	public static void main(String[] args) {
		int[][] MyMassiv = new int[3][3];
		for (int a = 0; a < MyMassiv.length; a++) {
			for (int b = 0; b < MyMassiv.length; b++) {
				MyMassiv[a][b] = (int) (Math.random() * 50);
			}
		}
		System.out.println("Многомерный массив: " + Arrays.deepToString(MyMassiv));
		System.out.print("Многомерный массив в обратном порядке: [");
		int del = 0;
		for (int a = MyMassiv.length - 1; a >= 0; a--) {
			for (int b = MyMassiv.length - 1; b >= 0; b--) {
				MyMassiv[a][b] = MyMassiv[a][b];
				System.out.print(MyMassiv[a][b] + ", ");
				del += 1;
				if (del == 3) { 	// переменная, если размер вводит пользователь
					System.out.print("] [");
					del = 0;
				} 
			}
		}
		int min = MyMassiv[0][0];
		int max = MyMassiv[0][0];
		for (int a = 0; a < MyMassiv.length; a++) {
			for (int b = 0; b < MyMassiv.length; b++) {
				if (MyMassiv[a][b] < min) {
					min = MyMassiv[a][b];
				} else if (MyMassiv[a][b] > max) {
					max = MyMassiv[a][b];
				}
			}
		}
		System.out.println();
		System.out.println("Минимальный элемент - " + min);
		System.out.println("Максимальный элемент - " + max);

	}
}
