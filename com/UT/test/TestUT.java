package com.UT.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class TestUT {


	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCreateFile() {
		
		String dir="C:\\Users\\Twinkle_Urade\\new\\new2";
		File fileObj;
		try {
			//assertEquals("Creating file ",fileObj,CreateFileService.createFileObject(dir));
			fileObj= CreateFileService.createFileObject(dir);
			assertTrue("File exists",fileObj.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void testWriteFile()
	{
		int line=70;
		String dir="C:\\Users\\Twinkle_Urade\\new\\new2";
		File fileObj=new File(dir+"\\filename.txt");
		try {
			fileObj.createNewFile();
			assertEquals("Writing file ",true,WriteFileService.writeFile(line,fileObj));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
