package SeleniumSessions1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {

		// Mouse Movement in Selenium

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // This method say's Driver Please Manage the Window to Maximise
		driver.manage().deleteAllCookies(); // This method will delete all the cookies
		driver.get("https://www.cheapoair.com/");

		// The Mouse movement will be done by Actions class
		// In Actions class we just need to pass the Webdriver ref var which is "driver" (while in select class we need to pass driver.findelement)
		Actions action = new Actions(driver);

		// always with the Actions classes use .build() and .perform() method
		action.moveToElement(driver.findElement(By.linkText("More"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Gift Cards")).click();
	}
}