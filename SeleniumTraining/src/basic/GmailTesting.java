package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class GmailTesting {

	public static void main(String[] args) {
		
		String key="webdriver.gecko.driver";
		String value="C:\\Selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get ("https://google.com");
		//driver.manage().window().maximize();
		//driver.findElement(By.id("identifierId")).sendKeys("chennabasu@gmail.com");
		//driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
		
		
		

	}

}
