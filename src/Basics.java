import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
   // find maximum element in array
		
		// a[i]> max
		
		
		int a[] = {10,20,30,40};
		
	   int search = 10 ;
	   boolean flag = false ;
	   
	   for(int i=0;i<=a.length-1;i++)
	   {
		   if(search == a[i])
		   {
			   System.out.println("element found at" +i);
			   flag = true ;
			   break;
		   }
		   
		   
	   }
	   if(flag == false) {
	   System.out.println("Element Not found");
	   }
	}
	
	
	
	
	
	
	}
