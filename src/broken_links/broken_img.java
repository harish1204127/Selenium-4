package broken_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.HttpClient;

public class broken_img {
	
	public static int brokenImagesCount;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.name("q")).sendKeys("Tower");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("Total no. of images are " + imagesList.size());
		for(WebElement img: imagesList)
		{
			try {
			String URL= img.getAttribute("src");
			VerifyImgURL(URL);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("brokenImagesCount="+brokenImagesCount);

	}

	private static void VerifyImgURL(String uRL){
		try {
		HttpURLConnection  connection = (HttpURLConnection)(new URL(uRL).openConnection());
		connection.setConnectTimeout(10000);
		connection.setReadTimeout(20000);
		int statusCode=connection.getResponseCode();
        if(statusCode==404||statusCode==500){
            brokenImagesCount=brokenImagesCount+1;
            System.out.println(uRL+"and its Status codes is:"+statusCode);
        }
		}
		 catch (Exception e) {
				e.printStackTrace();
			}
	}

}
