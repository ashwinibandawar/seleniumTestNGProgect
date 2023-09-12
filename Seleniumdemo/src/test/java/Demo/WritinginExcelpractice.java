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

public class WritinginExcelpractice {

	public static void main(String[] args) throws IOException {

		String path = ("C:\\Users\\Jagdish\\Documents\\Shreenshot123\\Excel123.xlsx");

		FileInputStream fs = new FileInputStream(path);

		XSSFWorkbook wb = new XSSFWorkbook(fs);

		XSSFSheet sheet = wb.getSheetAt(0);

		int lastRow = sheet.getLastRowNum();
		Row row;
		Cell cell;
		for (int i = 1; i <= lastRow; i++) {

			try {

				row = sheet.getRow(i);
				cell = row.createCell(1);

				if (row.getCell(0) != null) {

					cell.setCellValue("10");

				} else {
					cell.setCellValue("0");
				}

			} catch (Exception e) {

				row = sheet.createRow(i);
				row = sheet.getRow(i);
				cell = row.createCell(1);
				cell.setCellValue("0");
			}
		}

		FileOutputStream a = new FileOutputStream(path);
		wb.write(a);
		a.close();
	}
}