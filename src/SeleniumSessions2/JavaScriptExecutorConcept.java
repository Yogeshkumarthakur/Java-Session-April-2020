package SeleniumSessions2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Balli04");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("July@2019");
		// driver.findElement(By.xpath("//input[@type='submit']")).click();

		// executeScript -- to execute javaScript code

		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));// login button

		flash(loginbtn, driver);
	}

	
	
	
	// ################below code for higlighting any element is not working need to take form NAveen git ######################3333
	
	
	
	public static void flash(WebElement element, WebDriver driver) {
		JavaScriptExecutor js = ((JavaScriptExecutor) driver);
		String bgcolor = element.getCssValue("background color");
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(0,300,0)", element, driver); // 1
			changeColor(bgcolor, element, driver);// 2
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) ((JavaScriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}

	}

}
