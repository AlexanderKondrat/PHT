package library;

import java.util.Arrays;

public class Task12 {
	public static void main(String[] args) {
		int[] MyMassiv = new int[10];
		for (int a = 0; a < MyMassiv.length; a++) {
			MyMassiv[a] = (int) (Math.random() * 50);
		}
		System.out.println("�������� ������: " + Arrays.toString(MyMassiv));
		int[] MyMassiv2 = new int[10];
		for (int a = 2; a < MyMassiv2.length; a++) {
			MyMassiv2[a] = MyMassiv[a - 2];
		}
		System.out.print("����� ������� ������: " + Arrays.toString(MyMassiv2));

	}
}
