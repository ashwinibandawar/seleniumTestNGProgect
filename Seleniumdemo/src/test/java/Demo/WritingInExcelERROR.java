package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingInExcelERROR {

	public static void main(String[] args) throws IOException {

		String path = ("C:\\Users\\Jagdish\\Documents\\Shreenshot123\\Excel123.xlsx)");

		FileInputStream fs = new FileInputStream(path);

		XSSFWorkbook wb = new XSSFWorkbook(fs);

		XSSFSheet sheet1 = wb.getSheetAt(0);

		int lastRow = sheet1.getLastRowNum();

		for (int i = 1; i <= lastRow; i++) {

			Row row = sheet1.getRow(i);
			Cell cell = row.createCell(1);

			if (row != null) {

				cell.setCellValue("10");

			} else {
				cell.setCellValue("0");
			}
		}
		FileOutputStream a = new FileOutputStream(path);
		wb.write(a);
		a.close();
	}

}
