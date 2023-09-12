package Demo;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screnshotpractice {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement a = driver.findElement(By.xpath("//input[@name='enter-name']"));

		File src1 = a.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src1, new File("C:\\Users\\Jagdish\\Documents\\Data123\\test123.png"));
	}
}
