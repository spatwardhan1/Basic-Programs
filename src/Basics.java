import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
    // sort in reverse order use Collections.reverorder
		// print Arrays.to String
		
		Integer a[] = {10,20,30,40};
		System.out.println("Arrays Before Sorting"+Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Arrays After Sorting"+Arrays.toString(a));
    
	   }
	}
	
	
	
	
	
	
	
