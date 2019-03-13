package com.lei.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Administrator\\Desktop\\menagerie.txt");
		try (FileWriter fw=new FileWriter(f)){
			String str="hello world";
			char []all=str.toCharArray();
			fw.write(all);
			System.out.println("载入成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
