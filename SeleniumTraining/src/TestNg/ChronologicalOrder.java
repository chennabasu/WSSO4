package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
	
	@Test
	public void testAnnotation() {
		System.out.println("testAnnotation");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}
	
	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("BeforeSuit");
	}
	
	@AfterSuite
	public void AfterSuit() {
		System.out.println("AfterSuit");
	}
}
