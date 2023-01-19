package excelddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ChainingMethodsToReadDataInExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		FileInputStream fis= new FileInputStream("./src/test/resources/SampleTestData.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		System.out.println(wb.getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue());
		
		String data=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data);
		
		wb.close();
		
	}

}
