package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nastedframe {
public static void main(String[] args) {
	
	
	
	WebDriver driver= new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/nested_frames");
    
    WebElement a=driver.findElement(By.xpath("//frame[@name='frame-top']"));
     driver.switchTo().frame(a);
     WebElement Leftframe = driver.findElement(By.xpath("//frame[@name='frame-left']"));
     driver.switchTo().frame(Leftframe);
     WebElement leftText=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
     System.out.println(leftText.getText());
     
     
     driver.switchTo().parentFrame();
     
    driver.switchTo().frame("frame-middle");
    
   
    WebElement Middleframe = driver.findElement(By.xpath("//div[@id='content']"));
     System.out.println(Middleframe.getText());
    
     driver.switchTo().parentFrame();
  
     driver.switchTo().frame("frame-right");
     
     WebElement Rightframe = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
     System.out.println(Rightframe.getText());
     
     driver.switchTo().defaultContent();
     
     driver.switchTo().frame("frame-bottom");
     
     WebElement Bottomframe = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
     System.out.println(Bottomframe.getText());
    driver.quit();
    
    
    
}
}
