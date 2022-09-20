package com.UT.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileService {
	
	public static boolean writeFile(int line,File file) throws IOException
	{
		FileWriter writerObj = new FileWriter(file.getAbsolutePath());	
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
		
		if(file.length() !=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
