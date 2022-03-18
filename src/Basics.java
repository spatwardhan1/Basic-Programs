import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;
import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
   // Read from FIle
		File file = new File("C:\\Users\\SP\\Downloads\\Test.txt");
	
		try {
		Scanner scan = new Scanner(file);
		// Z will match every line
		scan.useDelimiter("\\Z");
		System.out.println(scan.next());
		}catch(Exception e)
		{
			System.out.println("FIle Incorrect path");
			
		}

	}
	}
	
	
	
	
	
	
	
