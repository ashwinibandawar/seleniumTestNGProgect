package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxBoxHandeling {


public static void main(String[] args) {
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	//i want to select only one checkbox
	WebElement a=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
	a.click();
	
	//different methods of checkbox,button,radiobox--
	
	System.out.println(a.isDisplayed());
	
	System.out.println(a.isEnabled());
	
	System.out.println(a.isSelected());
	
	//i Want to select all checkboxs--
	
	List<WebElement>b=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(b.size());
	
	//We have to apply the loop over the list--
	
	//0,1,2--allSelect checkbox---using for loop
	
	for(int i=0;i<b.size();i++) {
		b.get(i).click();
	}
	
	//even number

	for(int i=0;i<=100;i++) {
		
		System.out.println(i);
	}
	}
	
}	
