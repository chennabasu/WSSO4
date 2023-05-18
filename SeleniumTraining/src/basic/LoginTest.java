package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value= "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver = new ChromeDriver();
		
		//driver.findElement(By.xpath(""))

	}

}
