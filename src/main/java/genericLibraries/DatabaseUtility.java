package genericLibraries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

/**
 * This class contains reusable methods to perform operations on Database
 * 
 * @author User
 *
 */
public class DatabaseUtility {

	private Connection connection;

	public void databaseInitialization(String user, String password, String url) {
		Driver dbDriver = null;
		try {
			dbDriver = new Driver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(dbDriver);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(url, user, password);     //click on create parameter
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to fetch data from database
	 * @param query
	 * @param columnName 
	 * @return
	 * @throws SQLException 
	 */
	public List<String> readDataFromDatabase(String query, String columnName) throws SQLException
	{
		Statement statement=null;
		try
		{
			statement=connection.createStatement();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		ResultSet result=null;
		try {
			result=statement.executeQuery(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		List<String> columnData=new ArrayList<>();
		while(result.next())
		{
			columnData.add(result.getString(columnName));
		}
		return columnData;
	}
/**
 * This method is used to modify database
 * @param query
 * @return
 */
	public int modifyDatabase(String query) {
		Statement statement = null;
		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int result = 0;
		try {
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * This method closes database connection
	 * 
	 */

	public void closeDatabase() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}



//steps for createOrganization page:
//1.creating instance for utility files
//2.initialization of the utility files
//3. using the reference variable call the methods.



