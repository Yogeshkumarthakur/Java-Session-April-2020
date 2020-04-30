//This is incomplete code but very nice vid if wana find all broken images and link on any wesite. watch vid again the code is not available on git repository

package SeleniumSessions3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.name("username")).sendKeys("Balli04");
		driver.findElement(By.name("password")).sendKeys("July@2019");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();// login button
		
		driver.switchTo().frame("mainpanel"); 
		Thread.sleep(2000);
		
		//Links -- a tag
		//images -- img tag
		
		//1. get the list of all the links and images:500
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of full link and images-->"+ linksList.size());

		
		List<WebElement> activeLinks = new ArrayList<WebElement>(); //450 here we filter
		
		
		//2. iterate linksLists: exclude all the link or images which doent have any href attribute
		
		for(int i=0; i<linksList.size(); i++) {
			if(linksList.get(i).getAttribute("href")!=null ){
				activeLinks.add(linksList.get(i));
			}
		}
		
		//get the size of active links list"
		System.out.println("size of active link and images-->"+ activeLinks.size());
		
	}

	
}
