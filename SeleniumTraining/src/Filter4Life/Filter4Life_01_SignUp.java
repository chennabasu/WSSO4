package Filter4Life;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public  class Filter4Life_01_SignUp
{
	WebDriver driver;
	@Test(invocationCount = 1, threadPoolSize = 1, enabled = true, alwaysRun = true)
	public void browserSetup() {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	String username = "cbs123test4@gmail.com";
	String password ="Harihara@1914";
	String confirmPassword = "Harihara@1914";
	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://dev.filter4life.infenox.com/");
	driver.findElement(By.xpath("//button[@class='upper-navbar-button btn btn-light'][2]")).click();
	driver.findElement(By.xpath("//input[@id='formBasicEmail']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id='formCreatePassword']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@id='formpasswordConfirm']")).sendKeys(confirmPassword);
	driver.findElement(By.xpath("//input[@id='formBasicCheckbox']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("//div[@class='signUpLogin']//a")).click();
	LoginExecutor test = new LoginExecutor();
	try {
		test.loginTest();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
