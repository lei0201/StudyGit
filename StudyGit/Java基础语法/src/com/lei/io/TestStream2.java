package com.lei.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream2 {
	public static void main(String[] args) {
		try {
		//准备文件地址
		File f=new File("C:\\Users\\Administrator\\Desktop\\1.txt");
		byte[]a= {66,67,123,123,22,44,12};		
		FileOutputStream fs=new FileOutputStream(f);
		fs.write(a);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
