

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// Finding the number of rows and columns in the table also printing contents of a specific column
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		Thread.sleep(2000);
		List<WebElement> row=driver.findElements(By.cssSelector("table[name='courses'] tbody tr"));
		List<WebElement> column=driver.findElements(By.cssSelector("table[name='courses'] tbody th"));
		List<WebElement> secondrowvalues=driver.findElements(By.cssSelector("table[name='courses'] tbody tr:nth-child(3) td"));
		int countrow=0;
		int countcolumn=0;
		for(int i=0;i<row.size();i++ )
		{
			countrow++;
			
		}
		for(int i=0;i<column.size();i++ )
		{
			countcolumn++;
			
		}
		System.out.println(countrow);
		System.out.println(countcolumn);
	
	for(int i=0;i<secondrowvalues.size();i++ )
	{
		System.out.println(secondrowvalues.get(i).getText());
		
	}
		
	}

}
