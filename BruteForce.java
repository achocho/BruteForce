package BruteForce;
import java.util.*;
import java.io.*;
public class BruteForce {

	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter min Length of the passwords!!!");
		int Min=scan.nextInt();
		System.out.println("Enter max Length of the passwords!!!");
		int Max=scan.nextInt();
	FileWriter writer=new FileWriter(System.getProperty("user.home")+"\\Desktop\\com.txt");
	String[] word=new String [Min];
	String temp="";

	int looper=Min;
	int size=0;
	int size1=0;
	int size2=0;
	int size3=0;
	String tem="";
	String tem1="";
	String tem2="";
	String tem3="";
	while(looper<=Max) {
		for(int i=0;i<word.length;i++) 
		{
			temp+=(char)(33);
			word[i]=temp;
			temp="";
			
		}
	 size=word.length-4;
	 size1=size+1;
	 tem1="";
	 tem="";
 tem2="";
 size2=size+2;
size3=size+3;
 tem3="";
	while(size>=0) 
	{
		for(int z=33;z<127;z++) {
			tem1+=(char)(z);
			
			word[size]=tem1;
			
		
				
			
			tem1="";
		for( int i=33;i<127;i++) 
		{
			
			tem+=(char)(i);
		
			word[size1]=tem;
			
		
				
			
			tem="";
for(int x=33;x<127;x++) {
	tem2+=(char)(x);
	
	word[size2]=tem2;
	

		
	
	tem2="";
	for(int y=33;y<127;y++) {
		tem3+=(char)(y);
		
		word[size3]=tem3;
		

			
		
		tem3="";
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
		

			
		}
	
	if(size==size1) 
	{
		size--;
		size1=word.length-3;
		size2=word.length-2;
	
		
	} else if(size1>=0&&size1==size2) {
		
		size1--;
		size2=word.length-2;
		
	}
	else if(size2>=0&&size2==size3) 
	{
		size2--;
		size3=word.length-1;
	}
	else if(size3>=0) 
	{
		size3--;
		
	}
	}
if(Min<Max) 
{
	Min++;
	word=new String [Min];
}

	looper++;
	
	}
	writer.close();

	}
	}
	

