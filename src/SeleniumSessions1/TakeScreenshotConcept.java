package SeleniumSessions1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");

		// Take screenshot and store as a file format.  Below 2 lines of code will work to take the Screen shot

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the Screenshot to desired location using Copy file method
		Files.copy(src, new File("D:\\sss\\google.png")); // location were you want to save your screen shot

	}

}
