package coredemo11;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Demo1 implements Executor

{

	
	 
	
	     public static void main(String[] args)
	     {
             Executor ex = Executors.newFixedThreadPool(3);
             
                    ex.execute(new Emp());
	     }  	 
		  
        Emp e1 = new Emp();
		public void execute(e1)
		{
			 e1.run();
			  
		}
	     
	     
	
	
    		   }

	      
	
	
	
	
	          
	              
	          
	
		     
	
		
	
	

	      
	   
	
	

