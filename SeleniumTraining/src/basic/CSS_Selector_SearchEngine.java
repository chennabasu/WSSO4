package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_SearchEngine {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input[value=\'Search store\']")).sendKeys("Laptop");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[1]")).sendKeys("Laptop");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		
		//Register Link
		//a[@class="ico-register"]
		
		//Select Male Radio Button
		//input[@id="gender-male"]
		
		//Select Female Radio Button
		//input[@id="gender-female"]
		
		// Enter First Name
		//input[@name="FirstName"]
		
		//Enter Last Name
		//input[@name="LastName"]
		
		//Enert Email
		//input[@name="Email"]
		
		//Enter Password
		//input[@name="Password"]
		
		//Confirm Password
		//input[@name="ConfirmPassword"]
		//input[@value="register-button"]
		
		
		////a[contains(text(), 'Reg')]
		//input[contains(@id, 'male')]
		//input[contains(@id, 'female')]
		//input[contains(@id, 'register-button')]
		
		
	}

}
