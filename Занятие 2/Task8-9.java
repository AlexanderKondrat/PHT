package library;

import java.util.Arrays;

public class Task9 {
	public static void main(String[] args) {
		int[] MyMassiv = new int[10];
		int chislo;
		int numbermin = 0;
		int numbermax = 0;
		int max = 0;
		for (int a = 0; a < MyMassiv.length; a++) {
			chislo = (int) (Math.random() * 50);
			MyMassiv[a] = chislo;
			if (chislo >= max) {
				max = chislo;
				numbermax = a;
			}

		}
		int min = MyMassiv[0];
		for (int a = 0; a < MyMassiv.length; a++) {
			if (MyMassiv[a] < min) {
				min = MyMassiv[a];
				numbermin = a;
			}

		}
		System.out.println("������: " + Arrays.toString(MyMassiv));
		System.out.println("����� ������ ������������� ����� - " + numbermax + " ������������ ����� - " + max);

		System.out.println("����� ������ ������������ ����� - " + numbermin + " ����������� ����� - " + min);

	}
}
