package propertiesPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WriteDataInExcel 
{
	public static void main(String[] args) throws IOException 
	{
	
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		Properties p=new Properties();
		p.load(fis);
		
		
		
		
	}

}
