package library;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskD2 {
	public static void main(String[] args) {
		ArrayList<Integer> MyMassiv = new ArrayList<>();
		MyMassiv.add(25);
		MyMassiv.add(4);
		MyMassiv.add(34);
		MyMassiv.add(65);
		MyMassiv.add(44);
		MyMassiv.add(98);
		System.out.println("Исходный массив: " + MyMassiv);
		System.out.print("Измененный массив: ");
		for (int i : MyMassiv) {
			System.out.print(i + 5 + " ");
		}
		System.out.println();

		for (int i = 0; i < MyMassiv.size(); i++) {
			MyMassiv.remove(i);
			System.out.println(MyMassiv);
		}
		MyMassiv.clear();
		System.out.println("Все элементы массива удалены.");

	}
}
