package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggesteddropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement CountryDropDown = driver.findElement(By.xpath("//input[@type='text']"));
		CountryDropDown.sendKeys("Ind");
		Thread.sleep(2000);
		
		List<WebElement> Element = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		
		System.out.println(Element.size());
		
		/*for(int i=0;i<Element.size();i++) {
			
			if(Element.get(i).getText().equalsIgnoreCase("India")) {
				Element.get(i).click();
				Thread.sleep(2000);
				
			}
		}*/
		
		/*for(WebElement Element1 : Element) {
			
			if(Element1.getText().equalsIgnoreCase("India")) {
	            Element1.click();
				Thread.sleep(2000);*/
				
			
			
		}
		
}	
	

