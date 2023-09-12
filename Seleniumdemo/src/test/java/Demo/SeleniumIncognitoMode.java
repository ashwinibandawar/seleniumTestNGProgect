package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SeleniumIncognitoMode {

	public static void main(String[] args) {
	
		//create object of chrome options
		ChromeOptions option = new ChromeOptions();
		
		//add the Incognito arguments
		
		option.addArguments("incognito");
		

		//pass the options parameter in the Chrome driver decleration
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		Actions obj = new Actions(driver);
		
		
		
	}

}
