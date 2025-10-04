import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// Here we deal with nested frame and print the output in midddle frame frame
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		driver.switchTo().frame("frame-top");



		driver.switchTo().frame("frame-middle");



		System.out.println(driver.findElement(By.id("content")).getText());
		

	}

}
