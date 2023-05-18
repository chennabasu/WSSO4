package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_UpLoad {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximise();
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.findElement(By.xpath("//*[@id=\"__picker-input\"]")).sendKeys("C:\\Users\\chenna\\Desktop\\Resume_TestAuto.pdf");
		
		

	}

}
