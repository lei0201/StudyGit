package com.lei.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author Administrator
 *InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
	FileInputStream 是InputStream子类，以FileInputStream 为例进行文件读取
 */
public class TestStream {
public static void main(String[] args) {	
	try {
		File io=new File("C:\\Users\\Administrator\\Desktop\\1.txt");
		FileInputStream fs=new FileInputStream(io);
		byte [] all= new byte[(int) io.length()];
		fs.read(all);		
		for(byte a:all ) {
			System.out.println(a);
			}
		fs.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}
