package SeleniumSessions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSDateAnotherSimpleEx {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("Balli04");
		driver.findElement(By.name("password")).sendKeys("July@2019");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();// login button
		driver.switchTo().frame("mainpanel");
		
		String date= "23-December-2019";
		  String[] datearr = date.split("-");
		  String curdate = datearr[0];
		  String curmonth = datearr[1];
		  String curyear = datearr[2];
		  
		  Select selmonth= new Select(driver.findElement(By.name("slctMonth")));
		  selmonth.selectByVisibleText("December");
		  
		  Select selyear= new Select(driver.findElement(By.name("slctYear")));
		  selyear.selectByVisibleText("2019");
		  
		  driver.findElement(By.xpath(".//*[@id='crmcalendar']//tbody//tr//td[contains(text(),'"+curdate+"')]")).click();
		  System.out.println("Clicked");;
		  Thread.sleep(3000);
		  driver.quit();
	}

}
