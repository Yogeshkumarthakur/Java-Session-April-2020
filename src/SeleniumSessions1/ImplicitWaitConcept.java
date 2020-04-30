package SeleniumSessions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		//Implicit wait comes under the category of dynamic wait
		//thread.sleep comes under the category of static wait which is a hard wait and wait until the time u have specify so 2 disadvantages of thread.sleep
		//1. Script will be paused for the time u have have mentioned sets say (thread.sleep(20 seconds)
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		//driver.manage().window().maximize(); // This method say's Driver Please Manage the Window to Maximise
		driver.manage().deleteAllCookies(); // This method will delete all the cookies
		driver.get("https://jqueryui.com/droppable/");
		
		//both the below waits are Global wait or dynamic wait in these wait if script load early rest of the time will be ignored
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);// wait max for 40 sec toload the page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// wait max for 30 sec for all the element which are applicable on the page
	}

}
