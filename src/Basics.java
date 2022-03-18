import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
    // regex to remove unnecessary characters
		// replaceall() apart from this delete all
		
		String s ="? lating12B";
		//replace all other than alplabets and DIgits with space
		s= s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(" New String" +s);
	   }
	}
	
	
	
	
	
	
	
