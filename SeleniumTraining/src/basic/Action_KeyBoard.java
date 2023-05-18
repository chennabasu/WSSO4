package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_KeyBoard {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_UP);
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		action.sendKeys(driver.findElement(By.id("small-searchterms")),"Laptops").build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER);
		
		
	
		
		

	}

}
