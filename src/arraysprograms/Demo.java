package arraysprograms;

import java.util.Arrays;

public class Demo
{
    
	public static void main(String[] args)
	{
		
	  /*
	   * 
	   * linear search program
	   * printing the number and its index 
	   * ******************** 
	   * int[] values = {2,6,3,9,7,15,11,18,5};
	   
	       int num=5;
	     
	    for(int i=0;i<values.length;i++) 
	    {
	    	if(values[i]==num) 
	    	{
	    		System.out.println("element is-"+num +","+"index is-"+i);
	    		
	    		
	    	}
	    	*************************/
		
		/*****binary search in a array*******
		int[] values = {2,3,5,7,8,11,18,20};
		 
		  
		  int num = 5;
		  
		 int first = 0;
		 int last = values.length-1;
		 int mid;
		  
		  mid=first+last/2;
		  
		  while(first<=last)
		  {
			  
		  
		  if(values[mid]==num) 
		  {
			  System.out.println("index is-"+ mid+","+"number is-"+num);
			  break;
		  }
		  
		  else if (values[mid]<num) 
		  {
			first=mid+1;
		   }
		  else
		  {
			last=mid+1;
		}
		  
		  mid=first+last/2;
		
		  }
	    	
		  if(first>last) 
		  {
			  System.out.println("element not found");
		  }
		  **************/
		
		/*****sorting array using bubble sort******/
		
		int[] values = {2,6,3,9,7,15,11,18,5};
		
	

		int l = values.length;
		
		for(int i=0;i<l-1;i++) 
		{
			for(int j=0;j<l-1-i;j++)
			{
				int temp;
				temp=values[j];
				values[j]=values[j+1];
				values[j+1]=temp;
				
			
			
		}
	}	
	
			
		
		
		
		
		
		
	    }   
	       
}        
		
		
		
	
	
	

