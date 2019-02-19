package lilbrary;

import java.io.IOException;
import java.util.Arrays;

public class Task_1_7 {
	public static void main(String[] args) throws IOException {
		int random_1 = (int) (Math.random() * 50);
		int random_2 = (int) (Math.random() * 50);
		int random_3 = (int) (Math.random() * 50);
		int MyMassiv[] = new int[10];
		double MyMassiv2[] = new double[10];
		float MyMassiv3[] = new float[10];
		for (int i = 0; i < MyMassiv.length; i++) {
			for (int b = 0; b < MyMassiv2.length; b++) {
				for (int c = 0; c < MyMassiv3.length; c++) {
					MyMassiv[i] = (int) (Math.random() * 50);
					MyMassiv2[b] = MyMassiv[i];
					MyMassiv3[c] = MyMassiv[i];
				}
			}
		}

		raz(random_1, random_2);
		sum(random_1, random_2, random_3);
		razR(random_1, random_2);
		sumR(random_1, random_2, random_3);
		printMas(MyMassiv);
		printMasL(MyMassiv);
		sumM(MyMassiv2);
		change(MyMassiv3);
	}

	public static void raz(int a, int b) {
		System.out.println("Разность(вывод) = " + (a - b));
	}

	public static void sum(int a, int b, int c) {
		System.out.println("Сумма(вывод) = " + (a+b+c));
	}

	public static int razR(int a, int b) {
		return a - b;
	}

	public static int sumR(int a, int b, int c) {
		return a + b + c;
	}

	public static void printMas(int[] anyMas) {
		System.out.println("Массив" + Arrays.toString(anyMas));
	}

	public static void printMasL(int[] anyMas) {
		int a = 0;
		for (int i = 0; i < anyMas.length; i++) {
			a += 1;
		}
		System.out.println("Длина массива = " + a);
	}

	public static double sumM(double[] anyMassiv) {
		double a = 0;
		for (int i = 0; i < anyMassiv.length; i++) {
			a += anyMassiv[i];
		}
		return a;
	}

	public static float[] change(float[] anyMas) {
		float MyMassiv4[] = new float[10];
		for (int i = 2; i < anyMas.length; i += 3) {
			anyMas[i] = -1;
		}
		MyMassiv4 = anyMas;
		return MyMassiv4;
	}
}