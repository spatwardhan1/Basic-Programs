import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
    // Arrays are equal or not without using Arrays.equals
		// calculate sum of array and calculate sum of i elements
		// find the difference between array
    int sum1  =  0;
    int sum2 = 0 ;
    int[] a= {1,2,4};
    for(int i =0 ;i<=a.length-1;i++)
    {
    	sum1 =sum1 +a[i];
    }
    
    System.out.println("a[i]"+a[a.length-1]);
    // use i to add sum2 
    for(int i =0 ;i<=a[a.length-1];i++)
    {  //System.out.println("Sum value each Iteration"+sum2);
    	sum2 =sum2 +i;
    }
    
    
    System.out.println(" Sum 2 is" +sum2);
	// use brackets for sum2-sum1
    System.out.println("Missing Numbee is " + (sum2-sum1));
	}
	}
