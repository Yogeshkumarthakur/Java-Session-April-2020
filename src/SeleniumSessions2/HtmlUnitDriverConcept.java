package SeleniumSessions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

		//HtmlUnitDriver -- is not part of Selenium 3.x version
		//HtmlUnitDriver --  to use this concept we have to download HtmlUnitDriver jar file
		
	
		//Advantages of HtmlUnitDriver:
		//1. testing is happening behind the scene --  no browser launched
		//2. Execution of TC is very fast so it automatically improve the performance of the script
		//3. this is also called Ghost browser or headless browser. there are many hradless broser available in the maeket:
		//a. HtmlUnitDriver -- used in java
		//b. Phantom JS  --  used for javaScript 	
		//
		//Dad:
		//1. It is not suitable for Action class for ex: all the user actions like mousemovement, doubleClick or drag and drop
		
		
		WebDriver driver = new HtmlUnitDriver();
		
		
		driver.get("https://classic.freecrm.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		System.out.println("before login, title is:"+ driver.getTitle());
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Balli04");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("July@2019");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		System.out.println("after login, title is:"+ driver.getTitle());

	}

}
