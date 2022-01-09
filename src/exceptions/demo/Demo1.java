package exceptions.demo;

public class Demo1 implements AutoCloseable 
{

	@Override
	public void close() throws Exception
	{
	   System.out.println("closing demo1");	
	   
	   throw new Exception("Exception in closing");
		
	}

}
