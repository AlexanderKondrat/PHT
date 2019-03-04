package homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Button> array = new ArrayList<Button>();
		LinkedList<Field> linked = new LinkedList<Field>();
		HashSet<Label> hashset = new HashSet<Label>();
		Page page = new Page();
		page.aList(array);
		page.aLinked(linked);
		page.aHash(hashset);
		page.dList(array);
		page.dLinked(linked);
		page.dHash(hashset);
		page.sList(array);
		page.sLinked(linked);
		page.sHash(hashset);
		System.out.println(page.array + " " + page.linked + " " + page.hashset);

	}

}
