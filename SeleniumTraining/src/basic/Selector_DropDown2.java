package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selector_DropDown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("BOOKS")).click();
		
		//Address Of Web Element
		
		WebElement sortByDD = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(sortByDD);
		List<WebElement> options = sel.getOptions();
		for(int i=0; i<options.size();i++) {
			WebElement sortByDropDown = driver.findElement(By.id("products-orderby"));
			Select select = new Select(sortByDropDown);
			select.selectByIndex(i);
		}

	}

}
