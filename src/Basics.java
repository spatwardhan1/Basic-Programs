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
		
    // filter is condition and map is operation for each element
		
		List<Integer> numbers = Arrays.asList(10,20);
		List<Integer> newN = numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newN);
	}
	}
	
	
	
	
	
	
	
