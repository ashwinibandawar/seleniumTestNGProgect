package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		/*WebElement Radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));

		System.out.println("radio Button is Display or not on web Page" + Radio1.isDisplayed());

		System.out.println("radio button is enable or not on web page" + Radio1.isEnabled());
		System.out.println("radio Button is Selected or not on web Page" + Radio1.isSelected());

		Radio1.click();
		System.out.println("radio Button is Selected or not on web Page" + Radio1.isSelected());*/
		
		List<WebElement> As = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(As.size());

		/*for(int i=0; i<As.size();i++) {
			
			As.get(i).click();*/
			//Thread.sleep(2000);
			
			//odd and even
			/*for(int i=1; i<As.size();i=i+2) {
				
			As.get(i).click();*/
			
			//Thread.sleep(2000);
			
			//even
			
			for(int i=0;i<As.size();i=i+2) {
				
				As.get(i).click();
				Thread.sleep(2000);
		}
		
		
		
		
		
		
		driver.close();
		
		
		
	}

}
