import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;




public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		
		normaldropdown(driver);
		
//		driver.findElement(By.id("divpaxinfo")).click();

		driver.findElement(By.id("divpaxinfo")).click();


		   /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		i++;

		}*/

//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}


		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adults");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());			

		   driver.quit();

	}
	 public static void normaldropdown(WebDriver driver) throws InterruptedException
	 {
		 System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
//		 driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		 WebElement selectdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Thread.sleep(2000);
		 Select dropdown=new Select(selectdropdown);
		 dropdown.selectByIndex(2);
		 System.out.println(driver.findElement(By.cssSelector("ctl00_mainContent_DropDownListCurrency")).getText());

		 
	 }

	 
}
