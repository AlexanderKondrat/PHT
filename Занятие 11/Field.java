package homework;

public class Field {
	int id;
	int value;

	public Field(int id, int value) {
		this.id = id;
		this.value = value;
	}

	public String toString()

	{
		return getClass() + " " + this.id + " " + this.value;
	}

}
