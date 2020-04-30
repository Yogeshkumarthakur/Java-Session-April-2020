package SeleniumSessions2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWTH {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Balli04");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("July@2019");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();

		// html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[4]/td[2]/a
		// html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[5]/td[2]/a
		// html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[6]/td[2]/a
		// html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[7]/td[2]/a

		// Method-1:

		String before_xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";

		for (int i = 4; i <= 7; i++) {
			String name = driver.findElement(By.xpath("before_xpath + i + after_xpath")).getText();
			System.out.println(name);
			if (name.contains("bpl mp")) {
				// html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[4]/td[2]/a
				driver.findElement(
						By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/form/table/tbody/tr[" + i
								+ "]/td[2]/a"))
						.click();

				// Method-2:

				driver.findElement(By.xpath(
						"//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']"))
						.click();
				driver.findElement(By.xpath(
						"//a[contains(text(),'ui uiii')]/parent::td//preceding-sibling::td//input[@name='contact_id']"))
						.click();

			}
		}

	}

}
