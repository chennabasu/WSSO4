package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String name = "Yogitha";
		driver.findElement(By.name("enter-name")).sendKeys("name");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		if(alert.getText().contains(name)) {
		alert.accept();

	}

}
}
