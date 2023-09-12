package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestionDropdown {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		
		List<WebElement>a=driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(Keys.ENTER);
		
		
		
		
		//for(int i=0;i<a.size();i++) {
//		if(a.get(i).getText().equalsIgnoreCase("India")) {
//			a.get(i).click();
//			break;
//		}
//		}
	}
	}

