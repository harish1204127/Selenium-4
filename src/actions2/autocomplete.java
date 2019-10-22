package actions2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class autocomplete {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		Thread.sleep(5000);
		WebElement frameElement=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);
		WebElement obj = driver.findElement(By.id("tags"));
		obj.sendKeys("a");
		Thread.sleep(2000);

		List<WebElement> li = driver.findElements(By.tagName("li"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i).getText().equalsIgnoreCase("JAVA"))

			{
				li.get(i).click();
			}
		}
		
		

		
		
		
		
		
	}

}
