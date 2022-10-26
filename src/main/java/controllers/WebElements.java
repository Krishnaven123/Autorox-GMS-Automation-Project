package controllers;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WebElements extends BaseMethod {
	//Global Declarations
		//--------------------------------------------------------------------------------------------------------------------
		//public static HashMap<String, String> xpath_DB; // It will Store all X-paths
		static FileInputStream FIS;
		static XSSFWorkbook book;
		static XSSFSheet sheet; 
		static XSSFRow row;
		static XSSFCell cell;
		static XSSFCell cell2 = null;

		//Web-Element Location Readers
		//--------------------------------------------------------------------------------------------------------------------
		// This Method will get and store all those data
		public static void XpathHubStore(String Location, String SheetName) throws IOException {
			FIS = new FileInputStream(System.getProperty("user.dir") + "\\" + Location);
			book = new XSSFWorkbook(FIS);
			sheet = book.getSheet(SheetName);
			int LastRowNumber = sheet.getLastRowNum();
			log.info(":::::::::::::::::::::::::::::::::::::::::::::::::::: READING WEB ELEMENT LOCATIONS INTO XPATH HUB:::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			log.info("----------------------------------------------------------------------------------------------------------------------------------------------------------");
			for (int i = 0, j = 2, k = 1; k <= LastRowNumber; k++) {
				row = sheet.getRow(k);
				cell = row.getCell(i);
				cell2 = row.getCell(j);
				if (row != null && cell != null && cell2 != null) {
					if (cell.getStringCellValue() != "" && cell2.getStringCellValue() != "") {
						log.info("[" + cell.getStringCellValue() + "]" + " = " + "[" + cell2.getStringCellValue() + "]");
						log.info("----------------------------------------------------------------------------------------------------------------------------------------------------------");
						xpath_DB.put(cell.getStringCellValue(), cell2.getStringCellValue());
					}
				}
			}
			System.out.println(xpath_DB);
		}

		//--------------------------------------------------------------------------------------------------------------------
		// Using This Method, Required Xpath Will be Returned by matching element name
		public static String xpathGetter(String ElementName) throws IOException {
			return xpath_DB.get(ElementName);
		}

		//--------------------------------------------------------------------------------------------------------------------
		public static void closeXpathBook() throws IOException {
			book.close();
		}

}
