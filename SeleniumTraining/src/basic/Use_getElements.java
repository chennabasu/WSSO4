package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_getElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement booklink = driver.findElement(By.linkText("BOOKS"));
		System.out.println(booklink.getAttribute("href"));
		System.out.println(booklink.getCssValue("color"));
		System.out.println(booklink.getTagName());
		System.out.println(booklink.getLocation());
		System.out.println(booklink.getRect());
		System.out.println(booklink.getLocation());
		System.out.println(booklink.isDisplayed());
		System.out.println(booklink.isEnabled());
		System.out.println(booklink.isSelected());
	}

}
