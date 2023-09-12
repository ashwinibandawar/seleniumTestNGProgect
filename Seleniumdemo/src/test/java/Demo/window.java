package Demo;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='ntc__chip-wrapper'])[2]")).click();

		Set<String> w = driver.getWindowHandles();
		Iterator<String> it = w.iterator();
		String parent_Tab = it.next();
		String child_Tab = it.next();

		driver.switchTo().window(child_Tab);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//a[@class='title ellipsis'])[1]")).click();

		Set<String> a = driver.getWindowHandles();
		Iterator<String> b = a.iterator();
		String parent_tab = b.next();
		String child1_tab = b.next();
		String child2_tab = b.next();

		Thread.sleep(1000);
		driver.switchTo().window(child2_tab);
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(1000);

		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(parent_tab);
		System.out.println(driver.getCurrentUrl());

	}
}
