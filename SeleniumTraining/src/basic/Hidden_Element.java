package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Element {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@value='1'][@class='_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy']")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@role='button'][@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//WebElement hiddenTextField = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][3]"));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value='Hello';",hiddenTextField);
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@class='_5k_2 _5dba'][3]")).click();
		//driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("Chenna");

	}

}
