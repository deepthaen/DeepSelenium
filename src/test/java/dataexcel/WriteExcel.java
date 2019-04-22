package dataexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WriteExcel {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		// TODO Auto-generated method stub
		
	//	private static final String FILE_NAME  = "C:\\Users\\DEEPTHA.NAIK\\Desktop\\WriteExcel.xls"; 
		FileInputStream file = new FileInputStream("C:\\Users\\DEEPTHA.NAIK\\Desktop\\WriteExcel.xls"); 
		Workbook wb = WorkbookFactory.create(file); 
		Sheet sheet = wb.getSheet("Sheet1"); 
	    int num = sheet.getLastRowNum(); 
	    Row row = sheet.createRow(++num); 
	    row.createCell(0).setCellValue("xyz"); 
	    
	         
	        // Now this Write the output to a file 
	        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\DEEPTHA.NAIK\\Desktop\\WriteExcel.xls"); 
	    wb.write(fileOut); 
	    System.out.println("Wrote in excel");
	    fileOut.close(); 

	}

}
