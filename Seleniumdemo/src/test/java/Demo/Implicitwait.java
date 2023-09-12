package Demo;

import java.lang.module.FindException;
import java.net.PasswordAuthentication;
import java.time.Duration;

import javax.swing.plaf.basic.BasicPasswordFieldUI;
import javax.swing.text.PasswordView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://in.linkedin.com/");
	
	WebElement EmailOrPhone_TextField=driver.findElement(By.xpath("//input[@id='session_key']"));
	
	EmailOrPhone_TextField.sendKeys("Ashwini Bandawar");
	
	WebElement Password_TextField=driver.findElement(By.xpath("//input[@id='session_password']"));
	Password_TextField.sendKeys("1234567");
	
	
	
	WebElement signin_Button = driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']"));
	signin_Button.click();
	
}
}
