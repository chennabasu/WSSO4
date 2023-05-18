package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String WindowHandle = driver.getWindowHandle();
		System.out.println(WindowHandle);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.linkText("BOOKS")).click();
		Set<String>windowHandle = driver.getWindowHandles();
		for(String s:windowHandle) {
		System.out.println(s);
		}
		
	}

}
