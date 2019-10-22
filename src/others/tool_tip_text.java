package others;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tool_tip_text {
	
	
	@Test
	public void tooltip()
	{
		//2nd level of tooltip
		//http://demo.guru99.com/test/tooltip.html
		//https://www.guru99.com/verify-tooltip-selenium-webdriver.html
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 String expectedTooltip = "Lightning fast free email";
		driver.get("https://www.rediff.com/");
		WebElement Redimail=driver.findElement(By.className("mailicon"));
		String ActualTooltip=Redimail.getAttribute("title");
		Assert.assertEquals(expectedTooltip, ActualTooltip);
		
		
	}
	
}

	

	


