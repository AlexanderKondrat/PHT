package library;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dop {

	public static void main(String[] args) {
	String g = "My f3";
//task_1
Pattern p =Pattern.compile(".[a-zA-Z].{0,4}");	
Matcher m = p.matcher(g);
System.out.println(m.matches());		
//task_2
Pattern p1 =Pattern.compile(".{0,4}");	
Matcher m1 = p1.matcher(g);
System.out.println(m1.matches());		
				
		
		
	}

	


	
	
}
