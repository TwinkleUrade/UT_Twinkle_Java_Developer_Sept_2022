package com.UT.test;

import java.io.File;
import java.util.Scanner;

public class StartApplicationService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sb= new Scanner(System.in);
		int line;
		
		do{
			System.out.println("Please enter number between 1-230 : ");
			line =sb.nextInt();
		}while(line <1 || line>230);

		System.out.println("Please enter directory where you wish to create file : ");
		
		String dir= sb.next();
		
		try
		{
			File fileObj = CreateFileService.createFileObject(dir);
			boolean fileWritten= WriteFileService.writeFile(line,fileObj);
			if(fileWritten)
			{
				System.out.println("File written successfully");
			}
			else
			{
				System.out.println("File empty");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			sb.close();
		}
		
		
		
		
		
		
		
	}

}
