package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NastedFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		WebElement a=driver.findElement(By.xpath("//frame[@name='frame-top']"));
		
		driver.switchTo().frame(a);
		
        WebElement b = driver.findElement(By.xpath("//frame[@name='frame-left']"));
        
        driver.switchTo().frame("frame-left");
        
        WebElement c= driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
      System.out.println(c.getText());
      
      Thread.sleep(2000);
      
       driver.switchTo().parentFrame();
       
     driver.switchTo().frame("frame-middle");
       
      WebElement d = driver.findElement(By.xpath("//div[@id='content']"));
      
      System.out.println(d.getText());
      
      Thread.sleep(2000);
      
  
    
    
    driver.switchTo().parentFrame();
    
    driver.switchTo().frame("frame-right");
    
    WebElement e = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
      
    System.out.println(e.getText());
    driver.switchTo().defaultContent();
    
    driver.switchTo().frame("frame-bottom");
    
    WebElement f = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
    
    System.out.println(f.getText());
    
    
    
    driver.close();
	}
}
