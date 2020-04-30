//This code is working fine perfectly
package SeleniumSessions3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		//Mandatory options in Healess browsers:
		//1. Chrome version on mac should be greater than 59 and on chrome should be greater than 60
		//2. "window-size=1400,800" size need to give always
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/");
		System.out.println("login page title==>"+driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("Balli04");
		driver.findElement(By.name("password")).sendKeys("July@2019");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();// login button
		System.out.println("home page title==>"+driver.getTitle());
	}

}
