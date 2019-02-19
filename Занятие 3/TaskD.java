package lilbrary;

import java.util.Arrays;
import java.util.Scanner;

public class TaskD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� ������ ������ �������:");
		int size = scanner.nextInt();
		int[] MyMassiv = new int[size];
		int[] MyMassiv2 = new int[size];
		int i = 0;
		while (i < size) {
			int random = (int) (Math.random() * 100);
			MyMassiv[i] = random;
			i++;
		}
		System.out.println("��� ������ = " + Arrays.toString(MyMassiv));
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("�������� � ��������:");
		System.out.println("������� ������ � ������(��� �������) � �������� ������� - ������� 1");
		System.out.println("���������� ��� �������� ������� ����� ����� - ������� 2");
		System.out.println("�������� ������ 3-� ������� ������� �� 3 - ������� 3");
		System.out.println("������� ���������� ������� ��������� - ������� 4");
		System.out.println("������� ������ ����� � �������� ���������� - ������� 5");
		System.out.println("�������� �������� �������� ����� ����� - ������� 6");
		System.out.println("�������� �������� ������� �������(������ �� ��������� � �.�) - ������� 7");
		System.out.println("������� ����������� � ������������ �������� ������� � �� ������ - ������� 8");
		System.out.println("��������� ������ �� ���������� ������������������ - ������� 9");
		System.out.println("�������� ��� �������� �� ��������� �������� ��������� -  - ������� 10");
		System.out.println("�������� �������� ������� ������ - ������� 11");
		System.out.print("������� ����� ��������� �������� � ��������:");
		int operation = scanner2.nextInt();

		switch (operation) {
		case 1:
			PrintElements(MyMassiv);
			break;
		case 2:
			PowElements(MyMassiv);
			break;
		case 3:
			PowThreeElements(MyMassiv);
			break;
		case 4:
			NumberZeroElements(MyMassiv);
			break;
		case 5:
			NumberZero2(MyMassiv);
			break;
		case 6:
			ChangeElements2(MyMassiv, MyMassiv2);
			break;
		case 7:
			ChangeElementsLast(MyMassiv);
			break;
		case 8:
			MinMaxElements(MyMassiv);
			break;
		case 9:
			TrueOrFalse(MyMassiv);
			break;
		case 10:
			PartSum(MyMassiv);
			break;
		case 11:
			ShiftElements(MyMassiv, MyMassiv2);
			break;
		default:
			break;
		}

	}

	public static void PrintElements(int anyMas[]) {
		System.out.print("��� ������(�������� �������) = [");
		for (int a = anyMas.length - 1; a >= 0; a--) {
			System.out.print(anyMas[a] + ", ");
		}

		System.out.print("]");
	}

	public static void PowElements(int PowMassiv[]) {
		long pow = 1;
		for (int i = 0; i < PowMassiv.length; i++) {
			pow = pow * PowMassiv[i];
		}
		System.out.print("������������ ���� ��������� ������� = " + pow);
	}

	public static void PowThreeElements(int[] anyMas) {
		for (int a = 2; a < anyMas.length; a += 3) {
			anyMas[a] *= 3;
		}
		System.out.println("������ ������ ������� ������� ������� �� 3 = " + Arrays.toString(anyMas));
	}

	public static void NumberZeroElements(int[] anyMas) {
		int zero = 0;
		for (int a = 0; a < anyMas.length; a++) {
			if (anyMas[a] == 0) {
				zero += 1;
				continue;
			}
		}
		if (zero == 0) {
			System.out.println("� ����� ������� ����� ���!");
		} else
			System.out.println("����� �����: " + zero);
		{
		}
	}

	public static void NumberZero2(int[] anyMas) {
		int zero = 0;
		for (int a = 0; a < anyMas.length; a++) {
			if (anyMas[a] == 0) {
				zero += 1;
				System.out.println("������ �: " + a);
				continue;
			}
		}
		if (zero == 0) {
			System.out.println("����� ���!");
		}
	}

	public static void ChangeElements2(int[] anyMas, int[] anyMas2) {
		for (int a = 1; a < anyMas2.length; a += 2) {
			anyMas2[a - 1] = anyMas[a];
		}
		for (int b = 0; b < anyMas2.length; b += 2) {
			if (b == anyMas2.length - 1) {
				anyMas2[b] = anyMas[b];
				break;
			}
			anyMas2[b + 1] = anyMas[b];
		}
		System.out.print("�������� �������� ������� �������� �������: " + Arrays.toString(anyMas2));
	}

	public static void ChangeElementsLast(int[] anyMas) {
		System.out.print("������ � �������� �������: [");
		for (int a = anyMas.length - 1; a >= 0; a--) {
			System.out.print(anyMas[a] + ", ");
		}
		System.out.print("] ");
	}

	public static void MinMaxElements(int[] anyMas) {
		int numbermin = 0;
		int numbermax = 0;
		int max = 0;
		for (int a = 0; a < anyMas.length; a++) {
			if (anyMas[a] >= max) {
				max = anyMas[a];
				numbermax = a;
			}

		}
		int min = anyMas[0];
		for (int a = 0; a < anyMas.length; a++) {
			if (anyMas[a] < min) {
				min = anyMas[a];
				numbermin = a;
			}

		}
		System.out.println("����� ������ ������������� ����� - " + numbermax + " ������������ ����� - " + max);

		System.out.println("����� ������ ������������ ����� - " + numbermin + " ����������� ����� - " + min);
	}

	public static void TrueOrFalse(int[] anyMas) {
		int c = 0;
		boolean result = true;
		for (int a = 0; a < anyMas.length; a++) {

			if (anyMas[a] >= c) {
				c = anyMas[a];
				result = true;
			}

			else if (anyMas[a] < c) {
				result = false;
				break;
			}
		}
		if (result == true) {
			System.out.println("������ ����������������: " + Arrays.toString(anyMas));
		} else {
			System.out.println("������ �� ����������������: " + Arrays.toString(anyMas));
		}
	}

	public static void PartSum(int[] anyMas) {
		for (int a = 1; a < anyMas.length; a++) {
			if (a == anyMas.length - 1) {
				break;
			}
			anyMas[a] = (anyMas[a - 1] / 2) + (anyMas[a + 1] / 2);
		}
		System.out
				.println("��������� �������� ���������(� ������ ������������ ����������): " + Arrays.toString(anyMas));
	}

	public static void ShiftElements(int[] anyMas, int[] anyMas2) {
		for (int a = 2; a < anyMas2.length; a++) {
			anyMas2[a] = anyMas[a - 2];
		}
		System.out.print("����� ������� ������: " + Arrays.toString(anyMas2));
	}

}
