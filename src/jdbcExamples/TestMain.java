package jdbcExamples;

import java.sql.SQLException;
import java.util.List;

public class TestMain {

	public static void main(String[] args)
	{
	    Student s1 = new Student(17,"survish","kumar","amrinagar");
	    
	    Student s2 = new Student(18,"rekha","sharma","patna");
	    
	    Student s3 = new Student(19,"shiva","yadav","ganganagar");
	    
	    
	        /* s1.setId(17);
             s1.setFname("survish");
             s1.setLname("kumar");
             s1.setCity("amrinagar");*/

             JdbcDao dao = new JdbcDao();
               try {
            	   
            	   dao.getAllStudents();
            	 List<Student>nlist= dao.getAllStudentList();
            	 
//            	 System.out.println(nlist.toString());
            	 
            	 for(Student stud:nlist) 
            	 {
            		 System.out.println(stud);
            	 }
//            	   
            	  /* dao.addStudent(s2);
            	   dao.addStudent(s3);*/
            	   
//			Student stude= dao.getSStudent(s1);
//			System.out.println(stude.toString());
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
             
		
		

	}

}
