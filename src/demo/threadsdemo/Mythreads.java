package demo.threadsdemo;

public class Mythreads extends Thread
{       
	Demo demo;
	
	public Mythreads(Demo demo) 
	{
		this.demo=demo;
	}
	
	public void run() 
	{ 
	     demo.printDocuments();	
	}
	
   	  
	
	public static void main(String[] args)
	{   
	    System.out.println("starting application");
	    Demo d1 = new Demo();
	    Mythreads t1 = new Mythreads(d1);
	          t1.setName("A");
	          Mythreads t2 = new Mythreads(d1);
	          t2.setName("B");
	     t1.start();
	    t2.start();
	    try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println("ending application");
		       
	}
	

}
