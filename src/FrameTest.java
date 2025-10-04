import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// Here we switch to 0th frame and execute drag and drop action
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
//		driver.findElement(By.id("draggable")).click();
		Actions a=new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		}

}
