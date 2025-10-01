import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmanzonInterviewQuestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		int count=0,i;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] veggies= {"Cucumber","Brocolli","Beetroot"};
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(i=0;i<products.size();i++)
		{
			
			String[] itemBeforeSplit=products.get(i).getText().split("-");
			String itemAfterSplit=itemBeforeSplit[0].trim();
			List itemNeeded=Arrays.asList(veggies);
			
			if(itemNeeded.contains(itemAfterSplit))
			{
				count++;
				
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				if(count==itemNeeded.size())
				{
					break;
				}
				
			}
		}
	}

}
