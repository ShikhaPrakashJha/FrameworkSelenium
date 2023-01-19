package excelddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFormatorP 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis= new FileInputStream("./src/test/resources/SampleTestData.xlsx");

		Workbook wb=WorkbookFactory.create(fis);

		DataFormatter df=new DataFormatter(); //it is used to get the exact numeric data in the cell, else int data might come in double

		System.out.println(df.formatCellValue(wb.getSheet("Sheet1").getRow(3).getCell(0))); //format cell value method return formatted value of a cell

		String data=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();

		System.out.println(data);

		wb.close();
	}

}
