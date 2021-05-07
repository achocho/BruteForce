package BruteForce;

import java.util.*;


import BruteForce.NestedFor.IAction;

import java.io.*;

public class BruteForce {

	public static void main(String[] args) throws Exception{
		
		FileWriter writer=new FileWriter(System.getProperty("user.home")+"\\Desktop\\com.txt");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter min length of the passwords!!");
		int Min=scan.nextInt();
		System.out.println("Enter max length of the passwords!!");
		int Max=scan.nextInt();
System.out.println("option 1:only numbers");
System.out.println("option 2:only big letters");
System.out.println("option 3:only small letters");
System.out.println("option 4:all character");
int option=scan.nextInt();
	    for (int i = Min; i <= Max; i++) {
		
	        final int depth = i;
	        IAction testAction = new IAction() {
	            public void act(int[] indices) {
	                for (int i : indices)
	                { System.out.print((char)i+" "); try {
						writer.write((char)i);
					} catch (IOException e) {
					
						e.printStackTrace();
					}
	                }
	                try {
						writer.write(System.getProperty("line.separator"));
					} catch (IOException e) {
						e.printStackTrace();
					}
	                System.out.println();
	            }
	        };
	        if(option==1) {
	        NestedFor nf = new NestedFor(49, 58, testAction);
	        nf.nFor(depth);
	        }else if(option==2) {
	        	
		        NestedFor nf = new NestedFor(65, 91, testAction);
		        nf.nFor(depth);
		        }else if(option==3) 
		        {
		        	 NestedFor nf = new NestedFor(97, 123, testAction);
				        nf.nFor(depth);	
		        	
		        }else if(option==4)
		        {
		        	 NestedFor nf = new NestedFor(33, 127, testAction);
				        nf.nFor(depth);	
		        	
		        }
		        else 
		        {
		        	System.out.println("Enter valid option!!");
		        	return;
		        	
		        } 
	        
	    }
	writer.close();
	}
}
