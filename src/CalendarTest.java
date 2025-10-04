import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CalendarTest {

	public static void main(String[] args) {
		String date="7";
		String month="5";
		String year="2028";
		String[] expectedResult= {month, date,year};
	
		// In this code we select given month/date/year and check with assertion
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
//		Actions a=new Actions(driver);
//		WebElement dclick= driver.findElement(By.cssSelector(".react-calendar__navigation__label"));
//		a.moveToElement(dclick).doubleClick().build().perform();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		List<WebElement> lst = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<lst.size();i++)
		{
			String asutalresult=lst.get(i).getAttribute("value");
			System.out.println(asutalresult);
			Assert.assertEquals(asutalresult, expectedResult[i]);
		}
		

	}

}
