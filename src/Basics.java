import java.util.Arrays;
import java.util.Collections;
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
		
	   // creating window
		
		JFrame frame = new JFrame("This is window Name");
		
		// add button
		JButton button = new JButton("Click Me");
		// add Action Listner method which will give the response after clicking the button
		button.addActionListener(e ->{
			System.out.println("Button Clicked");
			// pop up Option using Joption Pane
			JOptionPane.showMessageDialog(null, "Hello Clicked on Button Click Me");
		}
				);
		frame.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
	}
	}
	
	
	
	
	
	
	
