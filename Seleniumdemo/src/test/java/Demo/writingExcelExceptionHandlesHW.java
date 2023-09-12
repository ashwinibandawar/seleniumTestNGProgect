package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingExcelExceptionHandlesHW {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\Jagdish\\Documents\\Shreenshot123\\AexcelHandeling.xlsx";
		FileInputStream fs = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		Sheet s = wb.getSheetAt(0);
		int lastRow = s.getLastRowNum();// 7

		Row row;
		Cell cell;
		for (int i = 1; i <= lastRow; i++) {

			try {

				row = s.getRow(i);
				cell = row.createCell(1);

				if (row != null) {
					cell.setCellValue("10");
				} else {
					cell.setCellValue("0");
				}

			} catch (Exception e) {

				row = s.createRow(i);
				row = s.getRow(i);
				cell = row.createCell(1);
				cell.setCellValue("0");

			}

		}

		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();

	}

}
