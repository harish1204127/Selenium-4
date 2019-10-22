package actions2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class Date_picker {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement obj = driver.findElement(By.xpath("//input[@id='datepicker']"));
		obj.click();
		Thread.sleep(4000);

		//WebElement prev = driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']/span/"));
		//WebElement next = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']/span/"));
		List<WebElement> days = driver.findElements(By.xpath("//td/a[@class='ui-state-default']"));
		System.out.println(days.size());
		for(WebElement day:days)
		{
			if(day.getText().equals("2"))
			{
				day.click();
			}
		}

	}

}
