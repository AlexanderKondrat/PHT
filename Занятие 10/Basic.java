package homework;

import java.util.ArrayList;

class Basic extends Example {
	protected static ArrayList<String> sortBasic(ArrayList<String> basic) {
		for (String i : basic) {

			Sentense.sortSentense(i);
			int index = basic.indexOf(i);
			basic.set(index, Sentense.sortSentense(i));
		}
		return basic;

	}
}