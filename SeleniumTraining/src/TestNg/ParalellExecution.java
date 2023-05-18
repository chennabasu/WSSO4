package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParalellExecution {
	
	@Test(invocationCount = 4, threadPoolSize = 4, enabled = true, alwaysRun = true)
	public void LoginTest() throws InterruptedException {
		
		//WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		
		String userName = "varthann@gmail.com";
		String password = "harihara@1911";
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		driver.findElement(By.id("Email")).sendKeys(userName);
		//Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(password);
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		if(driver.findElement(By.xpath("//a[@class='account'][1]")).getText().equals(userName)){
			System.out.println("User Is Logged In");
		}else {
			System.out.println("User Not Loged In");
		}
	}


}
