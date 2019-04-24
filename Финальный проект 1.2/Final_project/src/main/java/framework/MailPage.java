package framework;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailPage {
	private WebDriver mail;
	private WebDriverWait wait;

	@FindBy(xpath = "//input[@id=\"mailbox:login\"]")
	WebElement login;

	@FindBy(xpath = "//input[@id=\"mailbox:password\"]")
	WebElement password;

	@FindBy(xpath = "//input[@class=\"o-control\"]")
	WebElement enterButton;

	@FindBy(xpath = "//a[@ id=\"PH_logoutLink\"]")
	WebElement exitLink;

	@FindBy(xpath = "//a [@ id=\"PH_authLink\"]")
	WebElement exitSuccessfully;

	@FindBy(xpath = "//div[@ id=\"mailbox:error\"]")
	WebElement enterError;

	@FindBy(xpath = "//i[@id=\"PH_user-email\"]")
	WebElement enterSuccessfully;

	@FindBy(xpath = "//a[@data-bem=\"b-toolbar__btn\"]")
	WebElement writeMessageButton;

	@FindBy(xpath = "//div [@ class=\"b-input b-input_textarea js-compose-labels js-input compose__labels compose__labels_placehold-on-suggest b-contact-container\"]")
	WebElement recepietesMessage;

	@FindBy(xpath = "//input[@class=\"b-input\"]")
	WebElement topicMessage;

	@FindBy(xpath = "//iframe[contains(@id, 'composeEditor_ifr')]")
	WebElement frameMessage;

	@FindBy(xpath = "//body[@ id=\"tinymce\"]")
	WebElement textMessage;

	@FindBy(xpath = "//div [@ data-name=\"send\"]")
	WebElement sendMessageButton;

	@FindBy(xpath = "//div[@class=\"message-sent__title\"]")
	WebElement sendMessageSuccessfully;

	@FindBy(xpath = "//a[@ rel=\"history\"] //div[@ class=\"b-checkbox__box\"]")
	List<WebElement> allLetters;

	@FindBy(xpath = "//div[@ data-name=\"spam\"]")
	WebElement spamButton;

	@FindBy(xpath = "//span [@class=\"js-txt _js-title notify-message__title__text notify-message__title__text_ok\"]")
	WebElement InOutSpamSuccessfuly;

	@FindBy(xpath = "(//span[@class=\"b-nav__item__text\"])[4]")
	WebElement sectionSpam;

	@FindBy(xpath = "//div[@ data-name=\"noSpam\"]")
	WebElement noSpamButton;

	@FindBy(xpath = "(//div[@ class=\"b-checkbox__box\"])[1]")
	WebElement checkboxMainOn;
	@FindBy(xpath = "(//div[@ class=\"b-checkbox__checkmark\"])[1]")
	WebElement checkboxMainOff;

	@FindBy(xpath = "//div[@ data-name=\"remove\"]")
	WebElement deleteButton;

	@FindBy(xpath = "//div[@ class=\"b-datalist__item js-datalist-item b-datalist__item_unread\"]")
	WebElement openNewMessage;

	@FindBy(xpath = "//div[@ data-name=\"remove\"]")
	WebElement allertError;
	@FindBy(xpath = "//span [@ class=\"js-txt _js-title notify-message__title__text notify-message__title__text_error\"]")
	WebElement sendMessageError;

	@FindBy(xpath = "//div[@ class=\"b-letter__head b-letter__head_threads\"]")
	WebElement headLetter;

	public MailPage(WebDriver mail) {
		PageFactory.initElements(mail, this);
		this.mail = mail;
	}

	public void enterToAccount(String log, String pass) { 
		login.sendKeys(log);
		password.sendKeys(pass);
		enterButton.click();
	}

	public void exitFromAccount() {
		exitLink.click();

	}

	public void sendMessageCorrect(String recepiete, String topic, String text) {
		writeMessageButton.click();
		whatWait(recepietesMessage);
		topicMessage.click();;
		recepietesMessage.sendKeys(recepiete);
		topicMessage.sendKeys(topic);
		String parentWindow = mail.getWindowHandle();
		mail.switchTo().frame(frameMessage);
		textMessage.sendKeys(text);
		mail.switchTo().window(parentWindow);
		sendMessageButton.click();

	}

	public void letterInSpam() {
		findLastLetter(allLetters).click();
		spamButton.click();
	}

	public void LetterOutSpam() {
		sectionSpam.click();
		findLastLetter(allLetters).click();
		noSpamButton.click();

	}

	public void CheckUncheckAllLetters() {
		checkboxMainOff.click();
		checkboxMainOn.click();

	}

	public void DeleteLastMessage() {
		findLastLetter(allLetters).click();
		deleteButton.click();

	}

	public void CheckNewLetter() {
		openNewMessage.click();
	}

	public WebElement findLastLetter(List<WebElement> listLetters) {
		WebElement lastLetter = null;
		for (WebElement letter : allLetters) {
			lastLetter = letter;
		}
		return lastLetter;
	}

	public String errorAlert() {
		String alertError = null;
		for (String window : mail.getWindowHandles()) {
			alertError = window;
		}
		return alertError;
	}

	public void whatWait(WebElement element) {
		wait = new WebDriverWait(mail, 25);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
