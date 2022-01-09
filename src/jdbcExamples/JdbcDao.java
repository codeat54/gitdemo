package jdbcExamples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcDao
{
    public void addStudent(Student student) throws SQLException  
    {
    	Connection connection = JdbcConnection.provideConnection();
    	
    	String query = "insert into student values(?,?,?,?)";
    	
    	PreparedStatement pst =connection.prepareStatement(query);
    	   
    	      pst.setInt(1,student.getId());
    	      pst.setString(2,student.getFname());
    	      pst.setString(3, student.getLname());
    	      pst.setString(4,student.getCity());
    	      
    	     int count= pst.executeUpdate();
    	      System.out.println("rows affected : "+ count);
    	
    }
    
    
    public void getStudent(Student student) throws SQLException 
    {
    	Connection connection = JdbcConnection.provideConnection();
    	
    	String query = "select city from student where id=17";
    	PreparedStatement pst =connection.prepareStatement(query);
    	
    	ResultSet rs = pst.executeQuery();
    	    
    	 rs.next();
    	
    	   
    	  
    	   String city = rs.getString("city");
    	   
    	   System.out.println(city);
    	
    }
    
    public Student getSStudent(Student student) throws SQLException 
    {
    	Student sss=null;
    	Connection connection = JdbcConnection.provideConnection();
    	
    	String query = "select * from Student where id = 17";
    	PreparedStatement pst =connection.prepareStatement(query);
    	
    	ResultSet rs = pst.executeQuery();
    	//  Student sss = new Student();
    	  
    	while(rs.next())
    	{
    		 sss = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(3));
    		
    		  /*sss.setId(rs.getInt(1));
    		  sss.setFname(rs.getString(2));
    		  sss.setLname(rs.getString(3));
    		  sss.setCity(rs.getString(4));
    		  */
    		  
    	
    	}
		return sss;
    	
    	
    }
    
    
	public void getAllStudents() throws SQLException 
	{
		Connection connection = JdbcConnection.provideConnection();
		
		String query = "select * from Student";
    	PreparedStatement pst =connection.prepareStatement(query);
    	
    	ResultSet rs = pst.executeQuery();
    	
    	while(rs.next()) 
    	{
    		System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4));
    	}
    	
		
		
	}
	
	
	public List<Student> getAllStudentList() throws SQLException 
	{
        Connection connection = JdbcConnection.provideConnection();
		
		String query = "select * from Student";
    	PreparedStatement pst =connection.prepareStatement(query);
    	
    	ResultSet rs = pst.executeQuery();
		
    	List<Student>mylist = new ArrayList<>();
    	
    	while(rs.next()) 
    	{
    		Student ss = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
              
    		    mylist.add(ss);
    	}
    	 return mylist;
    	
	}
	
	
}
