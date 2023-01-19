package genericLibraries;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * This class contains reusable methods of java
 * @author User
 *
 */

public class JavaUtility {
/**
 * This method generate random number
 * @param limit
 * @return
 */
	public int generateRandomNumber(int limit)
	{
		Random random=new Random();  //import from java.util 
		return random.nextInt(limit);
	}
	/**
	 * This method is used to fetch current date and Time
	 * @return
	 */
	
	public String getCurrentTime()
	{
		Date date=new Date(); //java.util
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_mm_ss"); //import date from java.text
		return sdf.format(date);
	}
}
