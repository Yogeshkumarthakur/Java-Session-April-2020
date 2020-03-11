package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		driver.get("https://www.irctc.co.in/nget/profile/user-registration"); // enter url
		
		//1. xpath:
		
//		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("ythiscola");
//		driver.findElement(By.xpath("//*[@id=\"usrPwd\"]")).sendKeys("Pwd123456");
//		driver.findElement(By.xpath("//*[@id=\"cnfUsrPwd\"]")).sendKeys("Pwd123456");
       
		//2. id:
		
//		driver.findElement(By.id("userName")).sendKeys("ythiscola");
//		driver.findElement(By.id("usrPwd")).sendKeys("Pwd123456");
//		driver.findElement(By.id("cnfUsrPwd")).sendKeys("Pwd123456");
	
		//3. name:
	
		driver.findElement(By.name("userName")).sendKeys("ythiscola");
		driver.findElement(By.name("usrPwd")).sendKeys("Pwd123456");
		driver.findElement(By.name("cnfUsrPwd")).sendKeys("Pwd123456");
		
		//4. linkText:
		
		driver.findElement(By.linkText("Terms and Conditions.")).click();
	
	}
	
	

}
