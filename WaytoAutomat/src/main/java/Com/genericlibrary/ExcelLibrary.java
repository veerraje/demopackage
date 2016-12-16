package Com.genericlibrary;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelLibrary {
 
	HSSFWorkbook wb ;
	HSSFSheet sheet1;
	 ExcelLibrary(String excelpath) throws Exception 
	
	{
		 File src = new File(excelpath);
		 FileInputStream fis = new FileInputStream(src);
		 wb = new HSSFWorkbook(fis);
		 sheet1 = wb.getSheetAt(0);
		
	}
	
	 public String getdata(int sheetnumber, int row, int column)
	 {
		 sheet1 = wb.getSheetAt(sheetnumber);
		 String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		 return data;
	 }
	 
}
