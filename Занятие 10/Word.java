package homework;

class Word extends Sentense {
	protected static String[] sortWord(String[] sentenses) {

		for (int i = 0; i < sentenses.length; i++) {
			String stroka = sentenses[i].toString();
			String[] split = stroka.split(",|\\:|\\;|\\ ");
			for (int e = 0; e < split.length; e++) {
				char[] mas = split[e].toCharArray();

				for (int g = 0; g < mas.length; g++) {
					if ((g + 1) == Example.number) {
						mas[g] = '%';
					}
				}
				split[e] = mas.toString();
			}
			sentenses[i] = split.toString();
		}
		return sentenses;
	}
}
