package Sigleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailSingleton {
	private static WebDriver mail;

	private MailSingleton() {
	}

	public static WebDriver getInstanse() {
		
		if (mail == null) {
			mail = new ChromeDriver();
		}

		return mail;
	}

	public static WebDriver delInstanse() {
		
		if (!(mail == null)) {
			mail = null;
		}

		return mail;
	}	
	
}
