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
		
  // sorted to sort the elements
		
		List<Integer> numbers = Arrays.asList(10,20, 40, 30);
		numbers.stream().sorted().forEach(System.out::println);
		//System.out.println(newN);
		
		
		//min  and get for getting single element		
		Integer inte = numbers.stream().min((x,y)-> x.compareTo(y)).get();
		System.out.println("min element");
		System.out.println(inte);
		
		// max
		Integer inteM = numbers.stream().max((x,y)-> x.compareTo(y)).get();
		System.out.println("max element");
		System.out.println(inteM);
		
		
		
	}
	}
	
	
	
	
	
	
	
