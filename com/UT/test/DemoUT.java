package com.UT.test;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DemoUT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sb= new Scanner(System.in);
		int line;
		
		Runtime r= Runtime.getRuntime();
		double mb = 1000000;
		 System.out.println("Max memory"
                 + " " + r.maxMemory()/mb);
		 System.out.println("Initial memory"
                 + " " + r.totalMemory()/mb);
	      System.out.println("Free memory"
                  + " " + r.freeMemory()/mb);
		do{
			System.out.println("Please enter number between 1-230 : ");
			line =sb.nextInt();
		}while(line <1 || line>230);
		
		File fileObj = new File("C:\\Users\\Twinkle_Urade\\filename.txt");	
		
		try
		{
			fileObj.createNewFile();
			FileWriter writerObj = new FileWriter("C:\\Users\\Twinkle_Urade\\filename.txt");
			
			String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			         + "abcdefghijklmnopqrstuvxyz";
			
			StringBuilder sb1;
			
			for(int i=0;i<line;i++)
			{
				sb1 = new StringBuilder(100);
				for(int j=0;j<100;j++)
				{
					  int index
					    = (int)(AlphaNumericString.length()
					      * Math.random());
					  sb1.append(AlphaNumericString
						      .charAt(index)); 
					  				
				}
				
				writerObj.write(sb1.toString()+"\n");
				sb1.setLength(0);
			}
			
			writerObj.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			sb.close();
		}
		
		
        System.out.println(
                "Consume memory"
                + " "
                + (r.totalMemory() - r.freeMemory()) / mb);


	}

}
