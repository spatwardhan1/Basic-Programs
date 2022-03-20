import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.Object;

public class Basics {

	public static void main(String[] args)
	{
		
		// create interface and  select un implemented methods
    MyInter i = new MyInter() {

		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("hello");
		}
    	
    };
    
    
    i.sayHello();
    
	}
	}
	
	
	
	
	
	
	
