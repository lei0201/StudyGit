package com.lei.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//FileReader 是Reader子类，以FileReader 为例进行文件读取
public class FileReaderText {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\Administrator\\Desktop\\menagerie.txt");
		try (FileReader fr=new FileReader(f)){
			char []all=new char[(int) f.length()];
			fr.read(all);
			for(char a:all) {
				System.out.println(a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
