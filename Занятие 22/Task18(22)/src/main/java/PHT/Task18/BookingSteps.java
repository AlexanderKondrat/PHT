package PHT.Task18;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingSteps {
	private WebDriver booking;
	private BookingPage page;

	@Given("^I am on a page with url \"([^\"]*)\"$")
	public void start(String URL) {
		booking = new ChromeDriver();
		booking.get(URL);
		page = new BookingPage(booking);
	}

	@When("^I change a country \"([^\"]*)\"$")
	public void change(String country) {
		page.changeContry(country);
	}

	@And("^I am checking free hotels$")
	public void check() {
		Assert.assertFalse("Hotels not found", page.listIsEmpty());
	}

	@Then("^I see a hotel with rating more 9 \"([^\"]*)\"$")
	public void result(int rating) {
		Assert.assertTrue("Rating down 9", page.maxStairs() >= rating);

	}

	@And("^I exit$")
	public void exit() {
		booking.quit();
	}

}
