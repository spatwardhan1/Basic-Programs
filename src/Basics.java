import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
   // sum of numbers from array
		
	   int[] a = {1,2,3} ;
	   
	   for(int i = 0;i<=a.length-1;i++)
	   {
		   
		   if(a[i]%2 ==0)
		   {
			   System.out.println("Even Number is "+a[i]);
		   }
		   else
		   {
			   System.out.println("Odd Number is " +a[i]);
		   }
	   }
	}
	}
