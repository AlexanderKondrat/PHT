package homework;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExampleJUnir {

	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		WebElement country = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		country.sendKeys("Москва, Россия");
		WebElement data = driver
				.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span/i"));
		data.click();
		WebElement in = driver.findElement(
				By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[2]/td[1]"));
		in.click();
		WebElement out = driver.findElement(
				By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[6]"));
		out.click();
		WebElement findPrice = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]"));
		findPrice.click();

		Assert.assertFalse(driver.findElements(By.xpath("//*[@id=\"hotellist_inner\"]/div[2]")).isEmpty());
		WebElement sort = driver.findElement(By.xpath("//*[@id=\"sort_by\"]/ul/li[3]/a"));
		sort.click();
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement raiting = driver.findElement(
				By.xpath("//*[@id=\"hotellist_inner\"]/div[2]/div[2]/div[1]/div[2]/div/div/a[1]/div/div[1]"));
		Assert.assertTrue(raiting.getText().matches("[910]+"));
		driver.close();

	}

}
