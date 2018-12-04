package pc1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\sindh\\Desktop\\out.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("hello");
		
		sheet.createRow(0).createCell(3).setCellValue("pass");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		book.write(fo);
		book.close();
		fo.close();
		

	}

}
