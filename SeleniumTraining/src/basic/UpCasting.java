package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpCasting {

	public static void main(String[] args) {
		
		String key = "webdriver.chrome.driver";
		String value= "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty(key,value);
		
		WebDriver driver = new ChromeDriver(); 
		
		


	}

}
