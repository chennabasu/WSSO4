package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrame_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		driver.get("file://C:/Users/chenna/Downloads/iframe.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='newcont3']")));
		//driver.findElement(By.xpath(""))
	}

}
