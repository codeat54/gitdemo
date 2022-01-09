package coredemo11;

import java.util.Comparator;

public interface check
{
	void bb();
	
	 default void cc() 
	{
		System.out.println("cc");
	}
}
