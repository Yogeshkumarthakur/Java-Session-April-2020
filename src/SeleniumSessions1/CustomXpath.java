package SeleniumSessions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		//driver.manage().window().maximize(); // This method say's Driver Please Manage the Window to Maximise
		driver.manage().deleteAllCookies(); // This method will delete all the cookies
		
		
		//both the below waits are Global wait or dynamic wait in these wait if script load early rest of the time will be ignored
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//implicitly wait are applicable for all the element which are applicable on the page
	
		driver.get("https://www.cheapoair.com/");
		
				
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java");
		//driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("net");
			
		
		//below is Absolute xpath: avoid using it not recommended
		//"//*[@id=\"app\"]/div/header/div/div/div[2]/div/ul/li[4]/a"
		//performance issue
		//not reliable
		//can be changed at any time in future
		
		//Customize/relative xpath:
		//very fast
		//it is unique
		//easy synatax
		//performance issue is not there
		
		//driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("dotnet");
		//driver.findElement(By.xpath("//input[contains(@class,'LM6RPg')]")).sendKeys("cool");
		
		//dynamic ids: suppose html tag is input
		
		//starts-with
		//id = test_123
		//id = test_456
		//id = test_567
		
		//ends-with
		//id=1234_test_t
		//id=5678_test_t
		//id=9876_test_t
		
		//example of above id in below statement 
		//driver.findElement(By.xpath("//input[contains(@id,'test_']")).sendKeys("Hero");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Hot");
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("you");
		
		//for links: custome xpath
		//all the links represented by <a> html tag
		
		driver.findElement(By.xpath("//a[contains(text(),'Customer Support')]")).click(); //link when want to click with text name
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/div/div/div[2]/div/ul/li[4]/a")).click();
				
		}

}
