package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
 public static void main(String[] args) throws InterruptedException {

	 
	 WebDriver driver=new ChromeDriver();	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	 //handle select dropdown
	WebElement a=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		//if we have tagname select the only we use select class--
		Select s=new Select(a);
	    //s.selectByIndex(1);
	    //s.selectByValue("USD");
	     s.selectByVisibleText("AED");
	     
	     driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	     Thread.sleep(2000);
	     for(int i=0; i<3;i++) {
	     driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	     }
}
 }
