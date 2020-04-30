package SeleniumSessions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/profile/user-registration"); // enter url
		
		//handle drop box:
		
		WebElement dropDwn = driver.findElement(By.cssSelector("#divMain > div > app-user-registration > div.container-fluid > div > div.col-md-9 > div:nth-child(5) > form > div:nth-child(4) > div:nth-child(2) > p-dropdown > div > label"));
		dropDwn.click();
	    driver.findElement(By.xpath("(//span[@class='ng-tns-c10-4 ng-star-inserted'])[1]")).click();

		
		
		
		
		
		

	}

}
