package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables2 {
public static void main(String[] args) {
	
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	List<WebElement> obj=driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[3]"));
	
	System.out.println(obj.size());
	
	List<WebElement> obj2 = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[4]"));
	System.out.println(obj2.size());
	
	for(int i=0;i<obj.size();i++) {
		
	for(int j=i;j<obj2.size();j++) {
		
		String citydata=obj.get(i).getText();
		String amountdata=obj2.get(i).getText();
		
		System.out.println(citydata.concat(" "+ amountdata));
		break;
		
		
	}
	}
	
	driver.quit();
	
	
}
}
