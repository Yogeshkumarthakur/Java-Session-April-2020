package SeleniumSessions1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// 1. Firefox browser we use gecko driver

		// In the below statement FirefoxDriver() is a class
		// new is a object of this particular class
		// WebDriver is an interface
		// driver is a webDriver Reference variable
		// So, firefoxDriver is a class which is implementing Web driver interface

//		System.setProperty("webdriver.gecko.driver", "D:\\GeckoDriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver(); // launch firefox driver
//		driver.get("http://www.google.com");

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		driver.get("http://www.google.com"); // enter url
		String title = driver.getTitle(); // get title
		System.out.println(title);// Print title

		// how to check if the title displayed is correct or not
		// so we put validation point

		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else

		{
			System.out.println("incorrect title");
		}
		System.out.println(driver.getCurrentUrl());// get current url
		// System.out.println(driver.getPageSource()); // you will get the page source
//		driver.quit(); // to close the browser
	}

}
