import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
  // reverse each word from String
	  String s = "Welcome to JAVA";
	  String[] words = s.split("\\s");
	  String rev = "" ;
	  // take each word
	  for(String w:words)
	  {
		  StringBuilder b = new StringBuilder(w);
		  // reverse each word
		  b.reverse();
		  // store in rev and after each word put space
		  rev =rev + b.toString() + " ";
	  }
	  
	  System.out.println("Reverse String is" +rev);
	   }
	}
	
	
	
	
	
	
	
