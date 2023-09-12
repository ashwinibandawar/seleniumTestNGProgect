package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class totallinkonthepage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		List<WebElement> obj = driver.findElements(By.tagName("a"));
		
		System.out.println(obj.size());
		
		for(int i=0; i<obj.size();i++) {
 
		String
		linkText = obj.get(i).getText();
		
		System.out.println(linkText);
		
		String
		urlText = obj.get(i).getAttribute("");
		
		System.out.println(urlText);
		}
		
		
		
		
	}
}
