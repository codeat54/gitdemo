package coredemo11;

import java.util.Comparator;

public class LastNameComp implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2)
	{
	 	
	   return e1.getLname().compareTo(e2.getLname());	
	}

	
	
	
	
	
	
}
