package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
public static void main(String[] args) throws InterruptedException  {
	
	
	WebDriver driver= new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	Thread.sleep(3000);
	
	for(int i=0; i<9;i++) {
    driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	}
	System.out.println(driver.switchTo().alert().getText());
	
	
	
}
}