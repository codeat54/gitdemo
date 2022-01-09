package demo.threadsdemo;

public class Demo
{
   public  void printDocuments() 
   {
	   for(int i =1;i<=5;i++) {
	   System.out.println(Thread.currentThread().getName()+"-"+"printing documents:"+ i);
      }
   }
}
