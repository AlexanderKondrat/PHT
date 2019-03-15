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
		return null;
	}

	public ArrayList<String> findName(char firstchar) {
		ArrayList<String> findNames = new ArrayList<String>();
		for (String i : names) {
			if (i.charAt(0) == firstchar) {
				findNames.add(i);
			}
		}
		if (!findNames.isEmpty()) {
			return findNames;
		}
		return null;
	}

	public String maxNames() {
		String maxName = "";
		for (String i : names) {
			if (i.length() >= maxName.length()) {
				maxName = i;
			}
		}

		return maxName;
	}

	public String minNames() {
		String minName = names.get(0);
		for (String i : names) {
			if (i.length() <= minName.length()) {
				minName = i;
			}
		}

		return minName;
	}

	public String toLower(int index) {

		return names.get(index).toLowerCase();
	}

	public String toUpper(int index) {

		return names.get(index).toUpperCase();
	}

}