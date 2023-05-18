package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Close_Quit {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String parentHandle = driver.getWindowHandle();
		Actions action = new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		
		Thread.sleep(2000);
		Set<String>windowHandles=driver.getWindowHandles();
		for(String windowHandle:windowHandles) {
		
		driver.switchTo().window(windowHandle);
		driver.close();
		Thread.sleep(2000);
		
	
			
		}
		
		}
}
			
		


