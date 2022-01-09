package jdbcExamples;

import java.sql.*;

public class JdbcConnection 
{
	
	public static Connection provideConnection() 
	{    
        String url = "jdbc:mysql://localhost:3306/demojdbc";
          String username = "root";
          String password="12345";
          Connection conn=null;

          try {
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			 conn = DriverManager.getConnection(url, username, password);
			
			 
			 
		} catch (SQLException e)
          {
			e.printStackTrace();
		  } catch (ClassNotFoundException e)
          
          {
			e.printStackTrace();
		  }
		return conn;
     
         
          
	}
	
	
	
}
