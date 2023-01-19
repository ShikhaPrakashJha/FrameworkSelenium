//For writing the individual test cases for each modules we have to follow 3 steps
//1. Creating an object for each generic utility classes.
//2. Initializing all the files from there so that we can read data from excel and properties file.
//3. Calling the respective methods using the reference variable.
//parseLong is used to change String into long data type.

package vTigerTests;

import genericLibraries.ExcelUtility;
import genericLibraries.JavaUtility;
import genericLibraries.PropertiesFileUtility;
import genericLibraries.WebDriverUtility;

public class CreateOrganizationTest1 
{
	public static void main(String[] args, String IConstantPath, Object PROPERTY_FILE_PATH) 
	{
		PropertiesFileUtility property=new PropertiesFileUtility();  //  STEP 1: CREATING AN INSTANCE AND IMPORTING THE GENERIC UTILITY CLASSES
		ExcelUtility excel= new ExcelUtility();
		JavaUtility javaUtil=new JavaUtility();
		WebDriverUtility web=new WebDriverUtility();	
		
		
		property.propertyFileInitialization(IConstantPath.PROPERTY_FILE_PATH);            //STEP 2: INITIALIZATION
		excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		long time=Long.parseLong(property.fetchProperty("timeouts"));
		web.openApplication(property.fetchProperty("browser"), property.fetchProperty("url", time);
		
	}
}
