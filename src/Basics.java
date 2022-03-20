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
		
		List<Integer>  list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println("New List"+list);
	   // create stream
		Stream<Integer> stream = list.stream();
		// preform operation on stream
		// filter to add boolean condition
		// and finally collected the filtered elements into List
		List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(" List afete stream" +newList);
	
	}
	}
	
	
	
	
	
	
	
