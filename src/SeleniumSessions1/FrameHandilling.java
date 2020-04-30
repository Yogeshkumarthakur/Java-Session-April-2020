package SeleniumSessions1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.ImeHandler;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.Logs;

public class FrameHandilling {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option= new ChromeOptions();

		option.addArguments("--disbale-notifications");
		WebDriver driver = new ChromeDriver(option);// launch browser
		driver.manage().window().maximize(); // Maximise windows
		driver.manage().deleteAllCookies(); // delete all the cookies


		//dynamic wait:
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://classic.crmpro.com/index.html");// enter url
		driver.findElement(By.name("username")).sendKeys("Balli04");
		driver.findElement(By.name("password")).sendKeys("July@2019");
		driver.findElement(By.xpath("//input[@type='submit']")).click(); //dynamic xpath used
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navmenu\"]/ul/li[4]/a")).click();
	}

}
