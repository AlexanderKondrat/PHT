package tests;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task19 {
	String numberDeparture = "";
	String numberReturnBack = "";
	String numberMonthDeparture = "";
	String numberMonthReturn = "";
	WebDriver booking;

	@BeforeMethod
	public void start() {
		booking = new ChromeDriver();
		booking.get("http://www.booking.com");
		booking.manage().window().maximize();
	}

	@Test
	public void Booking() throws InterruptedException {

		WebElement search = booking.findElement(By.xpath("//input [@ type=\"search\"]"));
		search.sendKeys("Париж");
		WebElement findprices = booking.findElement(By.xpath("//button [@ class=\"sb-searchbox__button  \"]"));
		Thread.sleep(3000);
		findprices.click();

		WebElement tableMonth = booking.findElement(By.xpath("(//table [@ class=\"c2-month-table\"])[1]"));

		WebElement today = booking.findElement(By.xpath("//td[contains(@ class, 'today')] //span"));
		changeMonth(tableMonth.getText(), today.getText());
		String xpaths = "((//table [@ class=\"c2-month-table\"])[" + numberMonthDeparture + "] //span)["
				+ numberDeparture + "]";
		WebElement departure = booking.findElement(By.xpath(xpaths));
		departure.click();

		WebElement clickBack = booking
				.findElement(By.xpath("//*[@id=\"frm\"]/div[3]/div/div[1]/div[2]/div/div/div[1]/div/div[2]"));
		clickBack.click();

		xpaths = "((//table[@ class=\"c2-month-table\" ])[" + numberMonthReturn + "] //span)[" + numberReturnBack + "]";
		WebElement back = booking.findElement(By.xpath(xpaths));
		back.click();

		WebElement showPrices = booking.findElement(By.xpath("//span[@ class=\"b-button__text\" ]"));
		showPrices.click();
		Thread.sleep(3000);

		WebElement minPrices = booking.findElement(By.xpath("//*[@id=\"sort_by\"]/ul/li[2]/a"));
		minPrices.click();
		List<WebElement> hotelsIsExist = booking.findElements(By.xpath("//div[@ data-hotelid]"));
		Assert.assertFalse(hotelsIsExist.isEmpty());
		Thread.sleep(3000);
		List<WebElement> hotelRaiting = booking.findElements(By.xpath("//div [@ class=\"bui-review-score__badge\"]"));
		Assert.assertFalse(hotelRaiting.isEmpty());

		sortHotelRaiting(hotelRaiting).click();

		booking.switchTo().window(changeWindow(booking.getWindowHandles()));

		List<WebElement> placesFree = booking.findElements(By.xpath("(//span[contains(text(),'BYN')])[1]"));
		Assert.assertFalse(placesFree.isEmpty(), "NO PLACES");
		maxPrice(placesFree);

	}

 @AfterMethod
	public void exit() {
	 booking.quit();
	}

	private void changeMonth(String month, String tod) {
		String[] split = month.trim().split(" ");
		int maxDay = 31;
		int lastDayMonth = Integer.parseInt(split[split.length - 1]);
		int today = Integer.parseInt(tod);
		while (lastDayMonth != maxDay) {
			maxDay--;
		}
		if ((today + 3) > maxDay) {
			numberDeparture += (today + 3) - maxDay;
			numberMonthDeparture += 2;
		} else {
			numberDeparture += today + 3;
			numberMonthDeparture += 1;
		}
		if ((today + 10) > maxDay) {
			numberReturnBack += (today + 10) - maxDay;
			numberMonthReturn += 18;
		} else {
			numberReturnBack += today + 10;
			numberMonthReturn += 17;
		}

	}

	private WebElement sortHotelRaiting(List<WebElement> hotelRaiting) {
		int raiting = 0;
		WebElement elementReturn = null;
		for (WebElement element : hotelRaiting) {
			int different = Integer.parseInt(element.getText().replaceAll(",", ""));
			if (different >= raiting) {
				raiting = different;
				elementReturn = element;

			}

		}
		return elementReturn;
	}

	private String changeWindow(Set<String> windows) {
		String activeWindow = "";
		for (String i : windows) {
			activeWindow = i;
		}
		return activeWindow;
	}

	private void maxPrice(List<WebElement> placesFree) {
		int maxPrice = 1200;
		for (WebElement price : placesFree) {
			int different = Integer.parseInt(price.getText().replaceAll(".[^0-9]+", ""));
			if (different > maxPrice) {
				fail("Exceeded the maximum range");
			}

		}

	}
}
