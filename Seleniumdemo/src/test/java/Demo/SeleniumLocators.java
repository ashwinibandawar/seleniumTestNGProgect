package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://login.salesforce.com/");
	
	
	driver.findElement(By.id("username")).sendKeys("test");
	
	driver.findElement(By.name("pw")).sendKeys("123");
	
	driver.findElement(By.id("Login")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Forget Your Password?")).click();
	
	driver.findElement(By.partialLinkText("Forgot Your")).click();
	
	driver.findElement(By.name("cancel")).click();
	
	driver.findElement(By.partialLinkText("Use Custom Domain")).click();
	
	
	
}

}
