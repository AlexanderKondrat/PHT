package library;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int MyMassiv[] = new int[15];
		int summa = 0;
		for (int e = 0; e < MyMassiv.length; e++) {
			int random = (int) (Math.random() * 100);
			MyMassiv[e] = random;
		}

		Massiv mymas = new Massiv();
		mymas.setprintMassiveAsLine(MyMassiv);
		mymas.setprintReverseMassiveAsLine(MyMassiv);
		System.out.println("Сумма всех элементов: " + mymas.getSumOfElements(MyMassiv, summa));
		System.out.println("Массив умножен на 3: " + Arrays.toString(mymas.getmultiptyBy3(MyMassiv)));
		mymas.setprintMassiveAsLine(MyMassiv);
		mymas.setprintReverseMassiveAsLine(MyMassiv);
	}

}