package library;

import java.util.Arrays;

public class Task3 {
	public static void main(String[] args) {
		int[] MyMassiv = new int[15];
		for (int a = 0; a < MyMassiv.length; a++) {
			MyMassiv[a] = (int) (Math.random() * 50);
		}
		System.out.println("������� ������: " + Arrays.toString(MyMassiv));
		for (int a = 2; a < MyMassiv.length; a += 3) {
			MyMassiv[a] *= 3;
		}
		System.out.println("������ ������ ������� ������� �� 3; " + Arrays.toString(MyMassiv));

	}
}
