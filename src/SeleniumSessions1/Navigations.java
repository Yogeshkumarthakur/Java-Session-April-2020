package SeleniumSessions1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		//driver.manage().window().maximize(); // This method say's Driver Please Manage the Window to Maximise
		driver.manage().deleteAllCookies(); // This method will delete all the cookies

		// what is the difference between get and navigate().To method
		driver.get("https://google.com");

		// how you click in back and forward button on the browser or how you simulate back and forward button

		driver.navigate().to("http://flipkart.com");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();

		// How to refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
