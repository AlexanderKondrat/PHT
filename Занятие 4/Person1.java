package library;

public class Person {
public String name;
public String surname;	
public int age;	
public String phone;	


public void printAllInformation() {
System.out.println("Ваше имя - "+this.name+" Ваша Фамилия - "+this.surname+" Ваш возраст - "+this.age+" Ваш телефон - "+this.phone);
}
public void setprintAllInformation(String name, String surname, int age, String phone) {
this.name = name;
this.surname = surname;
this.age = age;
this.phone = phone;
}

public void printName() {
	System.out.println("Ваше имя - "+this.name+" Ваша Фамилия - "+this.surname);
}

public boolean isAdult() {
	return age>18;}



}
