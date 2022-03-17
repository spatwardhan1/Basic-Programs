import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
   // sum of numbers from array
		
		int[] a = {5,2,4,5} ;
		int sum  = 0 ;
		// each time each value of a will be assigned to  val and add to sum
		// enhanced for loop 
		for(int val: a)
		{
			
		sum = sum + val;
		
		
		}
		
	 System.out.println(" Sum of all numbers from array" +sum);
  	
	}
	}
