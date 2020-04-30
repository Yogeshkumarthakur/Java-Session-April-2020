package SeleniumSessions1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");

		// to disable all the notification from chrome while launching any site
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prefs);
		// option.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(option);// launch browser and also we pass driver here for disable
													// notifications from chrome
		driver.get("https://html.com/input-type-file/"); // enter url

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"pushmonkey-prompt-container\"]/div/div[2]/a[1]")).click();
		// Alert alert = driver.switchTo().alert();
		// alert.accept();

		driver.findElement(By.id("fileupload")).sendKeys("D:\\Cdata\\Desktop\\Images\\Cabbage All sizes\\355x355");

	}

}
