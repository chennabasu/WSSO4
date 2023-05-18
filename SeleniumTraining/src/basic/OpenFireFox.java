package basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox {

	public static void main(String[] args) {
		
		String key="webdriver.gecko.driver";
		String value="C:\\Selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver = new FirefoxDriver();
		
	}

}
