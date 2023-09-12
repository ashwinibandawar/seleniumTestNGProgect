package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelHandling {
	public static void main(String[] args) throws IOException {
		// To Read the data--

		FileInputStream fs = new FileInputStream("C:\\Users\\Jagdish\\Documents\\Shreenshot123\\ExcelFile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0); // sheet control

		Row row = sheet.getRow(1);// row

		Cell cell1 = row.getCell(0);

		System.out.println(cell1);

		Cell cell2 = row.getCell(1);

		System.out.println(cell2);

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(cell1.toString());
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(cell2.toString());
	}
}
