package com.UT.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileService {

	static File fileObj =null;
	public static File createFileObject(String dir) throws IOException
	{
	 
	fileObj	=new File(dir+"\\filename.txt");		
	fileObj.createNewFile();
	return fileObj;
	} 
	

}
