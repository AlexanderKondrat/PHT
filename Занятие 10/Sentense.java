package homework;

class Sentense extends Basic {
	protected static String sortSentense(String sentenses) { // one basic
		String[] split = sentenses.split("!|\\.|\\?");
		Word.sortWord(split);
		sentenses = split.toString();
		return sentenses;
	}
}