package Filter4Life;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginExecutor {
	@Test
	public void loginTest() throws InterruptedException {
		
		//WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dev.filter4life.infenox.com/");
		String username = "cbs123test4@gmail.com";
		String password = "Harihara@1914";
//		String userName = "cbs123test2@gmail.com";
//		String password = "Harihara@1914";
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@id='formBasicEmail']")).sendKeys(username);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='formBasicPassword']")).sendKeys(password);
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='signin-button btn btn-primary rounded-pill']")).click();
		
		//if(driver.findElement(By.xpath("//a[@class='account'][1]")).getText().equals(userName)){
			//System.out.println("User Is Logged In");
		//}else {
			//System.out.println("User Not Loged In");
		}
	}

//}
