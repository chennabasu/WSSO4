package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends Base {
	

	@Test
	public void RegisterTest() throws InterruptedException {
		String Gender = "F";
		String FirstName = "Vartha";
		String LastName = "Shiva";
		String Password = "harihara@1911";
		String Email = "varthann@gmail.com";
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='F']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(FirstName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(LastName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("(//a[@class='account'])[1]")).getText().equals(Email)){
			System.out.println("Registration Complete");
			
		}else {
			System.out.println("Registration Fail");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='listbox']//a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='header-links-wrapper']//a[@class='ico-cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='removefromcart'])[1]")).click();
		
	}
}
