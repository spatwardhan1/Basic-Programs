import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
   // File Writer to write from File
		try {
		FileWriter file = new FileWriter("C:\\Users\\SP\\Downloads\\Test.txt");
	  BufferedWriter w = new BufferedWriter(file);
	  w.write("New Word one");
	  w.write(" writing word 2");
	  // remeber to close buffer writer
	  w.close();
	  System.out.println("written ");
		}catch(Exception e)
		{
			System.out.println("Unhandle Exception");
		}
	}
	}
	
	
	
	
	
	
	
