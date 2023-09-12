package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*WebElement Option1CheckBox = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		
		Option1CheckBox.click();*/
		
		//odd
		List<WebElement> CheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(CheckBox.size());
		
		for(int i=0; i<CheckBox.size();i=i+2) {
			
			CheckBox.get(i).click();
		}
		
	}
	
	
}
