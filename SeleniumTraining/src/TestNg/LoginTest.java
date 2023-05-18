package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends Base {
	
	@Test
	public void LoginTest() throws InterruptedException {
		
		String userName = "varthann@gmail.com";
		String password = "harihara@1911";
		driver.findElement(By.partialLinkText("Log")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys(userName);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		if(driver.findElement(By.xpath("//a[@class='account'][1]")).getText().equals(userName)){
			System.out.println("User Is Logged In");
		}else {
			System.out.println("User Not Loged In");
		}
	}

}
