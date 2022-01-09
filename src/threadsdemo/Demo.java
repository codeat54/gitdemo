package threadsdemo;

public class Demo implements Runnable
{ 
	First first;
	
	public Demo(First first) 
	{
		this.first=first;
	}
    
     
	
	public void run() 
	{
	System.out.println("in run method");
	  first.increment();
	
	}
	
	public static void main(String[] args)
	{
		First f = new First();
	   Demo d = new Demo(f);
	   
	   Thread t1 = new Thread(d);
	   Thread t2 = new Thread(d);
	   
	       t1.start();
	     t2.start();
	}
	
	
}
