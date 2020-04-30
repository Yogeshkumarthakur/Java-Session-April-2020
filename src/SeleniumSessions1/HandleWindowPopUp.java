package SeleniumSessions1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		// We have basically three types of pop:

		// 1. alerts -- Java script pop up -- Alert API (accept, dismiss)
		// 2. File upload pop up -- Browse button -- ( type= file, sendkeys(path)
		// 3. Browser window pop up -- Advertisement pop up (windowHandler API -
		// getWindowHandles() )

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.popuptest.com");

		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Come & Go Test')]")).click();
		Thread.sleep(2000);

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id:" + parentWindowId);

		String childWindowId = it.next();
		System.out.println("child window id:" + childWindowId);

		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("Child window pop up title:" + driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("Parent Window title:" + driver.getTitle());

	}

}
