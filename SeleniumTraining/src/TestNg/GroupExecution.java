package TestNg;

import org.testng.annotations.Test;

public class GroupExecution {
	
	@Test(groups = "Functional")
	public void LoginTest() {
		System.out.println("Login Test Code");
	}

	@Test(groups = "Integration")
	public void RegisterTest() {
		System.out.println("Register Test Code");
	}
	
	@Test(groups = "Integration")
	public void CartTest() {
		System.out.println("Cart test Code");
	}
	
	@Test(groups = "Integration")
	public void WhishListTest() {
		System.out.println("WishL List Test Code");
	}
	
	@Test(groups = "System")
	public void EndToEndTest() {
		System.out.println("End To End test Code");
	}
}
