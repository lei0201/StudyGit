package com.lei.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestSystem5 {
	public static void main(String[] args) {
		murgeFile("f:/", "2.gif");
	}
	private static void murgeFile(String filder,String fileName ) {
		
		File fileHe=new File(filder, fileName);		
			try(FileOutputStream fos=new FileOutputStream(fileHe);){
			int index=0;
			while (true) {
				File eachFile=new File(filder, (index++)+"_"+fileName);
				if(!eachFile.exists()) {
					break;
				}
				try(FileInputStream fis=new FileInputStream(eachFile);){
				byte[] eachContent=new byte[(int) eachFile.length()];
				fis.read(eachContent);
				fis.close();
				fos.write(eachContent);
				fos.flush();}
				
				System.out.printf("把子文件%s写出到目标文件到中%s%n",eachFile.getName(),fileHe.getName());
				if(fos==null) {System.out.println("ok");}
				
			
			}
			System.out.printf("最后目标文件的大小%d字节",filder.length());
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
