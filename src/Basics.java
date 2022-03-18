import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
    // replace all white space
		
		String str = "JAVA  MAVA is";
		// split the string by array and put in string Array
    String strArray[] = 	str.split("\\W+");
    System.out.println(" String length without space" +strArray.length);
		
	   }
	}
	
	
	
	
	
	
	
