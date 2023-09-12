package Demo;

import java.time.Year;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderHandeling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
        
		driver.switchTo().frame(0);
		WebElement Date_of_Box = driver.findElement(By.xpath("//input[@id='datepicker']"));
         
		Date_of_Box.click();
		
		String Expected_Month = "October";
		String Expected_year = "2024";
		String Excepted_date ="20";
		
		while(true) {
			
			WebElement current_Month =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			String Month = current_Month.getText();
			
			WebElement current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
			String year = current_year.getText();
			
			
			if(Month.equals(Expected_Month) && year.equals(Expected_year)) {
				
				List<WebElement> All_Dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				for(WebElement e : All_Dates) {
					
					String dates=e.getText();
					
					if(dates.equals(Excepted_date)) {
						e.click();
						break;
						
					}
				}
				
				
			}else {
				
				WebElement Arrow_Key = driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]"));
				Arrow_Key.click();
				
				Thread.sleep(2000);
			}
		}
	}

}
