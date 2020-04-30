package SeleniumSessions1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		//driver.manage().window().maximize(); // This method say's Driver Please Manage the Window to Maximise
		driver.manage().deleteAllCookies(); // This method will delete all the cookies
		driver.get("https://www.cheapoair.com/");

		// 1. get the total count of total links on the page
		// All the links represented by <a> html tag

		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		// size of linklist
		System.out.println(linklist.size());

		
		
		// 2 . get the total count of input fields on the page
		// all the input fields are represented by <input> html tag similarly for button html is <button>

		List<WebElement> linkList1 = driver.findElements(By.tagName("input"));
		// size of input fields
		System.out.println(linkList1.size());

		// 3. get the text of each links on the page

		for (int i = 0; i < linklist.size(); i++) {
			String linkText = linklist.get(i).getText();
			System.out.println(linkText);
		}

	}

}
