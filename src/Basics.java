import java.util.* ;
import javax.swing.JFrame;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;



public class Basics {

  public static void  main(String[] args) {

	// TODO Auto-generated method stub

    // sort  map using key
	  
	  // mastwe branch test changes
	  HashMap<Integer, String>  map = new HashMap<>() ;
	  map.put(2, "second") ;
	  map.put(1, "first");
	  map.put(3, "third");
	  
	  
	  // create Tree Map 
	  
	  Map<Integer, String > t = new TreeMap<>(map) ;
	  // create Set
	  
	  Set s = t.entrySet();
	  // create Iterator
	  Iterator it = s.iterator() ;
	  
	  // Iterate
	  while( it.hasNext())
	  {
		  // create entry pair
		  Map.Entry pair = (Map.Entry) it.next();
		  // print keys 
		  System.out.println(pair.getKey());
		  System.out.println(pair.getValue());
	  }
	  
	  
	  
   
	}


	  // File Writer to write from File
	  
	  // Read from FIle
		File file = new File("C:\\Users\\SP\\Downloads\\Test.txt");
  /// feature branch is this  
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


/*
 * Output
 * / by zero
Alway on
 * 
 */
	
	
	
	
	
	
	
