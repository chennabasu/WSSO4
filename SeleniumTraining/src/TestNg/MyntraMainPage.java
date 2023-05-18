package TestNg;

//import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraMainPage {
	
	WebDriver driver;
	@Test
	public void BrowserSetup() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chennabasu@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("harihara1914");
	driver.findElement(By.xpath("//button[@class='login-login-button']")).click();
	driver.findElement(By.xpath("//button[@class='login-facebook login-button']")).click();
	Set<String> windowHandle = driver.getWindowHandles();
	//Iterator<String> it = windowHandle.iterator();
	//String parentwindow = it.next(); 
	//String childWindow = it.next();
	//driver.switchTo().window(childWindow);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//div[@class='_al64']//button)[2]")).click();
	
	
	
	
	
	}
		
	}

