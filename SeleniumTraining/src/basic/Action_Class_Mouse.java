package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class_Mouse {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement computerslink = driver.findElement(By.linkText("COMPUTERS"));
		action.moveToElement(computerslink).build().perform();
		//Composit Action
		action.moveToElement(driver.findElement(By.linkText("Desktops"))).click().build().perform();
		

	}

}
