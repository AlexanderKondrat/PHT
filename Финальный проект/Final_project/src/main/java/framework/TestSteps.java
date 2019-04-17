package framework;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.xml.sax.SAXException;

import auxiliary.Fields;
import auxiliary.MailSingleton;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.yandex.qatools.allure.annotations.Step;

public class TestSteps {
	private WebDriver mail;
	private MailPage page;
	Fields field = new Fields();
	
	

	@Given("^I am on a page$")
	@Step
	public void openBrowserAndURL() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		mail = MailSingleton.getInstanse();
		mail.get(auxiliary.DomParser.getXML("URL"));
		mail.manage().window().maximize();
		page = new MailPage(mail);
		

	}

	@Then("^I see the enter button$")
	@Step
	public void enterbutton() {
		page.whatWait(page.exitSuccessfully);
		Assert.assertTrue(page.exitSuccessfully.isDisplayed());
	}

	@When("^I input login and password$")
	@Step
	public void enterToAccountPage() {
		page.enterToAccount(MailSingleton.getDatabase(field.getLogin()),
				MailSingleton.getDatabase(field.getPassCorr()));
	}

	@When("^I input not correct login and password$")
	@Step
	public void enterToAccountPageNC() {
		page.enterToAccount(MailSingleton.getDatabase(field.getLoginNotCor()),
				MailSingleton.getDatabase(field.getPassNotCorr()));
	}

	@Then("^I see a error$")
	@Step
	public void enterError() {
		page.whatWait(page.enterError);
		Assert.assertTrue(page.enterError.isDisplayed());
	}

	@Then("^I enter to account$")
	@Step
	public void enterSuccessfully() {
		page.whatWait(page.writeMessageButton);
		Assert.assertTrue(page.enterSuccessfully.isDisplayed());
	}

	@When("^I click at exit$")
	@Step
	public void exitFromAccountPage() {
		page.exitFromAccount();

	}

	@When("^I send message$")
	@Step
	public void sendMessageCorrectPage()
			throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		page.sendMessageCorrect(MailSingleton.getDatabase(field.getLoginS()), auxiliary.DomParser.getXML("Topic"),
				auxiliary.DomParser.getXML("Text"));
	}

	@When("^I send not correct message$")
	@Step
	public void sendMessageCorrectPagePlus()
			throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		page.sendMessageCorrect(MailSingleton.getDatabase(field.getLoginNotCor()), auxiliary.DomParser.getXML("Topic"),
				auxiliary.DomParser.getXML("Text"));
	}

	@Then("^I see message sent$")
	@Step
	public void sentMessageSuccessfully() {
		page.whatWait(page.sendMessageSuccessfully);
		Assert.assertTrue(page.sendMessageSuccessfully.isDisplayed());
	}

	@Then("^I see message alert doesn't sent$")
	@Step
	public void sentMessageError() {
		Assert.assertNotNull(page.errorAlert());
	}

	@Then("^I see message doesn't sent$")
	@Step
	public void sentMessageErrorPlus() {
		page.whatWait(page.sendMessageError);
		Assert.assertTrue(page.sendMessageError.isDisplayed());
	}

	@When("^I sent letter in Spam$")
	@Step
	public void letterInSpamPage() {
		page.letterInSpam();
	}

	@Then("^I see that send/delete successully$")
	@Step
	public void sentMessageInOutSuccessfylly() {
		page.whatWait(page.InOutSpamSuccessfuly);
		Assert.assertTrue("No letters", page.InOutSpamSuccessfuly.isDisplayed());
	}

	@When("^I sent letter from Spam$")
	@Step
	public void LetterOutSpamPage() {
		page.LetterOutSpam();

	}

	@When("^I check and uncheck all letters$")
	@Step
	public void CheckUncheckAllLettersPage() {
		page.CheckUncheckAllLetters();

	}

	@When("^I delete letter$")
	@Step
	public void DeleteLastMessagePage() {
		page.DeleteLastMessage();

	}

	@When("^I check new letter$")
	@Step
	public void CheckNewLetterPage() {
		page.CheckNewLetter();
	}

	@Then("^I see that head's letter$")
	@Step
	public void newMessageHead() {
		page.whatWait(page.headLetter);
		Assert.assertTrue("Not new message", page.headLetter.isDisplayed());
	}

	@And("^I exit$")
	@Step
	public void exit() {
		mail.quit();
		mail = MailSingleton.delInstanse();

	}

}
