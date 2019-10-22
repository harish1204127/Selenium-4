package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class Dragging {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://jqueryui.com/demos/draggable/");
		driver.switchTo().frame(0);
		WebElement obj = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions act = new Actions(driver);
		act.clickAndHold(obj).dragAndDropBy(obj, 200, 200).build().perform();
	}

}
