package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutill {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream(new File("C:\\Users\\niraj\\eclipse-workspace\\TestProject123\\data\\Book1.xlsx"));
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet =workbook.getSheetAt(0);
		int rowcount =sheet.getLastRowNum();
		int colcount =sheet.getRow(1).getLastCellNum();
		for (int i=0; i<=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<colcount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
		

	}

}
