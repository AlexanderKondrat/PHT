package library;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_1 {
	public static void main(String[] args) {
System.out.print ("������� ������ ������� - ");
		Scanner click = new Scanner(System.in);
int user = click.nextInt();
System.out.println ("P����� ������� = "+user);
	
int [] MyMassiv = new int[user];
int [] MyMassiv2 = new int[user];
int Yacheika=0;
int Yacheika2=user;
System.out.println ("������� "+user+" ����� ��� ���������� �������");
while (Yacheika <MyMassiv.length)  {
	Scanner click2 = new Scanner(System.in);
	int user2 = click2.nextInt();	
	MyMassiv[Yacheika] = user2;
	Yacheika++;
if (Yacheika2>0) {Yacheika2--; MyMassiv2[Yacheika2] = user2;}
}
System.out.println("��� ������ = "+ Arrays.toString(MyMassiv));
System.out.println("��� ������(�������� �������) = " + Arrays.toString(MyMassiv2));
}
}