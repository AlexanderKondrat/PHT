package MailFramework;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import Sigleton.MailSingleton;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	WebDriver mail;
	MailPage page;

	@Given("^I am on a page \"([^\"]*)\"$")
	public void openBrowserAndURL(String URL) {
		mail = MailSingleton.getInstanse();
		mail.get(URL);
		mail.manage().window().maximize();
		page = new MailPage(mail);

	}

	@Then("^I see the enter button$")
	public void enterbutton() {
		page.whatWait(page.exitSuccessfully);
		Assert.assertTrue(page.exitSuccessfully.isDisplayed());
	}

	@When("^I input login and password \"([^\"]*)\" \"([^\"]*)\"$")
	public void enterToAccountPage(String login, String password) {
		page.enterToAccount(login, password);
	}

	@Then("^I see a error$")
	public void enterError() {
		Assert.assertTrue(page.enterError.isDisplayed());
	}

	@Then("^I enter to account$")
	public void enterSuccessfully() {
		page.whatWait(page.writeMessageButton);
		Assert.assertTrue(page.enterSuccessfully.isDisplayed());
	}

	@When("^I click at exit$")
	public void exitFromAccountPage() {
		page.exitFromAccount();

	}

	@When("^I send message \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void sendMessageCorrectPage(String recepiete, String topic, String text) {
		page.sendMessageCorrect(recepiete, topic, text);

	}

	@Then("^I see message sent$")
	public void sentMessageSuccessfully() {
		page.whatWait(page.sendMessageSuccessfully);
		Assert.assertTrue(page.sendMessageSuccessfully.isDisplayed());
	}

	@Then("^I see message doesn't sent$")
	public void sentMessageError() {
		Assert.assertNotNull(page.errorAlert());
	}

	@When("^I sent letter in Spam$")
	public void letterInSpamPage() {
		page.letterInSpam();
	}

	@Then("^I see that send/delete successully$")
	public void sentMessageInOutSuccessfylly() {
		page.whatWait(page.InOutSpamSuccessfuly);
		Assert.assertTrue("No letters", page.InOutSpamSuccessfuly.isDisplayed());
	}

	@When("^I sent letter from Spam$")
	public void LetterOutSpamPage() {
		page.LetterOutSpam();

	}

	@When("^I check and uncheck all letters$")
	public void CheckUncheckAllLettersPage() {
		page.CheckUncheckAllLetters();

	}

	@When("^I delete letter$")
	public void DeleteLastMessagePage() {
		page.DeleteLastMessage();

	}

	@When("^I check new letter$")
	public void CheckNewLetterPage() {
		page.CheckNewLetter();
	}

	@Then("^I see that head's letter$")
	public void newMessageHead() {
		Assert.assertTrue("Not new message", page.headLetter.isDisplayed());
	}

	@And("^I exit$")
	public void exit() {
		mail.quit();
		mail = MailSingleton.delInstanse();

	}
}
