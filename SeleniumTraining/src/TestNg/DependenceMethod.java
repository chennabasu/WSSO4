package TestNg;

import org.testng.annotations.Test;

public class DependenceMethod {

	
	@Test(dependsOnMethods="RegisterTest")
	public void LoginTest() {
		System.out.println("Login Test Code");
	}

	@Test()
	public void RegisterTest() {
		System.out.println("Register Test Code");
	}
	
	@Test()
	public void CartTest() {
		System.out.println("Cart test Code");
	}
	
	@Test()
	public void WhishListTest() {
		System.out.println("WishL List Test Code");
	}
	
	@Test()
	public void EndToEndTest() {
		System.out.println("End To End test Code");
	}
}

