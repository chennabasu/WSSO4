package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenInternetExplorer {

	public static void main(String[] args) {
		
		String key="webdriver.ie.driver";
		String value="C:\\Program Files\\Internet Explorer\\iexplore.exe";
		System.setProperty(key,value);
		WebDriver diver = new InternetExplorerDriver();
		

	}

	

}
