import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
		
   // creating Stream
		
		
		// using STring Array
		// create string Array
		String names[]  = {"ABC","PQR", "XYZ"};
		// Stream.of and pass array 
	   Stream<String> st = Stream.of(names);
	   // use for Each a-> syso(a)  to print the elements
	   st.forEach(a-> {
		   System.out.println("Priniting elements"+a);
	   });
	}
	}
	
	
	
	
	
	
	
