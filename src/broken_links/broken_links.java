package broken_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links {
	
	
	public static void main(String[] args) throws InterruptedException {
		int respCode = 200;
		int validlink=0;
		int invalidlink=0;
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links are " + links.size());
		for(WebElement img: links)
		{
			
			String URL= img.getAttribute("href");
            if(URL == null || URL.isEmpty()){
            	System.out.println("URL is either not configured for anchor tag or it is empty");
            	invalidlink=invalidlink+1;
            	                continue;
            	            }

            try {
            	HttpURLConnection  connection = (HttpURLConnection)(new URL(URL).openConnection());
                
            	connection.setRequestMethod("HEAD");
                
            	connection.connect();
                
                respCode = connection.getResponseCode();
                
                if(respCode >= 400){
                    System.out.println(URL+" is a broken link");
                    invalidlink=invalidlink+1;
                }
                else{
                    System.out.println(URL+" is a valid link");
                    validlink=validlink+1;
                }
                    
            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
		}
		
		System.out.println("invalidlink="+invalidlink);
		System.out.println("validlink="+validlink);
	}
	
}

	

	


