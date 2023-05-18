package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrame_Register {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Actions action1 = new Actions(driver);
		action1.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
		//1st Index value
		//driver.switchTo().frame(0);
		
		//2nd id/string Name
	//	driver.switchTo().frame("cources-iframe");
		
		//3rd using xpath
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='cources-iframe']")));
		driver.findElement(By.xpath("//a[@text()='register']")).click();
		driver.switchTo().parentFrame();
		

	}

}
