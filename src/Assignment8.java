import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// Selecting auto suggestive dropdown
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("United");
		Thread.sleep(3000);
		
		List<WebElement> lst=driver.findElements(By.cssSelector("ul[id='ui-id-1'] li"));

		
		for (WebElement option : lst) {

			if (option.getText().equalsIgnoreCase("United States (USA)")) {
				option.click();
				break; // stop after clicking India
			}
		}
		}
		
		

	}


