import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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
		
   // type safe ->  same type of elements
		
		ArrayList<String>  str = new ArrayList<>();
		
		str.add("Soham");
		str.add("Patwardhan");
		str.add("Sachin");
		System.out.println(str);
		// get from zero th Index
		System.out.println(str.get(0));
		
		// remove Sachin 
		str.remove("Sachin");
		// get size after removing Sachin
		System.out.println("Size" +str.size());
		
		// Check if Sachin Present
		System.out.println("Checking Sachin present" +str.contains("Sachin"));
		
		// check if EMpty 
		
		System.out.println("CHecking empty or Not" +str.isEmpty());
		
		// setting value for 1st element
		str.set(1, "SP");
		
		
	
		System.out.println("str by setting" +str);
		// add will push the current  elemetn  to next and add at the iven index
		str.add(1, "SP NEW");
		System.out.println(str);
		// clear to remove all elements
	;
		
		// un type safe -> not a same type of elements
		
	   LinkedList  list = new LinkedList();
	   // can have any type of vars
	   list.add("Sachin");
	   list.add(1.00);
	   list.add(true);
	   System.out.println(list);
		
	   
	   
	   
	  System.out.println("_____________________________");
	  
	  TreeSet  tree = new TreeSet();
	  System.out.println("Tree Set Values");
	  tree.add(14.14);
	  tree.add(13.12);
	  System.out.println(tree);
	  
	 
		
	}
	}
	
	
	
	
	
	
	
