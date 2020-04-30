package SeleniumSessions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/register/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//1. isDisplayed() -- it is applicable for all the element will check if all the element are displayed or not
		
		boolean b1 = driver.findElement(By.xpath("/html/body/section[1]/div[1]/form/div[12]/div\r\n" +"")).isDisplayed(); //for submit button
		System.out.println(b1);// True
		
		//2. isEnabled -- to check if the element is enabaled or not
		
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);//false
		
		//Select I agree check box:
		driver.findElement(By.name("agreeTerms")).click(); // submit button is enabled now
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);//true
		
		//3. isSelected() -- method is only applicable for checkbox, dropdown and radiobutton
		boolean b4 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b4);// true
		
		//deselect the above check box
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b5);// false
	}

}
