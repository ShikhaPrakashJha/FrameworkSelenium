package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDatabase 
{
	public static void main(String[] args) throws SQLException 
	{
		//step 1: create an instance for driver
		//driver should be imported from com.mysql.cj.jdbc.Driver
		//new driver() throws SQL Exception
		
		Driver dbdriver=new Driver();
		
		//Step2: Register to dbDriver
		//DriverManager is in java.sql package
		
		DriverManager.registerDriver(dbdriver);  //driverManager is a class
		
		//Step 3: Establish database connection
		//Connection should be imported from java.sql package
		
		Connection connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/advsel", "root","root");  //url,un and pwd
		
		//step 4: Create statement 
		//statement should be imported from java.sql package
		
		Statement statement=connect.createStatement();  //to create statement
		
		//step 5: Execute query to fetch data
		
		ResultSet result=statement.executeQuery("select * from students;");  //ResultSet is an interface where result will come i.e entire table
		
		while(result.next())
		{
			System.out.println(result.getInt(1)+"\t"+result.getString(2));
			
		}
		
		//Step 6: close database
		connect.close();
		
	}

}
