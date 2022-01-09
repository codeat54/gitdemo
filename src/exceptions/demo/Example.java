package exceptions.demo;

public class Example
{
   public static void main(String[] args)throws Exception
   {
	  
	 try(Demo1 demo = new Demo1()) 
	 {
		 
		 System.out.println("in try block");
     
		// throw new Exception("try exception");
	 }  
	 
	 catch(Exception ex) 
	 {
		 System.out.println(ex.getMessage());
		 throw new Exception();
	 }
	 
	 finally 
	 {
		System.out.println("in finally");
	 }
	 
	 
	 
	   
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
	
	
	
	}
