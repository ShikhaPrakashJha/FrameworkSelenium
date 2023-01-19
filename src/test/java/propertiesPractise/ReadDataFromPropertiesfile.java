package propertiesPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesfile 
{
	public static void main(String[] args) throws IOException 
	{
		
		
		
		//Step 1: convert physical file into java readable file
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		
		//Step 2:Create an instance for properties class. This class is available in java.util package
		Properties p=new Properties();
		
		
		//Step 3: 
		p.load(fis);
		String url=p.getProperty("url");
		long time=Long.parseLong(p.getProperty("timeouts"));
		System.out.println(url+"\t"+time);
		
	}

}
