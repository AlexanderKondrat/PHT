package library;

public class Dop2 {

	public static void main(String[] args) {
		int MyMassiv[] = new int[10];
		int a = 50;
		for (int i = 0; i < MyMassiv.length; i++) {
			int random = (int) (Math.random() * a);
			MyMassiv[i] = random;
		}
//task1
		for (int i = 1; i < MyMassiv.length; i++) {
			int element = MyMassiv[i];
			int c = i - 1;
			while (c >= 0 && MyMassiv[c] > element) {
				MyMassiv[c + 1] = MyMassiv[c];
				MyMassiv[c] = element;
				c--;
			}
		}		
		
	}

}
