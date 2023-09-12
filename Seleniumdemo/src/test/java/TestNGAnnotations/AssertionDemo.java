package TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

	
	@Test
	public void verifyinvalidlogin() {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Ashu");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		String ExpectedText = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		String actualText = driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		Assert.assertEquals(actualText, ExpectedText);
	}
}
