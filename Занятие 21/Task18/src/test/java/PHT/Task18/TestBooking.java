package PHT.Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBooking {
	private WebDriver booking;
	private BookingPage page;

	@BeforeMethod
	public void start() {
		booking = new ChromeDriver();
		booking.get("https://www.booking.com");
		page = new BookingPage(booking);
	}

	@Test
	public void testBooking() {
		page.changeContry("Москва, Россия");
		Assert.assertFalse(page.listIsEmpty(), "Hotels not found");
		Assert.assertTrue(page.maxStairs() >= 90, "Raiting down 9");

	}

	@AfterMethod
	public void exit() {
		booking.quit();
	}

}
