package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablesHandeling {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	List<WebElement> obj = driver.findElements(By.xpath("(//table[@id='product'])[2]/tbody/tr/td[4]"));
	
	System.out.println(obj.size());
	
	int sum = 0;
	for(int i=0;i<obj.size();i++) {
		
		String amount = obj.get(i).getText();
		
		// Convert from String to int 
		
		int a= Integer.parseInt(amount);
		
		sum =sum+a;	
	}
	
	System.out.println(sum);
	WebElement b= driver.findElement(By.xpath("//div[@class='totalAmount']"));
	
	String text = b.getText();
	
	String c = text.substring(24);
	
	int d = Integer.parseInt(c);
	
	System.out.println(d);
	if(sum == d) {
		System.out.println("amount is matching successfully");	
		
	}else {
		System.out.println("amount is not matching successfully");
	}
	
	
	
	
}
}
