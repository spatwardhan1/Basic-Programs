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

// create Custom Exception Class
class AgeInvalidException  extends Exception {
	public AgeInvalidException() {
		// TODO Auto-generated constructor stub
		// pass to parent class Exception
		super("Age is invalid");
	}
}

public class Basics {

	public static void main(String[] args)
	{
		
		// put is used to insert all the elements in map
  int a= 10, b= 0 ;
     try  {
    	 //int c = a/b ;
    	 //System.out.println("message in C is" +c);
    	 
    	 if(a>=10)
    	 {  // throw to Custom Exception class
    		 throw new AgeInvalidException();
    	 }
    		 
    	 
     }catch(Exception e)
     {
    	 System.out.println(e.getMessage());
    	 
     }
     finally {
    	 
    	 System.out.println("Alway on");
     }
	}
	}

/*
 * Output
 * / by zero
Alway on
 * 
 */
	
	
	
	
	
	
	
