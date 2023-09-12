package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TEstNGAnotation1 {

	@Test

	public void Test() {
		System.out.println(" Test Method");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test1 Method");
	}
	
	@BeforeSuite
	public void TestBeforesuit() {
		System.out.println(" BeforeSuit");
	}
	@AfterSuite
	public void TestAfterSuit() {
		System.out.println(" AfterSuit");
	}
	@BeforeTest
	public void TestBeforeTest() {
		System.out.println(" BeforeTest");
	}
	
	@AfterTest
	public void TestAfterTest() {
		System.out.println(" AfterTest");
	}
	
	@BeforeClass
	public void TestBeforeClass() {
		System.out.println(" Before Class ");
	}
	
	@AfterClass
	public void TestAfterClass() {
		System.out.println(" AfterClass");
	}
	
	@BeforeMethod
	public void TestBeforeMethod() {
		System.out.println(" BeforeMethod");
	}
	
	@AfterMethod
	public void TestAfterMethod() {
		System.out.println(" AfterMethod");
	}
	
	
	
}
