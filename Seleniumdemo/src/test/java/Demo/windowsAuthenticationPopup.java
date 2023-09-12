package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsAuthenticationPopup {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://admins:admins@the-internet.herokuapp.com/");
	
	//https:username:password@url
}
}
