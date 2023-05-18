package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Class {

	private static final By By = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String price = driver.findElement(By.xpath("//a[contains(text(), 'rtual')]/../..//span[@class='price actual-price']")).getText();
		System.out.println("price"+price);
		String price1=driver.findElement(By.xpath("//a[contains(text(), 'inch')]/../..//span[@class='price actual-price']")).getText();
			System.out.println(price1);
			String price2=driver.findElement(By.xpath("//a[contains(text(), 'cheap')]/../..//span[@class='price actual-price']")).getText();
			System.out.println(price2);
			String price3=driver.findElement(By.xpath("//a[contains(text(), 'your own computer')]/../..//span[@class='price actual-price']")).getText();
			System.out.println(price3);
			
		}
	}


