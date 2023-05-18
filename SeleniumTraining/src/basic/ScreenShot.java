package basic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File dest = new File("./ScreenShots/Screen1.png");
		File temp = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(temp, dest);
	}

}
