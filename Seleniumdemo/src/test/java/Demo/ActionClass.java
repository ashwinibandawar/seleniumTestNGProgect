package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.manage().window().maximize();
	Actions obj=new Actions(driver);
	//i want to right click in selinium
	WebElement a=driver.findElement(By.xpath("//button[@id='openwindow']"));
     obj.contextClick(a).perform();
	//i want to double click in selenium
	
	//obj.doubleClick(a).perform();
	WebElement b=driver.findElement(By.xpath("//button[@id='mousehover']"));
	Thread.sleep(2000);
	obj.moveToElement(b).perform();
}
}