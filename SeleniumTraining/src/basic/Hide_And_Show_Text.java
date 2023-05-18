package basic;

import java.security.PublicKey;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Hide_And_Show_Text {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Chenna");
	//hread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
	
	driver.findElement(By.xpath("//a[@id='opentab']")).click();
	//WebElement n = driver.findElement(By.partialLinkText("Home"));
	//boolean t = driver.findElement(By.partialLinkText("Home")).isDisplayed();
	//if(t){
	//System.out.println("Element Is Displyaed");
	//}else{
		//System.out.println("Element Is Not Displayed");
		//ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText("Cources"));
		//ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText("Blog"));
		
		//driver.findElement(By.xpath("//div[@id='navbarSupportedContent']//li[2]//a")).click();
		Set<String> WindowHandles = driver.getWindowHandles();
		for(String windowHandle : WindowHandles) {
			driver.switchTo().window(windowHandle);
			if(driver.getCurrentUrl().contains("QAClickAcademy"));
			//driver.close();
			
			driver.findElement(By.xpath("//a[@class='active']")).click();
			
		}
	}
	
	}


