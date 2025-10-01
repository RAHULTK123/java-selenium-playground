import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver driver= new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			driver.findElement(By.name("name")).sendKeys("Rahul T K");
			driver.findElement(By.name("email")).sendKeys("rahul123@gmail.com");
			driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345678");
			driver.findElement(By.id("exampleCheck1")).click();
			WebElement dropdown= driver.findElement(By.id("exampleFormControlSelect1"));
			Select options=new Select(dropdown);
			options.selectByIndex(0);
			driver.findElement(By.id("inlineRadio1")).click();
			driver.findElement(By.cssSelector("input[type='date']")).sendKeys("27042004");
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			Thread.sleep(2000);
			Assert.assertEquals(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'] strong")).getText(),"Success!");
			System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'] strong")).getText());
			
			
	}

}
