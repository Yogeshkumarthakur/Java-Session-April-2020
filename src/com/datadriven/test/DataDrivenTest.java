package com.datadriven.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main (String[] args) {
		
	
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Yogesh\\eclipse-workspace\\Java Training\\JavaBasics\\src\\com\\testdata\\RailwayForm.xlsx");
		
		String UserName = reader.getCellData("RegTestData", "UserName", 2);
		System.out.println(UserName);
		
		String Password = reader.getCellData("RegTestData", "Password", 2);
		System.out.println(Password);
		
		String ConfirmPassword = reader.getCellData("RegTestData", "ConfirmPassword", 2);
		System.out.println(ConfirmPassword);
		
		String SecurityQuestion = reader.getCellData("RegTestData", "Security Question", 2);
		System.out.println(SecurityQuestion);
		
		String SecurityAnswer = reader.getCellData("RegTestData", "Security Answer", 2);
		System.out.println(SecurityAnswer);
		
		String PreferredLanguage = reader.getCellData("RegTestData", "Preferred Language", 2);
		System.out.println(PreferredLanguage);
		
		String Name = reader.getCellData("RegTestData", "Name", 2);
		System.out.println(Name);
		
		String Gender = reader.getCellData("RegTestData", "Gender", 2);
		System.out.println(Gender);
	
	
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();// launch browser
		driver.get("https://www.irctc.co.in/nget/profile/user-registration"); // enter url

				
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(UserName);
		driver.findElement(By.xpath("//*[@id=\"usrPwd\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"cnfUsrPwd\"]")).sendKeys(ConfirmPassword);
		Select select = new Select();
		
		
		//Select Security Question
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

	
}
