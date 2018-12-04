package pc1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\sindh\\Desktop\\Test.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheetAt(0);
		
		int rowno = sheet.getLastRowNum();
		
		for(int i=0;i<=rowno;i++)
		{
			
			int colno = sheet.getRow(i).getLastCellNum();
			
			for(int j=0;j<colno;j++)
			{
				
				String out = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(out);
			}
			
			System.out.println("");
			
		}
		
		
		
		

	}

}

