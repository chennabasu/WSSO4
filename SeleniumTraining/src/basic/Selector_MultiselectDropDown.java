package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selector_MultiselectDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("//C:/Users/chenna/Downloads/MultipleDropdown.html");
		WebElement food = driver.findElement(By.name("menu"));
		Select select = new Select(food);
		boolean flag = select.isMultiple();
		//System.out.println(flag);
		select.selectByVisibleText("Pizza");
		select.selectByVisibleText("Burger");
		//select.deselectByVisibleText("Pizza");
		//select.deselectByVisibleText("Burger");
		select.selectByVisibleText("Pasta");
		
	}

}
