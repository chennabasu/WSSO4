package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_DemoWebshop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href, 'register')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'male')]")).click();
		driver.findElement(By.xpath("//input[contains(@id, 'FirstName')][1]")).sendKeys("Shiva");
		driver.findElement(By.xpath("//input[contains(@id, 'LastName')][1]")).sendKeys("Math");
		driver.findElement(By.xpath("//input[contains(@id, 'Email')]")).sendKeys("chennabasu@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type, 'password')]")).sendKeys("Harihara@1914");
		driver.findElement(By.xpath("//input[contains(@name, 'ConfirmPassword')]")).sendKeys("Harihara@1914");
		driver.findElement(By.xpath("//input[contains(@value, 'Register')]")).click();

	}

}
