package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods related to actions performed on properties file
 * @author User
 *
 */

public class PropertiesFileUtility 
{
	private Properties property;
	/**
	 * This method is used to initialize Properties file
	 * @param path
	 * @return
	 */
	public void propertyFileInitialization(String path)
	{
		FileInputStream fis=null; //we are declaring it as null because it will throw IO exception and it will be propagated.so e use try catch block to reinitialize it
		try
		{
			fis=new FileInputStream(path);  //creating an object here and reinitializing it
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();   //method to handle exception
		}
		property=new Properties();
		try
		{
			property.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public String fetchProperty(String path, String key)
	{
		return property.getProperty(key);     //click parameter key
	}
	
	/**
	 * This method is used to modify properties file
	 * 
	 */
public void modifyPropertiesFile(String key, String value, String path, String message)
{
	property.put(key, value);
	FileOutputStream fos= null;
	try
	{
		fos=new FileOutputStream(path);	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
