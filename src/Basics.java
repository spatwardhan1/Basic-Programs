import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
	// generate Random Number
		Random rand = new Random() ;
		
		int a = rand.nextInt() ;
		double d = rand.nextDouble();
		//String s  = rand.toString();
		
		
		System.out.println("Random Number " +a + "Random Double" +d );
	   
		// Download commons-lang3-3.12.0-bin.zip  from https://commons.apache.org/proper/commons-lang/download_lang.cgi
		
		// after that Random String Utils will work
		String random = RandomStringUtils.randomNumeric(5);
		System.out.println("Random String " +random);
	}
  	
		
	}
