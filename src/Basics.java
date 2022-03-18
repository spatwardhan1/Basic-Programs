import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
    // replace all white space
		
		String str = " JAVA  MAVA";
		// length after remove A
		int remo=str.replace("A","").length();
		// Total - Remove A
		int total = str.length()-remo;
		
		System.out.println("Num of Char" +total);
		
	   }
	}
	
	
	
	
	
	
	
