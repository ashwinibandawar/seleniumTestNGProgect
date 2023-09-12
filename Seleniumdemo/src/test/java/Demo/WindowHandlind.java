package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlind {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();	
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.xpath("//button[@id='openwindow']")).click();
	System.out.println(driver.getCurrentUrl());
	Set<String> w=driver.getWindowHandles();
	
	Iterator<String>it=w.iterator();
	String parent_window=it.next();//parent
	String child_window=it.next();//child
	driver.switchTo().window(child_window);
	System.out.println(driver.getCurrentUrl());
	
	
}
}
