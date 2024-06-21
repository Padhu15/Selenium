package may27;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	private static XSSFWorkbook wb;

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\Selenium with Java Course\\Book1.xlsx");
	   wb = new XSSFWorkbook(fis);
	   XSSFSheet ws=wb.getSheet("Sheet1");
	  System.out.println( ws.getLastRowNum());
	  System.out.println(ws.getPhysicalNumberOfRows());
	  	XSSFRow row=ws.getRow(3);
	   System.out.println(row.getLastCellNum());
	   System.out.println(row.getPhysicalNumberOfCells());
	   
	   
	   XSSFCell cell2=row.getCell(0);
	  CellType cellType= cell2.getCellType();
	  if(cellType.equals(CellType.STRING)) {
		  System.out.println(cell2.getStringCellValue());
		  }
	  else if(cellType.equals(CellType.NUMERIC))
	  {  
		  System.out.println(cell2.getNumericCellValue());
		  
	  }
	  else if(cellType.equals(CellType.BOOLEAN) ){
		  
		  System.out.println(cell2.getBooleanCellValue());
	  }
		  
		  
	  }
	
	
	}


