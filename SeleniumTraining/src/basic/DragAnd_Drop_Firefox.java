package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnd_Drop_Firefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[text()='Oslo'][2]"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Norway']"));
		action.dragAndDrop(source, target).build().perform();
		
		WebElement source1 = driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		WebElement target1 = driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		action.dragAndDrop(source1, target1).build().perform();
		
		WebElement source2 = driver.findElement(By.xpath("//*[@id=\"box3\"]"));
		WebElement target2 = driver.findElement(By.xpath("//*[@id=\"box103\"]"));
		action.dragAndDrop(source2, target2).build().perform();
		
		WebElement source3 = driver.findElement(By.xpath("//*[@id=\"box7\"]"));
		WebElement target3 = driver.findElement(By.xpath("//*[@id=\"box107\"]"));
		action.dragAndDrop(source3, target3).build().perform();
		
		WebElement source4 = driver.findElement(By.xpath("//*[@id=\"box4\"]"));
		WebElement target4 = driver.findElement(By.xpath("//*[@id=\"box104\"]"));
		action.dragAndDrop(source4, target4).build().perform();
		
		WebElement source5 = driver.findElement(By.xpath("//*[@id=\"box2\"]"));
		WebElement target5= driver.findElement(By.xpath("//*[@id=\"box102\"]"));
		action.dragAndDrop(source5, target5).build().perform();
		
		WebElement source6 = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		WebElement target6 = driver.findElement(By.xpath("//*[@id=\"box105\"]"));
		action.dragAndDrop(source6, target6).build().perform();		
		
		
}
}