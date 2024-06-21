package may27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite1 {
public static void main(String[] args) throws IOException {
	
	FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\Selenium with Java Course\\Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheet("Sheet1");
	
	//case 1: modifying an existing an cell in row
	//ws.getRow(1).getCell(0).setCellValue("Hyeee!");
	//ws.getRow(2).getCell(0).setCellValue("Byeee!");
	
	
	//case 2: creating a cell in an existing row 
	
	ws.getRow(4).createCell(0).setCellValue("D");
	
	//case 3: creating a row and cell in it
	ws.createRow(6).createCell(0).setCellValue(false);
	FileOutputStream fos=new FileOutputStream("C:\\Users\\DELL\\OneDrive\\Desktop\\Selenium with Java Course\\Book1.xlsx");
	wb.write(fos);
	fos.close();
	
}
}

