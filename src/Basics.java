import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
   // generate factorial
		
		int num = 5 ;
		int f = 1 ;
		
		for(int i=1;i<=num;i++)
		{
			f = f*i ;
		}
		
		System.out.println("Factorial of Number " +num + "is " +f);
	}
  	
		
	}
