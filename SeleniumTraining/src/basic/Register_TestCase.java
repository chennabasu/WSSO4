package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_TestCase {

	public static void main(String[] args) {
		
		//Open Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigate To URL 
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//Maximize Home Page
		driver.manage().window().maximize();
		
		//Click On Register Link On Home Page
		driver.findElement(By.className ("ico-register")).click();
		
		//Select Gender Type
		driver.findElement(By.id("gender-male")).click();
		
		//Enter User Details FirstName, LastName, EmailId
		
		driver.findElement(By.id("FirstName")).sendKeys("Chennabasayya");
		driver.findElement(By.id("LastName")).sendKeys("Shiva");
		driver.findElement(By.id("Email")).sendKeys("chennabasu@gmail.com");
		
		//Enter Credentials Password and Password Confirmation
		
		driver.findElement(By.id("Password")).sendKeys("Harihara@1914");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Harihara@1914");
		
		//Click On Register Button
		
		driver.findElement(By.id("register-button")).click();
		
		
		
		

	}

}
