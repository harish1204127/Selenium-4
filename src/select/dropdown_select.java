package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_select {
	
	public static void main(String[] args) {
	
		
		//The 'Select' class in Selenium WebDriver is used for selecting and deselecting option in a dropdown. 
		//The objects of Select type can be initialized by passing the dropdown webElement as parameter to its constructor.
		
		
System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\drivers\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
dropdown.selectByVisibleText("Database Testing");  

	}
}
