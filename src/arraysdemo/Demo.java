package arraysdemo;
//coming from github
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Demo {

	public static void main(String[] args)
	{
		
	    List<String>mylist = new ArrayList<String>();
	        
	          mylist.add("A");
	          mylist.add("B");
	          mylist.add("C");
	          mylist.add("D");

	          System.out.println(mylist);
	          
	       Object[]myrr = mylist.toArray();   
	          
	       for (Object o : myrr) 
	       {
	    	   System.out.println(o);
	       }
	          
	       String[]val = new String[mylist.size()];
	          
	                mylist.toArray(val);
	       
	          
	         
	}
	
	

		
		
		
		
		
 
}
