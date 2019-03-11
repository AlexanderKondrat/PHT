package homework;

import java.util.ArrayList;

public class Massive {
	private ArrayList<String> names = new ArrayList<String>();

	public String addName(String name) {
		if (!name.isEmpty()) {
			names.add(name);
			return "Name added";
		}
		return "Empty name!";
	}

	public String setName(int number, String newname) {

		if (!newname.isEmpty()) {
			String oldname = names.get(number);
			names.set(number, newname);

			return "Name - " + oldname + " replaced by " + newname;
		}
		return "New name is empty";
	}

	public String getName(int number) {
		names.get(number);
		return names.get(number);
	}

	public ArrayList<String> allName() {
		return names;
	}

	public String allClear() {
		names.clear();
		System.out.println(names);
		return null;
	}

}