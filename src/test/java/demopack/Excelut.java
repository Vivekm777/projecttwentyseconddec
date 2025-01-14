package demopack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelut {
	
	public static void main (String[] args) throws IOException {
		
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestDataFile\\TestData.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("LoginPage");
	int total_rows=sheet.getLastRowNum();
	int total_cells=sheet.getRow(0).getLastCellNum();
	
	
	System.out.println(total_rows);
	System.out.println(total_cells);
	
	for(int r=0;r<=total_rows;r++) {
	
		XSSFRow currentrow=sheet.getRow(r);
		
	for(int c=0;c<total_cells;c++) {
		
		XSSFCell currentcell=currentrow.getCell(c);
		System.out.print(currentcell.toString()+"\t");
		
		
		
		
		
		
	}
	
	System.out.println();
	}
		
		

	
	workbook.close();
	file.close();
		
	}

}
