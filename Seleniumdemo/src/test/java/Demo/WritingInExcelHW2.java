package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WritingInExcelHW2 {
public static void main(String[] args) throws IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	String path =("C:\\Users\\Jagdish\\Documents\\Shreenshot123\\New Excel 456.xlsx");
	
	FileInputStream As= new FileInputStream(path);
	XSSFWorkbook wb = new XSSFWorkbook(As);
     XSSFSheet s = wb.getSheetAt(0);
    
    int lastRow = s.getLastRowNum();
    
    
    //for(int i=0; i<=; i++) {
    	
    	
    }
}

