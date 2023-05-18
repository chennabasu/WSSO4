package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEquals {
	
	WebDriver driver;
	@Test
	public void assertionTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		//Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
		//Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		
		SoftAssert ast = new SoftAssert();
		ast.assertEquals(driver.getTitle(), "Demo Web Shop");
		
		driver.quit();
		ast.assertAll();
	}
	
	}

