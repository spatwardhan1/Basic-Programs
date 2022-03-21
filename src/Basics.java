import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		
    ArrayList<String>  list = new ArrayList<>();
    list.add("Soham");
    list.add("Patwardhan");
    list.add("ABCD");
    
    // call the Iterator method and pass to Object
    
    Iterator<String>  itr = list.iterator();
    
    System.out.println("Iterator calling");
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
    
    // backward Traversal using List Iterator and give size so the last ele is pointed
    System.out.println("Traversing in Reverse Order");
   ListIterator<String>  litr = list.listIterator(list.size());
   
   while(litr.hasPrevious())
   {
	   System.out.println(litr.previous());
   }
	  
	 
		
	}
	}
	
	
	
	
	
	
	
