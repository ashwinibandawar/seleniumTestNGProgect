package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandlingPractice {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream As = new FileInputStream("C:\\Users\\Jagdish\\Documents\\Shreenshot123\\ExcelFile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(As);
		XSSFSheet sheet = workbook.getSheetAt(0);

		int Row = sheet.getLastRowNum() + 1;
		int Cell = sheet.getRow(0).getLastCellNum();

		for (int i = 1; i <=3; i++) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://login.salesforce.com/?locale=in");

			WebElement a = driver.findElement(By.xpath("//input[@id='username']"));
			a.sendKeys(sheet.getRow(i).getCell(0).toString());

			Thread.sleep(2000);

			WebElement b = driver.findElement(By.xpath("//input[@id='password']"));

			b.sendKeys(sheet.getRow(i).getCell(1).toString());

			Thread.sleep(2000);

			WebElement c = driver.findElement(By.xpath("//input[@id='Login']"));
			c.click();

			Thread.sleep(2000);

			driver.quit();

		}

	}
}
