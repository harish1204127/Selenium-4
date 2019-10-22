package actions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://jqueryui.com/demos/droppable/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//*[@id='droppable']"));
		act.dragAndDrop(src, dest).build().perform();
		System.out.println(driver.findElement(By.xpath("//*[@id='droppable']/p")).getText());
	}

}
