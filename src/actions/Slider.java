package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class Slider {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
			driver.get("http://jqueryui.com/demos/slider/");
			driver.switchTo().frame(0);
			WebElement scroll = driver.findElement(By.xpath("//*[@id='slider']/span"));
			
			Actions act = new Actions(driver);
			int x = scroll.getLocation().x;
			int y=scroll.getLocation().y;
			System.out.println(x);
			System.out.println(y);

			act.clickAndHold(scroll).dragAndDropBy(scroll, 200, y).build().perform();

	}

}
