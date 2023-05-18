package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_TestCase {

	public static void main(String[] args) {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//Navigate To URL
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Click on Login Link
		
		driver.findElement(By.linkText("Log in")).click();
		
		//Enter Valid User Credentials User Name And Password
		
		driver.findElement(By.id("Email")).sendKeys("chennabasu@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Harihara@1914");
	}

}
