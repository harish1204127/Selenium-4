package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleSelect {
	
	public static void main(String[] args) {
	
		
		//The 'Select' class in Selenium WebDriver is used for selecting and deselecting option in a dropdown. 
		//The objects of Select type can be initialized by passing the dropdown webElement as parameter to its constructor.
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
driver.get("F:\\screenshot\\select.html");  
WebElement element=driver.findElement(By.name("Mobdevices"));
Select se=new Select(element);
se.deselectAll();
se.selectByVisibleText("Nokia");
se.selectByVisibleText("HTC");

//To get all the options that are selected in the dropdown.
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
			System.out.println("You have selected::"+ webElement.getText());
		}
		
//To get the first selected option in the dropdown
				WebElement firstOption = se.getFirstSelectedOption();
				System.out.println("The First selected option is::" +firstOption.getText());
				
				if(se.isMultiple())
				{
				System.out.println("Select tag allows multiple selection");	
				}

	}
}
