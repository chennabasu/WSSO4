package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	@Test(dataProvider ="Register")
	public void RegisterTestData(String Gender, String FirstName, String LastName, String Email, String Password) {
		System.out.println(Gender);
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(Email);
		System.out.println(Password);
		
			}
	//@DataProvider(name = "Register")
	//public void String[][] testData(){
		
	
	}
	

//}
