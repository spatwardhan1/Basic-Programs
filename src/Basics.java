import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
   // find maximum element in array
		
		// a[i]> max
		
		
		int a[] = {10,20,30,40};
		
		int max = 0 ;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max = a[i];
		}
		
		System.out.println(" max value " + max);
		
		int min = a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
				min = a[i];
		}
		
		System.out.println("Minimum element" + min);
	}
	
	
	
	
	
	
	}
