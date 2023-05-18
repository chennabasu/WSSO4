package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class Notification_PopUps {

	public static void main(String[] args) {
		
		EdgeOptions option = new EdgeOptions();
		//option.addArguments("start-maximized");
		//option.addArguments("disable-notifications");
		//option.addArguments("--headless");
		//option.addArguments("--incognito");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/msedgedriver.exe");
		//WebDriver driver = new msedgeDriver(option);
		
		//driver.get("https://www.easemytrip.co.uk/");
		

	}

}
