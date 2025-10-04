import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		String name=driver.findElement(By.cssSelector("label[for='benz']")).getText();
		driver.findElement(By.cssSelector("label[for='benz'] input")).click();		
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select option=new Select(dropdown);
		option.selectByContainsVisibleText(name);
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		String popup=driver.switchTo().alert().getText();
		System.out.println(popup);
		if(popup.contains(name)) {
			 System.out.println("Option2 is present in the popup.");
			
		}
		else {
			System.out.println("Option2 is NOT present in the popup.");
		}
		driver.switchTo().alert().accept();
		
	}

}
