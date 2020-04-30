package SeleniumSessions1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
	
		//Drag and Drop Concept in Selenium
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser
		driver.manage().window().maximize(); // This method say's Driver Please Manage the Window to Maximise
		driver.manage().deleteAllCookies(); // This method will delete all the cookies
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0); //when frame is present on the webpage then only this line will be used
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();
		
	}

}
