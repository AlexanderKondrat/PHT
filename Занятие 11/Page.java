package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Page extends Main {
	ArrayList<Button> array;
	LinkedList<Field> linked;
	HashSet<Label> hashset;
	// HashMap<Dropdown,Dropdown> hashmap;
	float id;
	String title;

	public void aList(ArrayList<Button> array) {
		array.add(new Button("Downland", "ON"));
		array.add(new Button("Sign IN", "ON"));
		this.array = array;
	}

	public void aLinked(LinkedList<Field> linked) {
		linked.add(new Field(5, 21));
		linked.add(new Field(7, 34));
		this.linked = linked;
	}

	public void aHash(HashSet<Label> hashset) {
		hashset.add(new Label("One"));
		hashset.add(new Label("Two"));
		this.hashset = hashset;
	}

	public void dList(ArrayList<Button> array) {
		array.remove(new Button("Downland", "ON"));
		array.remove(new Button("Sign IN", "ON"));
		this.array = array;
	}

	public void dLinked(LinkedList<Field> linked) {
		linked.remove(new Field(5, 21));
		linked.remove(new Field(7, 34));
		this.linked = linked;
	}

	public void dHash(HashSet<Label> hashset) {
		hashset.remove(new Label("One"));
		hashset.remove(new Label("Two"));
		this.hashset = hashset;
	}

	public void sList(ArrayList<Button> array) {
		array.set(0, new Button("Downland", "OFF"));
		array.set(1, new Button("Sign IN", "OFF"));
		this.array = array;
	}

	public void sLinked(LinkedList<Field> linked) {
		linked.set(0, new Field(2, 28));
		linked.set(1, new Field(7, 14));
		this.linked = linked;
	}

	public void sHash(HashSet<Label> hashset) {
		hashset.add(new Label("Three"));
		hashset.add(new Label("Four"));
		this.hashset = hashset;
	}

	public void allPrint() {
		System.out.println(this.array + " " + this.linked + " " + this.hashset);

	}

}
