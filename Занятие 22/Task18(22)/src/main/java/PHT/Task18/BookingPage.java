package PHT.Task18;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingPage {
	private WebDriver booking;
	private WebDriverWait wait;

	@FindBy(xpath = "//*[@id=\"ss\"]")
	private WebElement writeCountry;

	@FindBy(xpath = "//span[@ class=\"sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb\"]")
	private WebElement clickDates;

	@FindBy(xpath = "//td[@ data-date=\"2019-04-10\"]")
	private WebElement dataOut;

	@FindBy(xpath = "//td[@ data-date=\"2019-04-20\"]")
	private WebElement dataIn;

	@FindBy(xpath = "//button[@ class=\"sb-searchbox__button  \"]")
	private WebElement buttonFindPrices;

	@FindBy(xpath = "//*[@id=\"hotellist_inner\"]/div[2]")
	private List<WebElement> listHotels;

	@FindBy(xpath = "//*[contains(text(), 'Звезды') ]")
	private WebElement sort;

	@FindBy(xpath = "//div[@ class=\"sr-usp-overlay sr-usp-overlay--wide\"]")
	private List<WebElement> forWait;

	@FindBy(xpath = "//li[@ class=\"class sort_suboption_outer \"]")
	private WebElement maxStairs;

	@FindBy(xpath = "(//div [@ class=\"bui-review-score__badge\"])[1]")
	private WebElement rating;

	public BookingPage(WebDriver booking) {
		PageFactory.initElements(booking, this);
		this.booking = booking;
	}

	public void changeContry(String country) {
		writeCountry.sendKeys(country);
		clickDates.click();
		dataOut.click();
		dataIn.click();
		buttonFindPrices.click();

	}

	public boolean listIsEmpty() {
		return listHotels.isEmpty();
	}

	public int maxStairs() {
		wait = new WebDriverWait(booking, 5000);
		sort.click();
		maxStairs.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(forWait));

		forWait();
		wait.until(ExpectedConditions.elementToBeClickable(rating));
		return Integer.parseInt(rating.getText().replaceAll("[^0-9]+", ""));
	}

	private void forWait() {
		if (!forWait.isEmpty()) {
			forWait();
		}
	}

}
