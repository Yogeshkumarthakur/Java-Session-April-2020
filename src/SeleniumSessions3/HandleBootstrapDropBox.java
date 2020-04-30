//This code is working fine
package SeleniumSessions3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class HandleBootstrapDropBox {

	public static void main(String[] args) {

		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");

		driver.findElement(By.xpath("//button[contains(@id,'dropdownMenuButton')]")).click();//button click
		
		//driver.findElement(By.xpath("//a[text()='Another action']")).click();
		List <WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu' and @aria-labelledby='dropdownMenuButton']//a"));

		System.out.println(list.size());
		
		// To select all the values or options
//		for (int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i).getText());
			
		// To select particular checkbox:
		for (int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Action")) {
				list.get(i).click();
				break;
			}
		}

	}
	}

