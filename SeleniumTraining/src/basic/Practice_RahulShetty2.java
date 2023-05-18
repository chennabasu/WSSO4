package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_RahulShetty2 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//input[@value='radio1']")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@value='radio2']")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@value='radio3']")).click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	//	Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	//	Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"autocomplete\"]")).sendKeys("India");

		
	}
	
	}


