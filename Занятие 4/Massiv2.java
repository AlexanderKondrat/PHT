package library;

import java.util.Arrays;

public class Massiv {

	public void setprintMassiveAsLine(int[] massiv) {
		System.out.println("������ ������� " + Arrays.toString(massiv));
	}

	public void setprintReverseMassiveAsLine(int[] massiv) {
		System.out.print("�������� �������: ");
		for (int e = massiv.length - 1; e >= 0; e--) {
			System.out.print(massiv[e] + " ");
		}
		System.out.println();
	}

	public int getSumOfElements(int[] massiv, int sum) {
		for (int e = massiv.length - 1; e >= 0; e--) {
			sum = sum + massiv[e];
		}
		return sum;
	}

	public int[] getmultiptyBy3(int[] massiv) {
		for (int e = 0; e < massiv.length; e++) {
			massiv[e] *= 3;
		}
		return massiv;
	}

}
