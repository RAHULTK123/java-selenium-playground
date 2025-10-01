import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select options = new Select(dropdown);
		options.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ProtoCommerce Home")));
		List<WebElement> cart = driver.findElements(By.xpath("//app-card//div//div//button"));

		for (int i = 0; i < cart.size(); i++) {
			cart.get(i).click();
			
		}

		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-success")));
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn.btn-success.btn-lg")));
		driver.findElement(By.id("country")).sendKeys("ind");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".suggestions")));

		List<WebElement> optionn = driver.findElements(By.cssSelector(".suggestions ul li a"));

		for (WebElement option : optionn) {
			System.out.println(option.getText()); // print actual text

			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break; // stop after clicking India
			}
		}
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();

		Assert.assertEquals(driver.findElement(By.xpath("//strong[normalize-space()=\"Success!\"]")).getText(),
				"Success!");

	}

}
