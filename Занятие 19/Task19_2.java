package tests;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task19_2 {
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
		booking.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	@Test
	public void Booking() throws InterruptedException {

		WebElement search = booking.findElement(By.xpath("//input [@ type=\"search\"]"));
		search.sendKeys("Париж");
		WebElement findprices = booking.findElement(By.xpath("//button [@ class=\"sb-searchbox__button  \"]"));
		Thread.sleep(3000);
		findprices.click();

		WebElement tableMonth = booking.findElement(By.xpath("(//table [@ class=\"c2-month-table\"])[1]"));
		WebElement today = booking.findElement(By.xpath("//td[contains(@ class,'c2-day-s-today')]"));
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

		Select selectAdults = new Select(booking.findElement(By.xpath("//select[@name=\"group_adults\"]")));
		selectAdults.selectByValue("4");
		Select selectRooms = new Select(booking.findElement(By.xpath("//select[@name=\"no_rooms\"]")));
		selectRooms.selectByValue("2");

		WebElement showPrices = booking.findElement(By.xpath("//span[@ class=\"b-button__text\" ]"));
		showPrices.click();
		Thread.sleep(3000);

		WebElement minPrices = booking.findElement(By.xpath("//*[@id=\"sort_by\"]/ul/li[2]/a"));
		minPrices.click();
		Thread.sleep(3000);
		List<WebElement> pages = booking
				.findElements(By.xpath("//a[@class=\"bui-pagination__link sr_pagination_link\"]"));
		WebElement last = booking.findElement(
				By.xpath("(//a[@class=\"bui-pagination__link sr_pagination_link\"])[" + lastPage(pages) + "]"));
		last.click();
		Thread.sleep(2000);
		List<WebElement> hotelsPrices = booking.findElements(By.xpath("//div[contains(@ data-link,'B')]"));
		maxPrice(hotelsPrices).click();

		Thread.sleep(3000);
		booking.switchTo().window(changeWindow(booking.getWindowHandles()));

		Select selectRoom = new Select(
				booking.findElement(By.xpath("//*[@id=\"hprt-form\"]/table/tbody/tr[1]/td[5]/div/label/select")));
		selectRoom.selectByValue("4");

		WebElement booKing = booking.findElement(By.xpath("//*[@id=\"b_tt_holder_2\"]/span"));
		booKing.click();
		Thread.sleep(3000);

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

	private String changeWindow(Set<String> windows) {
		String activeWindow = "";
		for (String i : windows) {
			activeWindow = i;
		}
		return activeWindow;
	}

	private WebElement maxPrice(List<WebElement> hotelsPrice) {
		int maxPrice = 200000;
		int minPrice = 10000;
		WebElement hotelReturn = null;
		for (WebElement price : hotelsPrice) {
			int different = Integer.parseInt(price.getText().substring(34, 41).replaceAll(" ", ""));

			System.out.println(different);
			if (different < maxPrice && different > minPrice) {
				maxPrice = different;
				hotelReturn = price;
			}

		}
		return hotelReturn;
	}

	private String lastPage(List<WebElement> pages) {
		String last = "";
		int lastPage = 0;
		for (WebElement page : pages) {
			lastPage++;
		}
		last += lastPage;
		return last;
	}

}
