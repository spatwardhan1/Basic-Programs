import java.util.* ;
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
	}

/*
 * Output
 * / by zero
Alway on
 * 
 */
	
	
	
	
	
	
	
