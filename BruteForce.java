package BruteForce;
import java.util.*;
import java.io.*;
public class BruteForce {

	public static void main(String[] args) throws Exception{
	FileWriter writer=new FileWriter("C:\\Users\\achoc\\Desktop\\com.txt");
	String[] word=new String [26];
	String temp="";
	for(int i=0;i<word.length;i++) 
	{
		temp+=(char)(97);
		word[i]=temp;
		temp="";
		
	}
	int size=word.length-3;
	int size1=size+1;
	String tem1="";
	String tem="";
String tem2="";
int size2=size+2;
	while(size>=0) 
	{
		for(int z=0;z<3;z++) {
			tem1+=(char)(z+97);
			
			word[size]=tem1;
			
		
				
			
			tem1="";
		for( int i=0;i<3;i++) 
		{
			
			tem+=(char)(i+97);
		
			word[size1]=tem;
			
		
				
			
			tem="";
for(int x=0;x<3;x++) {
	tem2+=(char)(x+97);
	
	word[size2]=tem2;
	

		
	
	tem2="";
	
			for(int j=0;j<word.length;j++) 
			{
				writer.write(word[j]);
				System.out.print(word[j]);
				
				
				
			}
			writer.write(System.getProperty("line.separator"));
System.out.println();
		}
		}
		

			
		}
	
	if(size==size1) 
	{
		size--;
		size1=word.length-2;
		size2=word.length;
	
		
	} if(size1>0&&size1==size2) {
		
		size1--;
		size2=word.length;
	}
	if(size2>0) 
	{
		size2--;
		
	}
	}
	writer.close();
	
	
	}

	}
	

