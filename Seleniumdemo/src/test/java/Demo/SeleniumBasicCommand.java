package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicCommand {

	public static void main(String[] args) throws InterruptedException {
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Session id 123----
		//to launch the URL
		driver.get("https://www.amazon.in/");
		
		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		//To print the Current URL
		String UrlName=driver.getCurrentUrl();
		System.out.println(UrlName);
		
		//To print the title of the page
		System.out.println(driver.getTitle());	
		
		//To go backward
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//To go forward
		driver.navigate().forward();
		
		//it will closed the current open browser--
		
		driver.close();   //invalid session
		
		WebDriver driver1 =new ChromeDriver();
		
		driver1.get("https://www.amazon.in/");
		
		driver.quit();
		driver.get("https://www.amazon.in/");
		
	}

}
