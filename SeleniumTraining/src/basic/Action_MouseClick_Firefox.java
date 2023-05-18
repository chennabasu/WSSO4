package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_MouseClick_Firefox {

	public static void main(String[] args) {
		
		String key="webdriver.gecko.driver";
		String value="C:\\Selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		/*
		 * driver.manage().window().maximize(); Actions action = new Actions(driver);
		 * action.sendKeys(Keys.TAB).build().perform();
		 * action.sendKeys(Keys.TAB).build().perform();
		 * action.sendKeys(Keys.TAB).build().perform();
		 * action.sendKeys(Keys.TAB).build().perform();
		 * action.sendKeys(Keys.TAB).build().perform();
		 * action.sendKeys(Keys.TAB).build().perform();
		 * action.sendKeys(Keys.ENTER).build().perform();
		 */
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.manage().window().maximize();
		Actions action = new Actions (driver);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.moveToElement(driver.findElement(By.xpath("//span[text()='right click me']"))).contextClick().build().perform();
	}

}
