import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
    // Arrays are equal or not without using Arrays.equals
		
		
		int[] a = {1,2,3} ;
		int [] b = {1,2,3} ;
		int [] c = {4,5,6,7} ;
		boolean status = true;
		
		if(a.length== b.length)
		{
			for(int i =0 ;i<a.length-1;i++)
			{
				if(a[i]!=b[i])
					status = false;
			}
			
			
		}
		else
		{
			status = false ;
		}
		System.out.println("Status is " +status);
	
	}
	}
