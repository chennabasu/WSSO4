package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_DragAnd_Drop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
		Actions action =new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[text()='Oslo'][2]"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Norway']"));
		action.dragAndDrop(source, target).build().perform();
		

	}

}
