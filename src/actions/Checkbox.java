package actions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;


public class Checkbox {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		List<WebElement> li= driver.findElements(By.xpath("//div/input[@type='checkbox']"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++)
		{
			String x= li.get(i).getAttribute("value");
			System.out.println(x);
			  li.get(i).click();
			if (li.get(i).isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");	
	          
	        }
				
			}
			
			
		}
		
	}


