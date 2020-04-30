package SeleniumSessions2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
	
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Yogesh\\eclipse-workspace\\Java Training\\JavaTrainingSession\\src\\SeleniumSession2\\config.properties");
		
		prop.load(ip);

		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\GeckoDriver\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
		}
	
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("Firstname_xpath"))).sendKeys(prop.getProperty("Firstname"));
		driver.findElement(By.xpath(prop.getProperty("Lastname_xpath"))).sendKeys(prop.getProperty("Lastname"));
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password"));
		
			
	}

}
