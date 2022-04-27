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

    // iTERATE hASHmAP  1) CREATE MAP 2) MAP.GET AND KEY
	  
	  HashMap<String, String>  map = new HashMap<>() ;
	  map.put("Key 1", "Value 1") ;
	  map.put("Key 2", "Value 2");
	  for(String key: map.keySet())
	  {
		  System.out.println("key" +key + "value" +map.get(key));
		  
	  }
	}
	}

/*
 * Output
 * / by zero
Alway on
 * 
 */
	
	
	
	
	
	
	
