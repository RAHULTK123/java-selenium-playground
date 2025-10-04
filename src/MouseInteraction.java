import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("div[id='nav-link-accountList']"));
		a.moveToElement(move).contextClick().build().perform();
		driver.findElement(By.id("twotabsearchtextbox")).click();
		WebElement text=driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(text).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	}

}
