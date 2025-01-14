package demopack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilyDemo {
	
	//Excelfile--workbook--sheet---rows----cells
	//FileInputStream -used to read data from excel file
	//FileOutputStream-used to write data from excel file
	public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestDataFile\\TestData.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);//extract workbook from this particular file
	XSSFSheet  sheet=workbook.getSheet("LoginPage");//get name of sheet
	int totalrow=sheet.getLastRowNum();//4
	int totalcells=sheet.getRow(0).getLastCellNum();//2
	
	System.out.println(totalrow);
	System.out.println(totalcells);
	
	
	for(int r=0;r<=totalrow;r++) {
		
		 XSSFRow currentRow=sheet.getRow(r);
	
		for(int c=0;c<totalcells;c++) {
			
		XSSFCell cell=currentRow.getCell(c);	
		System.out.print(cell.toString()+"\t");//tab+space	
		}
		
		
		System.out.println();
	}
	
	

	
	
	workbook.close();
	file.close();
	
	
	
	
	}	

}
