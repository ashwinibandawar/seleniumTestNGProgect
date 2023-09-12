package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlessmode {

	public static void main(String[] args) {
		
		
		//create object of chrome options
		
		ChromeOptions options = new ChromeOptions();
		
		//add the incognito argument
		
		options.addArguments("headless");
		
		//path the options parameter in the Chrome driver decelaration
		
		WebDriver driver = new ChromeDriver(options);
		
		//Navigate to toolsQa site url 
		
		driver.get("https://demoqa.com/");
		
		System.out.println(driver.getTitle());
		
		
		
		
	}
}
