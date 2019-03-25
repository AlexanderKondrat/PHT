package homework;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMail {
	WebDriver mail;
	WebDriverWait wait;
	int index = 0;

	@BeforeMethod
	public void start() {
		mail = new ChromeDriver();
		wait = new WebDriverWait(mail, 15);
		mail.get("http://www.mail.ru");
		mail.manage().window().maximize();
		WebElement login = mail.findElement(By.xpath("//input[@ id=\"mailbox:login\"]"));
		login.sendKeys("your login");
		WebElement password = mail.findElement(By.xpath("//input[@ id=\"mailbox:password\"]"));
		password.sendKeys("your password");
		Select domen = new Select(mail.findElement(By.xpath("// select [@id=\"mailbox:domain\"]")));
		domen.selectByIndex(3);
		WebElement enter = mail.findElement(By.xpath("//input[@ class=\"o-control\"]"));
		enter.click();
		wait.until(ExpectedConditions.titleContains("Входящие"));

	}

	@Test
	public void inSpam() {
		wait.until(ExpectedConditions.visibilityOf(mail.findElement(By.xpath("//div[@class=\"b-datalists\"]"))));
		List<WebElement> letters = mail
				.findElements(By.xpath("//a[@ rel=\"history\"] //div[@ class=\"b-checkbox__box\"]"));
		Assert.assertFalse(letters.isEmpty(), "No letters");
		lastLetterDelete(letters).click();

		WebElement spamButton = mail.findElement(By.xpath("//div[@ data-name=\"spam\"]"));
		spamButton.click();
		Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOf(mail.findElement(By.xpath(
				"//span [@class=\"js-txt _js-title notify-message__title__text notify-message__title__text_ok\"]")))));
	}

	@Test
	public void outSpam() {
		wait.until(ExpectedConditions
				.visibilityOf(mail.findElement(By.xpath("(//span[@class=\"b-nav__item__text\"])[4]")))).click();
		;

		wait.until(ExpectedConditions.visibilityOf(mail.findElement(By.xpath("//div[@class=\"b-datalists\"]"))));
		List<WebElement> letters = mail
				.findElements(By.xpath("//a[@ rel=\"history\"] //div[@ class=\"b-checkbox__box\"]"));
		Assert.assertFalse(letters.isEmpty(), "No letters");
		lastLetterDelete(letters).click();

		WebElement noSpamButton = mail.findElement(By.xpath("//div[@ data-name=\"noSpam\"]"));
		noSpamButton.click();
		Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOf(mail.findElement(By.xpath(
				"//span [@class=\"js-txt _js-title notify-message__title__text notify-message__title__text_ok\"]")))));
	}

	@Test
	public void sendMessage() {
		WebElement writeMessage = mail.findElement(By.xpath("//a[@data-bem=\"b-toolbar__btn\"]"));
		writeMessage.click();
		WebElement toEmail = mail.findElement(By.xpath(
				"//div [@ class=\"b-input b-input_textarea js-compose-labels js-input compose__labels compose__labels_placehold-on-suggest b-contact-container\"]"));
		toEmail.sendKeys("  user1@bk.ru user2@bk.ru user3@bk.ru");
		WebElement topic = mail.findElement(By.xpath("//input[@class=\"b-input\"]"));
		topic.sendKeys("TEST");
		WebElement frame = mail.findElement(By.xpath("//iframe[contains(@id, 'composeEditor_ifr')]"));
		mail.switchTo().frame(frame);
		WebElement letter = mail.findElement(By.xpath("//body[@ id=\"tinymce\"]"));
		letter.sendKeys("Hello, I am test");
		mail.switchTo().defaultContent();
		WebElement send = mail.findElement(By.xpath("//div [@ data-name=\"send\"]"));
		send.click();
		Assert.assertTrue(wait.until(ExpectedConditions.titleContains("Письмо отправлено")));
	}

	@Test
	public void threeLetterssOnOff() {
		wait.until(ExpectedConditions.visibilityOf(mail.findElement(By.xpath("//div[@class=\"b-datalists\"]"))));
		List<WebElement> letters = mail
				.findElements(By.xpath("//a[@ rel=\"history\"] //div[@ class=\"b-checkbox__box\"]"));
		Assert.assertFalse(letters.isEmpty(), "No letters");
		this.index = 0;
		lastLetterDelete(letters).click();

		letters.get(index - 2).click();
		letters.get(index - 3).click();

		wait.until(ExpectedConditions.visibilityOf(mail.findElement(By.xpath("//div[@class=\"b-datalists\"]"))));
		List<WebElement> lettersOff = mail
				.findElements(By.xpath("//div[@ class=\"js-checkbox b-checkbox b-checkbox_checked\"]"));

		Assert.assertFalse(lettersOff.isEmpty(), "No letters");
		for (WebElement check : lettersOff) {
			check.click();
		}

	}

	@AfterMethod
	public void exit() {
		mail.quit();
	}

	public WebElement lastLetterDelete(List<WebElement> letters) {
		WebElement lastLetter = null;

		for (WebElement letter : letters) {
			lastLetter = letter;
			index++;
		}

		return lastLetter;
	}

}
