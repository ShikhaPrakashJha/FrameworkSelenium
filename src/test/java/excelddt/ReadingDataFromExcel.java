package excelddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		//step 1: convert physical file to java readable object
		
		FileInputStream fis= new FileInputStream("./src/test/resources/SampleTestData.xlsx");
		
		//step 2: open the excel workbook
		//Import workbook from org.apache.poi.ss.usermodel1
		//The below statement throw EncryptedDocumentException and IOException
		Workbook wb=WorkbookFactory.create(fis);
		
		// step3: Get control over particular sheet
		
		Sheet s=wb.getSheet("Sheet1");
		
		//step 4: get control over specific row
		Row r=s.getRow(0);
		
		//step 3: get control over specific cell
		
		Cell c= r.getCell(1);
		
		//step 5: Fetch data present in particular cell
		
		System.out.println(c.getStringCellValue());
		
		//step 7: Close workbook
		wb.close();
		
	}

}
