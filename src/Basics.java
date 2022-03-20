import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
		
	List<Integer>  list = new ArrayList<>() ;
	List<Integer>  list3 = Arrays.asList(23, 22,10,5);
	for(int i: list3)
	{
		if(i%2 == 0)
		{
			list.add(i);
			System.out.println("  Is Even Number");
		}
		else 
		{
			System.out.println(" Not A Even ");
		}
	}
	
	System.out.println("list 1" + list);
	
	}
	}
	
	
	
	
	
	
	
