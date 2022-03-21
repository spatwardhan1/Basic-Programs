import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import org.apache.commons.lang3.RandomStringUtils;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import java.awt.FlowLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
		
		// put is used to insert all the elements in map

   HashMap<String ,Integer>	map = new HashMap<>() ;
   map.put("JAVA", 001);
   map.put("Spring", 003);
   map.put("Collections", 002);
   
   System.out.println(map);
   
   
   System.out.println("using for each");
   
   map.forEach((e1,e2)-> {
   System.out.println(e1+ "=>" + e2);}
		   
		   );
		
   
   // get Each ELement
   
   System.out.println("Course Java" +map.get("JAVA"));
	}
	}
	
	
	
	
	
	
	
