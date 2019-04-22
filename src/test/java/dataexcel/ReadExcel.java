package dataexcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.bind.annotation.W3CDomHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {


	public static void read() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream file = new FileInputStream("./data/MobileTestData.xls"); // reading excel file name


		Workbook wb = WorkbookFactory.create(file); // 	

		Sheet sheet = wb.getSheet("Credentials");


		int lr = sheet.getLastRowNum();
		System.out.println("Lat row number :: "+lr);
		Cell cell = sheet.getRow(1).getCell(2);

		System.out.println(cell.getStringCellValue());


	}



	public static String readCredentials(String uniq,String topHeader) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream file = new FileInputStream("./data/MobileTestData.xls"); // reading excel file name
		Workbook wb = WorkbookFactory.create(file); // 	
		Sheet sheet = wb.getSheet("Credentials");
		int lr = sheet.getLastRowNum();
		short col = sheet.getRow(0).getLastCellNum();
		
		String value = null;
		
		for (int i = 0; i <lr+1; i++) {
		
			String slnoColumns = sheet.getRow(i).getCell(0).toString();
		
			
			if (slnoColumns.equalsIgnoreCase(uniq)) {
				
				
				
				for (int j = 0; j <col; j++) {
					
					
					
					String headers = sheet.getRow(0).getCell(j).getStringCellValue();
					if (headers.equalsIgnoreCase(topHeader)) {
						value = sheet.getRow(i).getCell(j).getStringCellValue();
					}
				}
			}
		}
		return value;
		
		
	}

	/* public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		//read();
		/*
		 * readCredentials("test2","UserName"); readCredentials("test2","Password");
		 */
		
	//	String username = readCredentials("test1", "UserName");
	//	System.out.println(username);
		
		
	//} */

}
