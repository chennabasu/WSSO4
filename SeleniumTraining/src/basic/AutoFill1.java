package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoFill1 {

	public static <WebElement> void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> allElements = (List<WebElement>) driver.findElements(By.xpath("//*[@id=\"autocomplete\"]")); 

	    for (WebElement element: allElements) {
	         System.out.println(element);
}
	}
}
