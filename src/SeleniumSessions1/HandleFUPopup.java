package SeleniumSessions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFUPopup {

	public static void main(String[] args) throws InterruptedException {

		
		//This Code is not working unable to handle popup
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		Thread.sleep(8000);
		
//		 Alert alert = driver.switchTo().alert();
//		 String text = alert.getText();
//		 System.out.println(alert.getText());
//       alert.accept();		

         driver.findElement(By.id("fileupload")).click();
         
		 //driver.findElement(By.id("fileupload")).sendKeys("‪D:\\Cdata\\Desktop\\Daily Status.xlsx\\Daily Status.exe");
	
		
	}

}
