package com.Arvind.DeepSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchDataFrmExcl {
	public static void readExcel(String filePath,String fileName,String sheetName) throws IOException{
	
	//Create an object of File class to open xlsx file

    File file =    new File(filePath+"\\"+fileName);

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

    Workbook ExWorkbook = null;

    //Find the file extension by splitting file name in substring  and getting only extension name

    String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file

    if(fileExtensionName.equals(".xlsx")){

    //If it is xlsx file then create object of XSSFWorkbook class

    ExWorkbook = new XSSFWorkbook(inputStream);

    }

    //Check condition if the file is xls file

    else if(fileExtensionName.equals(".xls")){

        //If it is xls file then create object of XSSFWorkbook class

        ExWorkbook = new HSSFWorkbook(inputStream);

    }

    //Read sheet inside the workbook by its name

    Sheet ExSheet = ExWorkbook.getSheet(sheetName);

    //Find number of rows in excel file

    int rowCount = ExSheet.getLastRowNum()-ExSheet.getFirstRowNum();

    //Create a loop over all the rows of excel file to read it

    for (int i = 0; i < rowCount+1; i++) {

        Row row = ExSheet.getRow(i);

        //Create a loop to print cell values in a row

        for (int j = 0; j < row.getLastCellNum(); j++) {

            //Print Excel data in console

            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

        }

        System.out.println();
    } 

    }  

    //Main function is calling readExcel function to read data from excel file

    public static void main(String...strings) throws IOException{

    //Create an object of ReadGuru99ExcelFile class

    readExcel("./data", "MobileTestData.xls", "Credentials");

    //Prepare the path of excel file

    String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";

    //Call read file method of the class to read data

   // objExcelFile.readExcel(filePath,"ExportExcel.xlsx","ExcelGuru99Demo");

    }

	
	
	
/*	//private static String FILENAME = "./test-output/MobileTestData.xlsx";
	
	public static HashMap<String, String> readExcelData(String sheetname, String uniqueValue)  {
		try{
			String key, value = null;

			FileInputStream file = new FileInputStream("./test-output/MobileTestData.xlsx");
			HashMap<String,String> dataMap = new HashMap<String, String>();
			Workbook wb = WorkbookFactory.create(file);
			Sheet sheet = wb.getSheet(sheetname);
			Iterator<Row> it = sheet.rowIterator();

			Row headers = it.next();
			while(it.hasNext()) {

				Row record = it.next();
				String cellValue = record.getCell(0).toString();
				if(cellValue.equalsIgnoreCase(uniqueValue)) {
					for(int i=0;i<headers.getLastCellNum();i++){
						key = headers.getCell(i).toString().trim();
						try{
							value = record.getCell(i).toString().trim();
						}catch(Exception e){}
						dataMap.put(key, value);
					}

					break;
				}
			}
			return dataMap;
		}
		catch(Exception e){}
		return null;
	}
	*/
	
/*	
	public static void main(String[] args) throws IOException, InvalidFormatException {

        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");

        /*
           =============================================================
           Iterating over all the sheets in the workbook (Multiple ways)
           =============================================================
        */
/*
        // 1. You can obtain a sheetIterator and iterate over it
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        System.out.println("Retrieving Sheets using Iterator");
        while (sheetIterator.hasNext()) {
            Sheet sheet = sheetIterator.next();
            System.out.println("=> " + sheet.getSheetName());
        }

        // 2. Or you can use a for-each loop
        System.out.println("Retrieving Sheets using for-each loop");
        for(Sheet sheet: workbook) {
            System.out.println("=> " + sheet.getSheetName());
        }

        // 3. Or you can use a Java 8 forEach with lambda
        System.out.println("Retrieving Sheets using Java 8 forEach with lambda");
        workbook.forEach(sheet -> {
            System.out.println("=> " + sheet.getSheetName());
        });

        /*
           ==================================================================
           Iterating over all the rows and columns in a Sheet (Multiple ways)
           ==================================================================
        */

        // Getting the Sheet at index zero
/*        Sheet sheet = workbook.getSheetAt(0);

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        // 1. You can obtain a rowIterator and columnIterator and iterate over them
        System.out.println("\n\nIterating over Rows and Columns using Iterator\n");
        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            // Now let's iterate over the columns of the current row
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }

        // 2. Or you can use a for-each loop to iterate over the rows and columns
        System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
        for (Row row: sheet) {
            for(Cell cell: row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }

        // 3. Or you can use Java 8 forEach loop with lambda
        System.out.println("\n\nIterating over Rows and Columns using Java 8 forEach with lambda\n");
        sheet.forEach(row -> {
            row.forEach(cell -> {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            });
            System.out.println();
        });

        // Closing the workbook
        workbook.close();
    }

	
*/
}
