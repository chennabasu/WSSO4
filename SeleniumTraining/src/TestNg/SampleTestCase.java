package TestNg;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestCase {
	
	@Test
	public void sampleTest() throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value= "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("opentab")).click();
//		driver.manage().window().maximize();
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		
//		Iterator<String> it = windowHandles.iterator();
//		
//		String parentwindow = it.next();
//		
//		String childwindow = it.next();
//		
//		driver.switchTo().window(childwindow);
//		
//		driver.findElement(By.linkText("Access all our Courses")).click();
//		
//		//driver.navigate().back();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.linkText("Log in")).click(); 
}
}
