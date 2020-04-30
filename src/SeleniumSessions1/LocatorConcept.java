package SeleniumSessions1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		driver.get("https://www.irctc.co.in/nget/profile/user-registration"); // enter url

		// 1. xpath:--2
		// Rule: absolute xpath should not be used--/html/body/app-root/app-home/div[2]
		// only relative xpath should be used -- //*[@id=\"userName\"]

		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("ythiscola");
		driver.findElement(By.xpath("//*[@id=\"usrPwd\"]")).sendKeys("Pwd123456");
//		driver.findElement(By.xpath("//*[@id=\"cnfUsrPwd\"]")).sendKeys("Pwd123456");

		// 2. id: --1

//		driver.findElement(By.id("userName")).sendKeys("ythiscola");
//		driver.findElement(By.id("usrPwd")).sendKeys("Pwd123456");
//		driver.findElement(By.id("cnfUsrPwd")).sendKeys("Pwd123456");

		// 3. name:--3

//		driver.findElement(By.name("userName")).sendKeys("ythiscola");
//		driver.findElement(By.name("usrPwd")).sendKeys("Pwd123456");
//		driver.findElement(By.name("cnfUsrPwd")).sendKeys("Pwd123456");

		// 4. linkText:this is only for links--4

		// driver.findElement(By.linkText("Terms and Conditions.")).click();

		//5. PartialLinkText: // dont use this locator, not recommended 
		driver.findElement(By.partialLinkText("Terms and")).click();

		// 6. CSS Selector: --2
		// if id is there then simply put #{id} value
		// if class is there then .{class} value
		// or else side click "copy selector"

		// driver.findElement(By.cssSelector("#firstName")).sendKeys("ythispepsi");

		// 7. class name: not useful because class name could be duplicate for different
		// elements--5

		// driver.findElement(By.className("ng-tns-c10-4 ui-dropdown-label ui-inputtext
		// ui-corner-all ui-placeholder ng-star-inserted")).click();

		// 8. tag name: will be covered later
		// driver.quit();

	}

}
