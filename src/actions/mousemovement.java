package actions;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class mousemovement {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.manage().window().maximize();

		driver.get("http://automationpractice.com/");
	WebElement link= driver.findElement(By.linkText("WOMEN"));
	
    Actions act = new Actions(driver);
    act.moveToElement(link).build().perform();
    
    WebElement Casual_Dresses= driver.findElement(By.linkText("Casual Dresses"));
    Actions act2 = new Actions(driver);
    act2.moveToElement(Casual_Dresses).click().build().perform();

			
		}
		
	}


