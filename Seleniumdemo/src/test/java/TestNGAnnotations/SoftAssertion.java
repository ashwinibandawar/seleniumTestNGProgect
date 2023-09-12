package TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	
	@Test
	public void verifyLogipageTitle() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.linkedin.com/login");
	
	String expectedpageTitle="LinkedIn Login, Sign in | ";
	String actualTitle = driver.getTitle();
	
	SoftAssert As = new SoftAssert();
	
	As.assertEquals(actualTitle, expectedpageTitle);
	System.out.println("Page Title Assertion Completed");
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashu");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String ExpectedErrorText = "Please enter a valid username";
	String AcctualErrorText = driver.findElement(By.xpath("//div[@id='error-for-username']")).getText();
	
	As.assertEquals(AcctualErrorText, ExpectedErrorText);
	System.out.println("Error Text Assertion Completed");
	
	
	As.assertAll();
	driver.close();
	}
	
	@Test
	public void verifyFaceBookpageTitle() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	String expectedPageTitle = "Facebook – log in or sign up";
	String actualPageTitle = driver.getTitle();
	
	SoftAssert SA = new SoftAssert();
	
	SA.assertEquals(actualPageTitle, expectedPageTitle);
	
	System.out.println("FaceBook Page Title Assertion Completed");
		
	}
}

