package basic;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeDriver {

	public static void main(String[] args) {

		String key="webdriver.edge.driver";
		String value="C:\\Selenium\\edgedriver_win32\\msedgedriver.exe";
		System.setProperty(key,value);

		EdgeDriver driver = new EdgeDriver();
		
	}

}
