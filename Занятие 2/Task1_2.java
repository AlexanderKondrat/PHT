package library;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_2 {
	public static void main(String[] args) {
System.out.println ("Пять случайных чисел");

int size =5;
int [] MyMassiv = new int[size];
int [] MyMassiv2 = new int[size];
int d1=1;
int d2=100;
int Yacheika=0;
int Yacheika2=5;
while (Yacheika <5)  {
	int random = (int) ( Math.random() * d2 );		
	MyMassiv[Yacheika] = random;
	Yacheika++;
if (Yacheika2>-1) {Yacheika2--; MyMassiv2[Yacheika2] = random;}
}
System.out.println("Массив = "+ Arrays.toString(MyMassiv));
System.out.println("Массив(Обратный порядок) = " + Arrays.toString(MyMassiv2));
}
}