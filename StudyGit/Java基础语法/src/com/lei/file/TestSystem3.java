package com.lei.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestSystem3 {
	
	public static void main(String[] args) {
		try {
	File f=new File("F:A/B/C/D/E/F/G/H/I/J/K/L/M/N/O/P/Q/V/W/X/Y/Z/1.txt");
	File dir=f.getParentFile();
	if(!dir.exists()) {
		dir.mkdirs();
	}
	byte a[]= { 49,56};
	
		FileOutputStream fos=new FileOutputStream(f);
		fos.write(a);
		fos.close();
		System.out.println("ok");
		}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
}
