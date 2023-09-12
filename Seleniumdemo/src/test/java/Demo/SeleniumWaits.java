package Demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// implicite wait --- global declaration--.

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		FluentWait wait1 = new FluentWait(driver);
		
        wait1.withTimeout(Duration.ofSeconds(30));
		wait1.pollingEvery(Duration.ofSeconds(5));

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkBoxOption1']")));
		
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();		
		
		
		
		
		
		
		
	}
}
